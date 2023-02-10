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
import com.ksk.entities.Customer;
import com.ksk.entities.Flight;
import com.ksk.entities.Payment;
import com.ksk.service.AirlineService;
import com.ksk.service.AirlineServiceImpl;
import com.ksk.service.BookingService;
import com.ksk.service.BookingServiveImpl;
import com.ksk.service.FlightService;
import com.ksk.service.FlightServiceImpl;

@WebServlet("/KSKBookingFlight")
public class KSKBookingFlightController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookingService bookingService = new BookingServiveImpl();
		FlightService flightService = new FlightServiceImpl();
	
		String message = "Welcome to FlyAir";
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1> " + message + "</h1>");
		
		Booking tempBooking = bookingService.getBooking(1);
		Flight tempFlight = tempBooking.getFlight();
		out.println("\n Booking : " + tempBooking);
	//	Airline tempAirline=tempBooking.getAirline();
		Airline tempAirline=tempFlight.getAirline();
		Payment tempPayment=tempBooking.getPayment();
		Customer tempCustomer = tempBooking.getCustomer();
		//out.println("\n Airline : " + tempFlight);
		out.println("\n Customer : " + tempCustomer);
		out.println("\n Payment : " + tempPayment);
		
		out.println("\n Flight Details : " + tempFlight);
		out.println("\n Airlines Details : " + tempAirline);
		
	}

}
