package com.ksk.dao;

import java.util.List;

import com.ksk.entities.Booking;



public interface BookingDao {
	public List<Booking> getAll();
	Booking get(int id);
	void insert(Booking booking);
	void update(Booking booking); 
	void delete(Booking booking);
}
