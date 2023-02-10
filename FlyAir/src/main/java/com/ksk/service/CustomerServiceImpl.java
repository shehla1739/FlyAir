package com.ksk.service;

import java.util.List;

import com.ksk.dao.CustomerDao;
import com.ksk.dao.CustomerDaoImpl;
import com.ksk.entities.Customer;

public class CustomerServiceImpl implements CustomerService{
	CustomerDao customerDao = new CustomerDaoImpl();
	@Override
	public List<Customer> getAllCustomer() {		
		return customerDao.getAll();
	}

	@Override
	public Customer getCustomer(int id) {		
		return customerDao.get(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.insert(customer);
	}

}
