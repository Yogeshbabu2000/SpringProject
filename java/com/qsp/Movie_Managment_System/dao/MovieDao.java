package com.qsp.Movie_Managment_System.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Movie;
import com.qsp.Movie_Managment_System.dto.Screen;
import com.qsp.Movie_Managment_System.repo.MovieRepo;

@Repository
public class MovieDao {
	@Autowired
	MovieRepo movieRepo;
	
	@Autowired
	ScreenDao screenDao;
	
	public Movie saveMovie(Movie movie) {
		return movieRepo.save(movie);
	}
	
	public Movie fetchMovieById(int id) {
		return movieRepo.findById(id).get();
	}
	
	public Movie deleteMovie(int id) {
		Movie movie=fetchMovieById(id);
		movieRepo.delete(movie);
		return movie;
	}
	public Movie updateMovie(int oldId,Movie movie) {
		movie.setMovieId(oldId);;
		return movieRepo.save(movie);
	}
	public Movie addingExistingScreenToExistingMovie(int screenId,int movieId) {
		Screen screen=screenDao.fetchScreenById(screenId);
		Movie movie=fetchMovieById(movieId);
		movie.setScreen(screen);
		return saveMovie(movie);
	}
}
