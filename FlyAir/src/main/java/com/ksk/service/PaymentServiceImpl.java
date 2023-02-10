package com.ksk.service;

import java.util.List;

import com.ksk.dao.PaymentDao;
import com.ksk.dao.PaymentDaoImpl;
import com.ksk.entities.Payment;

public class PaymentServiceImpl implements PaymentService{
	PaymentDao paymentDao = new PaymentDaoImpl();
	@Override
	public List<Payment> getAllPayment() {
		return paymentDao.getAll();
	}

	@Override
	public Payment getPayment(int id) {
		return paymentDao.get(id);
	}

	@Override
	public void addPayment(Payment payment) {
		paymentDao.inser(payment);
	}

}
