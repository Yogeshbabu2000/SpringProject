package com.qsp.Movie_Managment_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Movie_Managment_System.dto.Seats;
import com.qsp.Movie_Managment_System.service.SeatsService;

@RestController
public class SeatsController {
	@Autowired
	SeatsService seatsService;
	@PostMapping("/saveSeats")
	public  Seats saveSeats(@RequestBody Seats seats) {
		return seatsService.saveSeats(seats);
	}
	@GetMapping("/fetchSeatsById")
	public Seats fetchSeatsById(@RequestParam int id) {
		return seatsService.fetchSeatsById(id);
	}
	@DeleteMapping("/deleteSeats")
	public Seats deleteSeats(@RequestParam int id) {
		return seatsService.deleteSeats(id);
	}
	@PutMapping("/updateSeats")
	public Seats updateSeats(@RequestParam int oldId,@RequestBody Seats seats) {
		return seatsService.updateSeats(oldId, seats);
	}
}
