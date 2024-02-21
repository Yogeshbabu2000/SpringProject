package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.MovieDao;
import com.qsp.Movie_Managment_System.dto.Movie;
import com.qsp.Movie_Managment_System.dto.Screen;
import com.qsp.Movie_Managment_System.dto.Shows;

@Service
public class MovieService {
	@Autowired
	MovieDao movieDao;
	
	public Movie saveMovie(Movie movie) {
		return movieDao.saveMovie(movie);
	}
	
	public Movie fetchMovieById(int id) {
		return movieDao.fetchMovieById(id);
	}
	
	public Movie deleteMovie(int id) {
		return movieDao.deleteMovie(id);
	}
	public Movie updateMovie(int oldId,Movie movie) {
		return movieDao.updateMovie(oldId, movie);
	}
	public Movie addingExistingScreenToExistingMovie(int screenId,int movieId) {
		return movieDao.addingExistingScreenToExistingMovie(screenId, movieId);
	}
}
