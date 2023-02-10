package com.ksk.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/KSKUserSearchPage")
public class KSKUserSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*
        // get an student object
        String hql = " FROM Student S WHERE S.id = :studentId";
        Query query = session.createQuery(hql);
        query.setParameter("studentId", id);
        List results = query.getResultList();

        if (results != null && !results.isEmpty()) {
            student = (Student) results.get(0);
        }
        // commit transaction
        transaction.commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
    return student;
}
	*/
}
