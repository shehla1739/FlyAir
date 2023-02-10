package com.ksk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ksk.entities.Airline;
import com.ksk.service.AirlineService;
import com.ksk.service.AirlineServiceImpl;
@WebServlet("/adminListOfAirline")
public class AdminListOfAirlinesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); 
			
		AirlineService airlineService=new AirlineServiceImpl();			
		List<Airline> airlines=airlineService.getAllAirline();
		//out.println("Airlines : " + airlines);
		
		req.setAttribute("airlines", airlines);
		req.getRequestDispatcher("adminListOfAirlines.jsp").forward(req, resp);	
	      
	}
/*
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
			PrintWriter out= resp.getWriter(); 
		      out.println("<B><BR>Hello");
		
		AirlineService airlineService=new AirlineServiceImpl();	
		
		List<Airline> airlines=airlineService.getAllAirline();
		out.println("Airlines : " + airlines);
	}
	*/
}
