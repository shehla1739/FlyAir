package com.ksk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ksk.entities.Booking;
import com.ksk.entities.Payment;
import com.ksk.service.BookingService;
import com.ksk.service.BookingServiveImpl;
import com.ksk.service.PaymentService;
import com.ksk.service.PaymentServiceImpl;

@WebServlet("/KSKPayment")
public class KSKPaymentController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	BookingService bookingService=new BookingServiveImpl();
	PaymentService paymentService = new PaymentServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message="shehla";
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    out.println("<h1>" + message + "</h1>");
	/*
	    //CREATE		
	   
	    	java.util.Date javaDate = new java.util.Date();
	        java.sql.Date mySQLDate = new java.sql.Date(javaDate.getTime()); 	      
			// create the objects
			Booking tempBooking1=new Booking(mySQLDate,mySQLDate);
			Payment tempPayment1=new Payment("RuPay",98765432,"Amaan",07,2026,123);
			// associate the objects			
			tempBooking1.setPayment(tempPayment1);						
			// save the Booking, 
			//Note: this will ALSO save the details object because of CascadeType.ALL
			out.println("Saving Booking: " + tempBooking1);
			bookingService.addBooking(tempBooking1);
*/
 
	    //GET Objects
	    int tempId=10;
	    Booking tempbooking = bookingService.getBooking(tempId);
	    out.println("Booking details for  " + tempId +  ":  " +tempbooking);
	    // print  the associated Payment
			out.println("\n the associated Payment: " + tempbooking.getPayment());
			
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
	


