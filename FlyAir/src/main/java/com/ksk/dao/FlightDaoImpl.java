package com.ksk.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ksk.config.HibConfig;
import com.ksk.entities.Flight;

public class FlightDaoImpl implements FlightDao {
	
	@Override
	public List<Flight> getAll() {
		SessionFactory factory=HibConfig.getSessionFactory();		
		Session session=factory.openSession();
		/*
		Query<Flight> query=session.createQuery("select a from com.ksk.entities.Flight a");
		session.close();
		return query.list();
		*/
	//////In the HQL , you should use the java class name and property name of the mapped @Entity instead of the actual table name and column name , so the HQL should be 
		List<Flight> result = session.createQuery("from Flight", Flight.class).getResultList();
		session.close();
		return result;
	}

	@Override
	public Flight get(int id) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();						
			// start a transaction
			session.beginTransaction();
				
			// get the flight detail object							
			Flight tempFlight = session.get(Flight.class, id);
								
			session.getTransaction().commit();
							
			// handle connection leak issue
			session.close();							
			factory.close();
					
			return tempFlight;						
	}

	@Override
	public void insert(Flight flight) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(flight);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(Flight flight) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(flight);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Flight flight) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(flight);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}		
	}

}
