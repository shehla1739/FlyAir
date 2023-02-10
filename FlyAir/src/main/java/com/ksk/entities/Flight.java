package com.ksk.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="date")
	private Date date;
	@Column(name="source")
	private String source;
	@Column(name="destination")
	private String destination;
	@Column(name="duration")
	private int duration;
	@Column(name="ticket_price")
	private int ticketPrice;
	@Column(name="seats_booked")
	private int seatsBooked;
	

	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="airline_id")
	private Airline airline;

	@OneToOne(mappedBy="flight", cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	private Booking booking;
	
	public Flight() {
		
	}
	
	public Flight(Date date, String source, String destination, int duration, int ticketPrice, int seatsBooked) {
		super();
		this.date = date;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.ticketPrice = ticketPrice;
		this.seatsBooked = seatsBooked;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", date=" + date + ", source=" + source + ", destination=" + destination
				+ ", duration=" + duration + ", ticketPrice=" + ticketPrice + ", seatsBooked=" + seatsBooked + "]";
	}

}
