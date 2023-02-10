package com.ksk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ksk.config.HibConfig;
import com.ksk.entities.Airline;
import com.ksk.entities.Flight;
import com.ksk.service.AirlineService;
import com.ksk.service.AirlineServiceImpl;

@WebServlet("/searchFlight")
public class UserSearchFlightController extends HttpServlet{
	private static final long serialVersionUID = 1L;
  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); 	
		//String trvelDate=req.getParameter("travelDate");
		String tempSource= req.getParameter("source");
		String tempDestination = req.getParameter("destination");
		int tempNoOfPassengers=Integer.parseInt(req.getParameter("noOfPassengers"));
		
		
		out.println( tempSource + " : " + tempDestination + " : " +tempNoOfPassengers);
		SessionFactory factory=HibConfig.getSessionFactory();		
		Session session=factory.openSession();
		
		//////In the HQL , you should use the java class name and property name of the mapped @Entity instead of the actual table name and column name , so the HQL should be 
		String hql = "FROM Flight f WHERE f.source = :source AND f.destination=:destination";
		Query query = session.createQuery(hql);
		query.setParameter("source",tempSource);
		query.setParameter("destination",tempDestination);
		List<Flight> flights = query.getResultList();
		//get details of airline result.getAirline()-forEach loop
		session.close();
		//out.println("List of available flights: <br> <br>" + flights);
		
		req.setAttribute("flights", flights);
		req.getRequestDispatcher("listOfFlights.jsp").forward(req, resp);	
	}
}
