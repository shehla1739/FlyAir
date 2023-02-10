package com.ksk.service;

import java.util.List;

import com.ksk.entities.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomer();
	public Customer getCustomer(int id);
	public void addCustomer(Customer customer);
}
