package com.qsp.Movie_Managment_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Movie_Managment_System.dto.Screen;
import com.qsp.Movie_Managment_System.dto.Theatre;
import com.qsp.Movie_Managment_System.service.TheatreService;

@RestController
public class TheatreController {
	@Autowired
	TheatreService theatreService;
	@PostMapping("/saveTheatre")
	public Theatre saveTheatre(@RequestBody Theatre theatre) {
		return theatreService.saveTheatre(theatre);
	}
	@GetMapping("/fetchTheatreById")
	public Theatre fetchTheatreById(@RequestParam int id) {
		return theatreService.fetchTheatreById(id);
	}
	@DeleteMapping("/deleteTheatre")
	public Theatre deleteTheatre(@RequestParam int id) {
		return theatreService.deleteTheatre(id);
	}
	@PutMapping("/updateTheatre")
	public Theatre updateTheatre(@RequestParam int oldId,@RequestBody Theatre theatre) {
		return theatreService.updateTheatre(oldId, theatre);
	}
	@PutMapping("/addingExistingAddressToExistingTheatre")
	public Theatre addingExistingAddressToExistingTheatre(int addressId,int TheatreId) {
		return theatreService.addingExistingAddressToExistingTheatre(addressId, TheatreId);
	}
	@PutMapping("/addingExistingScreenToExistingTheatre")
	public Theatre addingExistingScreenToExistingTheatre(@RequestParam int screenId,@RequestParam int theatreId) {
		return theatreService.addingExistingScreenToExistingTheatre(screenId, theatreId);
	}
	@PostMapping("/addingNewScreenToExistingTheatre")
	public Theatre addingNewScreenToExistingTheatre(@RequestParam int threatrId,@RequestBody Screen screen) {
		return theatreService.addingNewScreenToExistingTheatre(threatrId, screen);
	}
}
