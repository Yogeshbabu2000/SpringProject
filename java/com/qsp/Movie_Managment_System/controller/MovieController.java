package com.qsp.Movie_Managment_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Movie_Managment_System.dto.Movie;
import com.qsp.Movie_Managment_System.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	MovieService movieService;
	@PostMapping("/saveMovie")
	public Movie saveMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}
	@GetMapping("/fetchMovieById")
	public Movie fetchMovieById(@RequestParam int id) {
		return movieService.fetchMovieById(id);
	}
	@DeleteMapping("/deleteMovie")
	public Movie deleteMovie(@RequestParam int id) {
		return movieService.deleteMovie(id);
	}
	@PutMapping("/updateMovie")
	public Movie updateMovie(@RequestParam int oldId,@RequestBody Movie movie) {
		return movieService.updateMovie(oldId, movie);
	}
	@PutMapping("/addingExistingShowToExistingMovie")
	public Movie addingExistingScreenToExistingMovie(int screenId,int movieId) {
		return movieService.addingExistingScreenToExistingMovie(screenId, movieId);
	}
}
