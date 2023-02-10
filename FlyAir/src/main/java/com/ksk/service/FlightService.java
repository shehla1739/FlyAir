package com.ksk.service;

import java.util.List;

import com.ksk.entities.Flight;

public interface FlightService {
	public List<Flight> getAllFlight();
	public Flight getFlight(int id);
	public void addFlight(Flight flight);
}
