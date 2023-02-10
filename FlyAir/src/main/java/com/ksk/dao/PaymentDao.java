package com.ksk.dao;

import java.util.List;

import com.ksk.entities.Payment;

public interface PaymentDao {
	public List<Payment> getAll();
	public Payment get(int id);
	public void inser(Payment payment);
	public void update(Payment payment);
	public void delete(Payment payment);
}
