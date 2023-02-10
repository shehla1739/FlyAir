package com.ksk.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.ksk.entities.User;

import com.ksk.config.HibConfig;




public class UserDaoImpl implements UserDao {

	public void insert(User user) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}		
	}

	public User get(String username, String password) {
		SessionFactory factory= HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Query<User> query=session.createQuery("select u from com.ksk.entities.User u where u.username=?1 and u.password=?2");
		query.setParameter(1, username);
		query.setParameter(2, password);
		return query.getSingleResult();	
	}

	public void update(User user) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	

}
