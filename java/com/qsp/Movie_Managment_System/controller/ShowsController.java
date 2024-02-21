package com.qsp.Movie_Managment_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Movie_Managment_System.dto.Shows;
import com.qsp.Movie_Managment_System.service.ShowsService;

@RestController
public class ShowsController {
	@Autowired
	ShowsService showsService;
	@PostMapping("/saveShows")
	public Shows saveShows(@RequestBody Shows shows) {
		return showsService.saveShows(shows);
	}
	@GetMapping("/fetchShowsById")
	public Shows fetchShowsById(@RequestParam int id) {
		return showsService.fetchShowsById(id);
	}
	@DeleteMapping("/deleteShows")
	public Shows deleteShows(@RequestParam int id) {
		return showsService.deleteShows(id);
	}
	@PutMapping("/updateShows")
	public Shows updateShows(@RequestParam int oldId,@RequestBody Shows shows) {
		return showsService.updateShows(oldId, shows);
	}
}
