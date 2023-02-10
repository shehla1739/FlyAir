package com.ksk.dao;

import java.util.List;

import com.ksk.entities.Airline;

public interface AirlineDao {
	public List<Airline> getAll();
	Airline get(int id);
	void insert(Airline airline);
	void update(Airline airline); 
	void delete(Airline airline);
}
