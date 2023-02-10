package com.ksk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ksk.entities.Airline;
import com.ksk.entities.Booking;
import com.ksk.entities.Flight;
import com.ksk.service.AirlineService;
import com.ksk.service.AirlineServiceImpl;
import com.ksk.service.FlightService;
import com.ksk.service.FlightServiceImpl;

@WebServlet("/KSKFlight")
public class KSKFlightController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FlightService flightService = new FlightServiceImpl();
		AirlineService airlineService = new AirlineServiceImpl();
		
		String message ="Shehla";
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> " + message + "</h1>");
		
		/*
	    //CREATE		
	   
	    	java.util.Date javaDate = new java.util.Date();
	        java.sql.Date mySQLDate = new java.sql.Date(javaDate.getTime()); 
			out.println("<h1> " + mySQLDate + "</h1>");
			// get Airline from DB
	        int theId=1;
			Airline tempAirline1= airlineService.getAirline(theId);
			Airline tempAirline2= airlineService.getAirline(2);
			out.println(tempAirline3);

			// create some flights
			Flight tempFlight6 = new Flight(mySQLDate, "Ahmedabad", "Mumbai", 3, 6);
			Flight tempFlight7 = new Flight(mySQLDate, "Pune", "Mumbai", 1, 2);
			
			// add Flights to Airlines			
			tempAirline1.addFlight(tempFlight6);
			tempAirline2.addFlight(tempFlight7);
			// save the flights
			flightService.addFlight(tempFlight6);
			flightService.addFlight(tempFlight7);
	*/
		

		 //GET Objects	   			
	    /*
	    int tempId=2;
	     Airline tempAirline = airlineService.getAirline(tempId);
	     out.println("Airline details for  " + tempId +  ":  " +tempAirline);
	  // print  the associated booking
	  	out.println("the associated booking: " + tempAirline.getBooking());
		*/
		// get the Airline from db
			int theId = 2;
				
			Airline tempAirline=airlineService.getAirline(theId);
			out.println("\n Airline : " + tempAirline);
					
			// get flights for the Airline
			out.println("Flights: " + tempAirline.getFlights());
											
	}  //doPost
}  //class
	
