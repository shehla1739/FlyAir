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
import com.ksk.entities.Booking;
import com.ksk.service.AirlineService;
import com.ksk.service.AirlineServiceImpl;
import com.ksk.service.BookingService;
import com.ksk.service.BookingServiveImpl;

@WebServlet("/adminListOfBooking")
public class AdminListOfBookingController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); 
			
		BookingService bookingService = new BookingServiveImpl();		
		List<Booking> bookings=bookingService.getAllBooking();
		out.println("Booking Details : " + bookings);
		
		req.setAttribute("bookings", bookings);
		req.getRequestDispatcher("adminListOfBooking.jsp").forward(req, resp);	
	      
	}
}
