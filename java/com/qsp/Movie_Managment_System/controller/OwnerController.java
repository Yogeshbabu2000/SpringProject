package com.qsp.Movie_Managment_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Movie_Managment_System.dto.Owner;
import com.qsp.Movie_Managment_System.service.OwnerService;

@RestController
public class OwnerController {
	@Autowired
	OwnerService ownerService;
	@PostMapping("/saveOwner")
	public Owner saveOwner(@RequestBody Owner owner) {
		return ownerService.saveOwner(owner);
	}
	@GetMapping("/fetchOwnerById")
	public Owner fetchOwnerById(@RequestParam int id) {
		return ownerService.fetchOwnerById(id);
	}
	@DeleteMapping("/deleteOwner")
	public Owner deleteOwner(@RequestParam int id) {
		return ownerService.deleteOwner(id);
	}
	@PutMapping("/updateOwner")
	public Owner updateOwner(@RequestParam int oldId,@RequestBody Owner owner) {
		return ownerService.updateOwner(oldId, owner);
	}
	@PutMapping("/addingExistingTheatreToExistingOwner")
	public Owner addingExistingTheatreToExistingOwner(int theatreId,int ownerId) {
		return ownerService.addingExistingTheatreToExistingOwner(theatreId, ownerId);
	}
}
