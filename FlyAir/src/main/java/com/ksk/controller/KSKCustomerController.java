package com.ksk.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ksk.entities.Airline;
import com.ksk.entities.Booking;
import com.ksk.entities.Customer;
import com.ksk.service.BookingService;
import com.ksk.service.BookingServiveImpl;
import com.ksk.service.CustomerService;
import com.ksk.service.CustomerServiceImpl;

@WebServlet("/KSKCustomer")
public class KSKCustomerController extends HttpServlet{
	private static final long serialVersionUID = 5001242368926615663L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		BookingService bookingService=new BookingServiveImpl(); 
		CustomerService customerService=new CustomerServiceImpl();
		
		String message="shehla";
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    out.println("<h1>" + message + "</h1>");
	/*	
	    //CREATE		
	   
//	    	java.util.Date javaDate = new java.util.Date();
//	        java.sql.Date mySQLDate = new java.sql.Date(javaDate.getTime()); 	      
			// create the objects
//			Booking tempBooking1=new Booking(mySQLDate,mySQLDate);
	    
	    Booking tempBooking1 = bookingService.getBooking(4);
	    Booking tempBooking2 = bookingService.getBooking(5);
	    Booking tempBooking3 = bookingService.getBooking(6);
	    Booking tempBooking4 = bookingService.getBooking(7);
	    out.println("Booking details for  " + 4 +  ":  " +tempBooking1);
	    out.println("Booking details for  " + 5 +  ":  " +tempBooking2);
	    out.println("Booking details for  " + 6 +  ":  " +tempBooking3);
	    out.println("Booking details for  " + 7 +  ":  " +tempBooking4);
	    
		Customer tempCustomer1=new Customer("Agarwal", "Agarwal@gamil.com",910004567,32, "Pune", "Indian");
		Customer tempCustomer2=new Customer("Vivan", "Vivan123@gamil.com",910004567, 29, "Delhi", "Indian");
		Customer tempCustomer3=new Customer("Akshy", "Akshy23@gamil.com",910004567, 37, "Chennai", "Indian");
		Customer tempCustomer4=new Customer("C Reddy", "creddy@gamil.com",910004567, 29, "Hyderabad", "Indian");
		
			// associate the objects			
			tempBooking1.setCustomer(tempCustomer1);			
			tempBooking2.setCustomer(tempCustomer2);	
			tempBooking3.setCustomer(tempCustomer3);	
			tempBooking4.setCustomer(tempCustomer4);	
			// save the instructor, 
			//Note: this will ALSO save the details object because of CascadeType.ALL
			out.println("Saving Booking: " + tempBooking1);
			bookingService.addBooking(tempBooking1);
			bookingService.addBooking(tempBooking2);
			bookingService.addBooking(tempBooking3);
			bookingService.addBooking(tempBooking4);
*/
/*
	    //GET Objects
	    int tempId=6;
	    Booking tempbooking = bookingService.getBooking(tempId);
	    out.println("Booking details for  " + tempId +  ":  " +tempbooking);
	    // print  the associated Airline			
			out.println("the associated Customer: " + tempbooking.getCustomer());
			
	    /*
	    int tempId=2;
	     Airline tempAirline = airlineService.getAirline(tempId);
	     out.println("Airline details for  " + tempId +  ":  " +tempAirline);
	  // print  the associated booking
	  			out.println("the associated booking: " + tempAirline.getBooking());
	
    			////////////////////////////////////////////////////////////////////////
			SessionFactory factory=HibConfig.getSessionFactory();
			Session session=factory.openSession();
			try {						
				// start a transaction
				session.beginTransaction();
				// get the instructor detail object
				int theId = 3;
				Airline tempAirline = 
						session.get(Airline.class, theId);
				// print the instructor detail
				out.println("tempInstructorDetail: " + tempAirline);							
				// print  the associated instructor
			out.println("the associated booking: " + tempAirline.getBooking());				
				// commit transaction
				session.getTransaction().commit();				
				System.out.println("Done!");
			}
			catch (Exception exc) {
				exc.printStackTrace();
			}
			finally {
				// handle connection leak issue
				session.close();
				
				factory.close();
			}			
	}
	/////////////////////////////////////////////////////////////////////////////
	  
		*/
	}  //doPost
}  //class
	