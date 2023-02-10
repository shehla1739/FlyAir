package com.ksk.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ksk.config.HibConfig;
import com.ksk.entities.Airline;
import com.ksk.entities.Payment;

public class PaymentDaoImpl implements PaymentDao{

	@Override
	public List<Payment> getAll() {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session = factory.openSession();
		/*
		Query<Payment> query=session.createQuery("select p from com.ksk.entities.Payment p");
		session.close();
		return query.list();
		*/
	//////In the HQL , you should use the java class name and property name of the mapped @Entity instead of the actual table name and column name , so the HQL should be 
		List<Payment> result = session.createQuery("from Payment", Payment.class).getResultList();
		session.close();
		return result;
	}

	@Override
	public Payment get(int id) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
						
							// start a transaction
							session.beginTransaction();
				
							// get the airline detail object							
							Payment tempPayment = session.get(Payment.class, id);
							
//							
							session.getTransaction().commit();
							
						
							// handle connection leak issue
							session.close();							
							factory.close();
							
							return tempPayment;
						
	}

	@Override
	public void inser(Payment payment) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(payment);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Payment payment) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(payment);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Payment payment) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(payment);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}		
	}

}
