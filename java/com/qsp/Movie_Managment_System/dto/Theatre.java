package com.qsp.Movie_Managment_System.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int theatreId;
	private String threatreName;
	private double threatreGst;
	private String threatreEmail;
	private String threatreWebsite;
	
	@OneToOne
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Screen>list;
	
	public List<Screen> getList() {
		return list;
	}
	public void setList(List<Screen> list) {
		this.list = list;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getThreatreName() {
		return threatreName;
	}
	public void setThreatreName(String threatreName) {
		this.threatreName = threatreName;
	}
	public double getThreatreGst() {
		return threatreGst;
	}
	public void setThreatreGst(double threatreGst) {
		this.threatreGst = threatreGst;
	}
	public String getThreatreEmail() {
		return threatreEmail;
	}
	public void setThreatreEmail(String threatreEmail) {
		this.threatreEmail = threatreEmail;
	}
	public String getThreatreWebsite() {
		return threatreWebsite;
	}
	public void setThreatreWebsite(String threatreWebsite) {
		this.threatreWebsite = threatreWebsite;
	}
	
}
