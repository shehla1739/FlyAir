package com.ksk.service;

import java.util.List;

import com.ksk.entities.Airline;

public interface AirlineService {
	public List<Airline> getAllAirline();
	public Airline getAirline(int id);
	public void addAirline(Airline airline);
}
