package com.ksk.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;

import com.ksk.config.HibConfig;
import com.ksk.dao.AirlineDao;
import com.ksk.dao.AirlineDaoImpl;
import com.ksk.entities.Airline;
import com.ksk.entities.Booking;
import com.ksk.service.AirlineService;
import com.ksk.service.AirlineServiceImpl;
import com.ksk.service.BookingService;
import com.ksk.service.BookingServiveImpl;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/KSKAirline1")
public class KSKAirlineControllerXXX extends HttpServlet{	
	private static final long serialVersionUID = 5001242368926615663L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		BookingService bookingService=new BookingServiveImpl(); 
		AirlineService airlineService= new AirlineServiceImpl();
	
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
			Airline tempAirline1 =new Airline("SpiceJet", "SG", "SEJ", 150);
			// associate the objects			
			tempBooking1.setAirline(tempAirline1);						
			// save the instructor, 
			//Note: this will ALSO save the details object because of CascadeType.ALL
			out.println("Saving Booking: " + tempBooking1);
			bookingService.addBooking(tempBooking1);
	
 /*
	    //GET Objects
	    int tempId=1;
	    Booking tempbooking = bookingService.getBooking(tempId);
	    out.println("Booking details for  " + tempId +  ":  " +tempbooking);
	    // print  the associated Airline
			out.println("the associated Airline: " + tempbooking.getAirline());
*/			
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
	
