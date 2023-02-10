package com.ksk.dao;

import java.util.List;

import com.ksk.entities.Flight;

public interface FlightDao {

	public List<Flight> getAll();
	public Flight get(int id);
	public void insert(Flight flight);
	public void update(Flight flight);
	public void delete(Flight flight);
	
}
