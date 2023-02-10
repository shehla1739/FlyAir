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
import com.ksk.service.CustomerService;
import com.ksk.service.CustomerServiceImpl;
import com.ksk.service.FlightService;
import com.ksk.service.FlightServiceImpl;
import com.ksk.service.PaymentService;
import com.ksk.service.PaymentServiceImpl;

@WebServlet("/demo")
public class demoController extends HttpServlet{

	private static final long serialVersionUID = 5001242368926615663L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookingService bookingService =new BookingServiveImpl();
		
		CustomerService customerService=new CustomerServiceImpl();
		PaymentService paymentService = new PaymentServiceImpl();
		FlightService flightService=new FlightServiceImpl();
		AirlineService airlineService=new AirlineServiceImpl();
		
		
		 String message="shehla";
		// Set response content type
	    resp.setContentType("text/html");
	    // Actual logic goes here.
	    PrintWriter out = resp.getWriter();
	    out.println("<h1>" + message + "</h1>");
/*	    
	    //CREATE
	 // get booking  objects
	    int theId=4;
	 			Booking tempBooking1=bookingService.getBooking(theId);
	 			 out.println("<h3> Booking Details : " + tempBooking1 + "</h3>");
	 			 Customer tempCustomer1=customerService.getCustomer(theId);
	 			 Payment tempPayment1=paymentService.getPayment(theId);
	 			 Flight tempFlight1=flightService.getFlight(theId);
	 			// associate the objects		
	 			out.println("Booking Details : " + tempBooking1);
	 			out.println("Customer Details : " + tempCustomer1);
	 			out.println("Payment Details : " + tempPayment1);
	 			out.println("Flight Details : " + tempFlight1);
	 			
	 			//Set in Booking 
	 			tempBooking1.setCustomer(tempCustomer1);
	 			tempBooking1.setPayment(tempPayment1);
	 			tempBooking1.setFlight(tempFlight1);
	 			// save the Booking, 
	 			//Note: this will ALSO save the details object because of CascadeType.ALL
	 			out.println("Saving Booking: " + tempBooking1);
	 			bookingService.addBooking(tempBooking1);
	*/
	    //GET Objects
	   		
	    	
	    	int theId=4;
	    	Booking tempBooking = bookingService.getBooking(theId);
	    	Payment tempPayment=tempBooking.getPayment();
			Customer tempCustomer = tempBooking.getCustomer();
			Flight tempFlight = tempBooking.getFlight();			
			Airline tempAirline=tempFlight.getAirline();
			
			out.println("\n Booking Details : " + tempBooking);
			out.println("\n Customer : " + tempCustomer);
			out.println("\n Payment : " + tempPayment);
			
			out.println("\n Flight Details : " + tempFlight);
			out.println("\n Airlines Details : " + tempAirline);
	    
	  /*  
	    //DELETe instructor_Details
	    try {						
			// start a transaction
			session.beginTransaction();
			// get the instructor detail object
			int theId = 3;
			InstructorDetail tempInstructorDetail = 
					session.get(InstructorDetail.class, theId);			
			// print the instructor detail
			System.out.println("tempInstructorDetail: " + tempInstructorDetail);					
			// print  the associated instructor
			System.out.println("the associated instructor: " + 
								tempInstructorDetail.getInstructor());
			
			// now let's delete the instructor detail
			System.out.println("Deleting tempInstructorDetail: " 
											+ tempInstructorDetail);
			// remove the associated object reference
			// break bi-directional link			
			tempInstructorDetail.getInstructor().setInstructorDetail(null);			
			session.delete(tempInstructorDetail);			
			// commit transaction
			session.getTransaction().commit();
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			// handle connection leak issue
			session.close();			
			factory.close();
		}
	    */
	}
}
