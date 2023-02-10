package com.ksk.service;

import java.util.List;

import com.ksk.entities.Payment;

public interface PaymentService {
	public List<Payment> getAllPayment();
	public Payment getPayment(int id);
	public void addPayment(Payment payment);
}
