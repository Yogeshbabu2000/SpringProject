package com.qsp.Movie_Managment_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private String movieHero;
	private String movieHeroine;
	private String movieDirector;
	private double movieBudget;
	
	@OneToOne
	private Screen screen;
	
	
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieHero() {
		return movieHero;
	}
	public void setMovieHero(String movieHero) {
		this.movieHero = movieHero;
	}
	public String getMovieHeroine() {
		return movieHeroine;
	}
	public void setMovieHeroine(String movieHeroine) {
		this.movieHeroine = movieHeroine;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public double getMovieBudget() {
		return movieBudget;
	}
	public void setMovieBudget(double movieBudget) {
		this.movieBudget = movieBudget;
	}
	
	
}
