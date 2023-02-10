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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "booking_date")
	private Date bookingDate;
	@Column(name = "depature_date")
	private Date depatureDate;
/*
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "airline_id")
	private Airline airline;
	
	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}
*/
	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;

	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="payment_id")
	private Payment payment;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="flight_id")
	private Flight flight;
	
	// constructor
	public Booking() {
	}

	public Booking(Date bookingDate, Date depatureDate) {
		this.bookingDate = bookingDate;
		this.depatureDate = depatureDate;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getDepatureDate() {
		return depatureDate;
	}

	public void setDepatureDate(Date depatureDate) {
		this.depatureDate = depatureDate;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingDate=" + bookingDate + ", depatureDate=" + depatureDate + "]";
	}
}
