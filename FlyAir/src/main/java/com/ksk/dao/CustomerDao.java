package com.ksk.dao;

import java.util.List;

import com.ksk.entities.Customer;

public interface CustomerDao {
	public List<Customer> getAll();
	Customer get(int id);
	void insert(Customer customer);
	void update(Customer customer); 
	void delete(Customer customer);
}
