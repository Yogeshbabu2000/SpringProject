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
import com.qsp.Movie_Managment_System.service.ScreenService;
@RestController
public class ScreenController {
	@Autowired
	ScreenService screenService;
	@PostMapping("/saveScreen")
	public Screen saveScreen(@RequestBody Screen screen) {
		return screenService.saveScreen(screen);
	}
	@GetMapping("/fetchScreenById")
	public Screen fetchScreenById(@RequestParam int id) {
		return screenService.fetchScreenById(id);
	}
	@DeleteMapping("/deleteScreen")
	public Screen deleteScreen(@RequestParam int id) {
		return screenService.deleteScreen(id);
	}
	@PutMapping("/updateScreen")
	public Screen updateScreen(@RequestParam int oldId,@RequestBody Screen screen) {
		return screenService.updateScreen(oldId, screen);
	}
}
