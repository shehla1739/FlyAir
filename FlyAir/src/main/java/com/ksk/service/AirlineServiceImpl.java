package com.ksk.service;

import java.util.List;

import com.ksk.dao.AirlineDao;
import com.ksk.dao.AirlineDaoImpl;
import com.ksk.entities.Airline;

public class AirlineServiceImpl implements AirlineService{
	AirlineDao airlineDao=new AirlineDaoImpl();
	@Override
	public List<Airline> getAllAirline() {
		return airlineDao.getAll();
	}

	@Override
	public Airline getAirline(int id) {
		return airlineDao.get(id);
	}

	@Override
	public void addAirline(Airline airline) {
		airlineDao.insert(airline);
		
	}

}
