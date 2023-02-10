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
import com.ksk.service.BookingService;
import com.ksk.service.BookingServiveImpl;
import com.ksk.service.CustomerService;
import com.ksk.service.CustomerServiceImpl;
import com.ksk.service.FlightService;
import com.ksk.service.FlightServiceImpl;
import com.ksk.service.PaymentService;
import com.ksk.service.PaymentServiceImpl;

@WebServlet("/processCustomerRegistration")
public class ProcessCustomerRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FlightService flightService=new FlightServiceImpl();
		CustomerService customerService = new CustomerServiceImpl();
		PaymentService paymentService =new PaymentServiceImpl();
		BookingService bookingService = new BookingServiveImpl();
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();		
		
		//get customer Details into Customer object		
		String name= req.getParameter("name");
		String email= req.getParameter("email");
		int phone= Integer.parseInt(req.getParameter("phone"));
		int age= Integer.parseInt(req.getParameter("age"));
		String address= req.getParameter("address");
		String nationality= req.getParameter("nationality");
		out.println("Customer Details : "+ name + ":"+ email + ":"+ phone + ":"+ age + ":"+ address + ":"+ nationality);
/*		
	//Get Payment Details
		String cardName= req.getParameter("cardName");
		int cardNo= Integer.parseInt(req.getParameter("cardNo"));
		String nameOnCard= req.getParameter("nameOnCard");
		int expireMonth= Integer.parseInt(req.getParameter("expireMonth"));
		int expireYear= Integer.parseInt(req.getParameter("expireYear"));
		int CVV = Integer.parseInt(req.getParameter("CVV"));		
		out.println("<br>Payment object : "  + cardName + ":" +cardNo + ":" +nameOnCard+ ":" +expireMonth+ ":" +expireYear+ ":" +CVV);
		
		Payment tempPayment = new Payment(cardName, cardNo, nameOnCard,expireMonth, expireYear, CVV);
		out.println("<br>Imp Payment Detaials for chosen flight -->" + tempPayment);
*/	
		Payment tempPayment1=new Payment("RuPay",4534345,"Amit",10,2024,431);
		out.println("<br>Flight object : " + req.getParameter("flightId"));
		int flightId = Integer.parseInt(req.getParameter("flightId"));
		
		//Create Flight object, Customer Object, Payment Object
		Flight tempFlight=flightService.getFlight(flightId);
		out.println("Imp Flight Detaials for chosen flight --> " + tempFlight);
		Airline tempAirline=tempFlight.getAirline();
		
		Customer tempCustomer=new Customer(name, email, phone, age, address, nationality);
		out.println("<br>Imp Customer Detaials for chosen flight -->" + tempCustomer);
		
		///////Create Booking for Customer
		// Create booking object
		java.util.Date javaDate = new java.util.Date();
		java.sql.Date mySQLDate = new java.sql.Date(javaDate.getTime()); 
		Booking tempBooking=new Booking(mySQLDate,mySQLDate);
			
		// save the flights
		tempAirline.addFlight(tempFlight);	
		//flightService.addFlight(tempFlight);
		tempBooking.setFlight(tempFlight);
		tempBooking.setCustomer(tempCustomer);
		tempBooking.setPayment(tempPayment1);
		
		//Save Booking
		bookingService.addBooking(tempBooking);
		req.setAttribute("bookingObj", tempBooking);
		req.setAttribute("bookingId", tempBooking.getId());
		req.getRequestDispatcher("bookingConfirmation.jsp").forward(req, resp);	
	}	
}
