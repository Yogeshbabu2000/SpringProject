package com.qsp.Movie_Managment_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Movie_Managment_System.dto.Viewers;
import com.qsp.Movie_Managment_System.service.ViewersService;

@RestController
public class ViewersController {
	@Autowired
	ViewersService viewersService;
	@PostMapping("/saveViewers")
	public Viewers saveViewers(@RequestBody Viewers viewers) {
		return viewersService.saveViewers(viewers);
	}
	@GetMapping("/fetchViewersById")
	public Viewers fetchViewersById(@RequestParam int id) {
		return viewersService.fetchViewersById(id);
	}
	@DeleteMapping("/deleteViewers")
	public Viewers deleteViewers(@RequestParam int id) {
		return viewersService.deleteViewers(id);
	}
	@PutMapping("/updateViewers")
	public Viewers updateViewers(@RequestParam int oldId,@RequestBody Viewers viewers) {
		return viewersService.updateViewers(oldId, viewers);
	}
}
