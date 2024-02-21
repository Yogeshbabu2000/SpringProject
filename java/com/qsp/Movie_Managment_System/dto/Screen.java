package com.qsp.Movie_Managment_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int screenId;
	private String screenSize;
	private String screenType;
	private String screenName;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	
}
