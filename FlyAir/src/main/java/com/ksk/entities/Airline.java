package com.ksk.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "airline")
public class Airline {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "iata")
	private String IATA;
	@Column(name = "icao")
	private String ICAO;
	@Column(name = "capacity")
	private int capacity;

	/*
	@OneToOne(mappedBy = "airline", cascade = CascadeType.ALL)
	private Booking booking;
	
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	*/

	@OneToMany(mappedBy = "airline", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH },fetch=FetchType.EAGER)
	private List<Flight> flights;

	// constructors
	public Airline() {
		super();
	}

	public Airline(String name, String iATA, String iCAO, int capacity) {
		this.name = name;
		IATA = iATA;
		ICAO = iCAO;
		this.capacity = capacity;
	}

// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIATA() {
		return IATA;
	}

	public void setIATA(String iATA) {
		IATA = iATA;
	}

	public String getICAO() {
		return ICAO;
	}

	public void setICAO(String iCAO) {
		ICAO = iCAO;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	//Helper method
	public void addFlight(Flight tempFlight) {
		flights.add(tempFlight);
		tempFlight.setAirline(this);
	}

	@Override
	public String toString() {
		return "Airline [id=" + id + ", name=" + name + ", IATA=" + IATA + ", ICAO=" + ICAO + ", capacity=" + capacity
				+ "]";
	}

}
