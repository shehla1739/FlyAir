package com.ksk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ksk.config.HibConfig;
import com.ksk.entities.Airline;
import com.ksk.entities.Booking;
import com.ksk.entities.Flight;
import com.ksk.service.AirlineService;
import com.ksk.service.AirlineServiceImpl;
import com.ksk.service.FlightService;
import com.ksk.service.FlightServiceImpl;

@WebServlet("/adminListOfFlight")
public class AdminListOfFlightController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); 
		FlightService flightService=new FlightServiceImpl();	
		AirlineService airlineService = new AirlineServiceImpl();
			
		List<Flight> flights=flightService.getAllFlight();
		out.println("<br> Flights : " + flights);
		
			
		req.setAttribute("flights", flights);
		req.getRequestDispatcher("adminListOfFlights.jsp").forward(req, resp);	
	      
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		FlightService flightService = new FlightServiceImpl();
		AirlineService airlineService = new AirlineServiceImpl();
		
		String message ="Shehla";
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> " + message + "</h1>");
		*/
	
		 //GET Objects	   			
	    /*
	    int tempId=2;
	     Airline tempAirline = airlineService.getAirline(tempId);
	     out.println("Airline details for  " + tempId +  ":  " +tempAirline);
	  // print  the associated booking
	  	out.println("the associated booking: " + tempAirline.getBooking());
		*/
		/*
		// get the Airline from db
			int theId = 2;				
			Airline tempAirline=airlineService.getAirline(theId);
			out.println("\n Airline : " + tempAirline);	
			// get flights for the Airline
			out.println("Flights: " + tempAirline.getFlights());
	*/	
	}  //doPost

}  //class
	
