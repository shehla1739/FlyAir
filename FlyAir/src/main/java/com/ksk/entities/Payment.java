package com.ksk.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="card_name")
	private String cardName;
	@Column(name="card_no")
	private int cardNo;
	@Column(name="name_on_card")
	private String nameOnCard;
	@Column(name="expire_month")
	private int expireMonth;
	@Column(name="expire_year")
	private int expireYear;
	@Column(name="cvv")
	private int cvv;

	@OneToOne(mappedBy="payment", cascade=CascadeType.ALL)
	private Booking booking;
	
	public Payment() {
		super();
	}

	public Payment(String cardName, int cardNo, String nameOnCard, int expireMonth, int expireYear, int cvv) {
		super();
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.nameOnCard = nameOnCard;
		this.expireMonth = expireMonth;
		this.expireYear = expireYear;
		this.cvv = cvv;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	public int getCardNo() {
		return cardNo;
	}


	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}


	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public int getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(int expireMonth) {
		this.expireMonth = expireMonth;
	}

	public int getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(int expireYear) {
		this.expireYear = expireYear;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", cardName=" + cardName + ", cardNo=" + cardNo + ", nameOnCard=" + nameOnCard
				+ ", expireMonth=" + expireMonth + ", expireYear=" + expireYear + ", cvv=" + cvv + "]";
	}

}
