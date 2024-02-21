package com.qsp.Movie_Managment_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seats {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatsId;
	private String seatsNumber;
	private String seatsType;
	public int getSeatsId() {
		return seatsId;
	}
	public void setSeatsId(int seatsId) {
		this.seatsId = seatsId;
	}
	public String getSeatsNumber() {
		return seatsNumber;
	}
	public void setSeatsNumber(String seatsNumber) {
		this.seatsNumber = seatsNumber;
	}
	public String getSeatsType() {
		return seatsType;
	}
	public void setSeatsType(String seatsType) {
		this.seatsType = seatsType;
	}
	
}
