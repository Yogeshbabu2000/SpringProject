package com.qsp.Movie_Managment_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Viewers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int viewerId;
	private String viewerName;
	private long viewerPhoneNo;
	private String viewerEmail;
	private String viewerAddress;
	public int getViewerId() {
		return viewerId;
	}
	public void setViewerId(int viewerId) {
		this.viewerId = viewerId;
	}
	public String getViewerName() {
		return viewerName;
	}
	public void setViewerName(String viewerName) {
		this.viewerName = viewerName;
	}
	public long getViewerPhoneNo() {
		return viewerPhoneNo;
	}
	public void setViewerPhoneNo(long viewerPhoneNo) {
		this.viewerPhoneNo = viewerPhoneNo;
	}
	public String getViewerEmail() {
		return viewerEmail;
	}
	public void setViewerEmail(String viewerEmail) {
		this.viewerEmail = viewerEmail;
	}
	public String getViewerAddress() {
		return viewerAddress;
	}
	public void setViewerAddress(String viewerAddress) {
		this.viewerAddress = viewerAddress;
	}
	
}
