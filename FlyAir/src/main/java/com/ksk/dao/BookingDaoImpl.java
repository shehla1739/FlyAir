package com.ksk.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ksk.config.HibConfig;
import com.ksk.entities.Airline;
import com.ksk.entities.Booking;



public class BookingDaoImpl implements BookingDao{

	@Override
	public List<Booking> getAll() {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		/*
		Query<Booking> query=session.createQuery("select b from com.ksk.entities.Booking b");
		session.close();
		return query.list();
		*/
	//////In the HQL , you should use the java class name and property name of the mapped @Entity instead of the actual table name and column name , so the HQL should be 
		List<Booking> result = session.createQuery("from Booking", Booking.class).getResultList();
		session.close();
		return result;
	}

	@Override
	public Booking get(int id) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Booking booking=session.get(Booking.class, id);
		session.close();
		return booking;
	}

	@Override
	public void insert(Booking booking) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(booking);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(Booking booking) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(booking);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Booking booking) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(booking);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}		
	}

}
