package com.ksk.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ksk.config.HibConfig;
import com.ksk.entities.Airline;

public class AirlineDaoImpl2 implements AirlineDao{

	@Override
	public List<Airline> getAll() {
		SessionFactory factory=HibConfig.getSessionFactory();
		
		Session session=factory.openSession();
		Query<Airline> query=session.createQuery("select a from com.ksk.entities.Airline a");
		session.close();
		return query.list();
	}

	@Override
	public Airline get(int id) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Airline airline=session.get(Airline.class, id);
		session.close();
		return airline;
	}

	@Override
	public void insert(Airline airline) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(airline);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void update(Airline airline) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(airline);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Airline airline) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(airline);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}		
	}

}
