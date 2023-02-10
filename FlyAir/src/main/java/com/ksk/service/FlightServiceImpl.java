package com.ksk.service;

import java.util.List;

import com.ksk.dao.AirlineDao;
import com.ksk.dao.AirlineDaoImpl;
import com.ksk.dao.FlightDao;
import com.ksk.dao.FlightDaoImpl;
import com.ksk.entities.Flight;

public class FlightServiceImpl implements FlightService{
	FlightDao flightDao = new FlightDaoImpl();
		
	@Override
	public List<Flight> getAllFlight() {
		return flightDao.getAll();
	}

	@Override
	public Flight getFlight(int id) {
		return flightDao.get(id);
	}

	@Override
	public void addFlight(Flight flight) {
		flightDao.insert(flight);
	}

}
