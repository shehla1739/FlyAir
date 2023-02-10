package com.ksk.config;

import java.util.Properties;

import javax.security.auth.Subject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.ksk.entities.Airline;
import com.ksk.entities.Booking;
import com.ksk.entities.Customer;
import com.ksk.entities.Flight;
import com.ksk.entities.Payment;
import com.ksk.entities.User;


    public class HibConfig {
	public static SessionFactory getSessionFactory() {	
			Configuration configuration=new Configuration();
			Properties properties=new Properties();
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/flyairdb");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "root");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.FORMAT_SQL, true);
			properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			configuration.setProperties(properties);
			
			
			
			configuration.addAnnotatedClass(User.class);
			configuration.addAnnotatedClass(Airline.class);
			configuration.addAnnotatedClass(Booking.class);
			configuration.addAnnotatedClass(Customer.class);
			configuration.addAnnotatedClass(Flight.class);
			configuration.addAnnotatedClass(Payment.class);
			
		
			SessionFactory sessionFactory=configuration.buildSessionFactory();
			return sessionFactory;
		}
}