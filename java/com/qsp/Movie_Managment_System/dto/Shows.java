package com.qsp.Movie_Managment_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shows {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int showId;
	private String showTime;
	private String showName;
	private String showDuration;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getShowDuration() {
		return showDuration;
	}
	public void setShowDuration(String showDuration) {
		this.showDuration = showDuration;
	}
	
}
