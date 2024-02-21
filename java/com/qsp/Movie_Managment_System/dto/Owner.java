package com.qsp.Movie_Managment_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerId;
	private String ownerName;
	private double ownerNetworth;
	private long ownerPhoneNo;
	private String ownerAddress;
	
	@OneToOne
	private Theatre theatre;
	
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getOwnerNetworth() {
		return ownerNetworth;
	}
	public void setOwnerNetworth(double ownerNetworth) {
		this.ownerNetworth = ownerNetworth;
	}
	public long getOwnerPhoneNo() {
		return ownerPhoneNo;
	}
	public void setOwnerPhoneNo(long ownerPhoneNo) {
		this.ownerPhoneNo = ownerPhoneNo;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	
}
