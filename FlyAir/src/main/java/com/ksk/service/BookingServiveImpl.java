package com.ksk.service;

import java.util.List;

import com.ksk.dao.BookingDao;
import com.ksk.dao.BookingDaoImpl;
import com.ksk.entities.Booking;

public class BookingServiveImpl implements BookingService {
	BookingDao bookingDao = new BookingDaoImpl();

	@Override
	public Booking getBooking(int id) {		
		return bookingDao.get(id);
	}
	@Override
	public void addBooking(Booking booking) {
		bookingDao.insert(booking);
		
	}
	@Override
	public List<Booking> getAllBooking() {
		return bookingDao.getAll();
	}
	
	
}
