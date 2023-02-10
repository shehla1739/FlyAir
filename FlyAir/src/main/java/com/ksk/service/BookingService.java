package com.ksk.service;

import java.util.List;

import com.ksk.entities.Booking;

public interface BookingService {	
	public List<Booking> getAllBooking();
	public Booking getBooking(int id);
	public void addBooking(Booking booking);
}
