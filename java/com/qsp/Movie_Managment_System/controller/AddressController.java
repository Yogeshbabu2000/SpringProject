package com.qsp.Movie_Managment_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Movie_Managment_System.dto.Address;
import com.qsp.Movie_Managment_System.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@PostMapping("/saveAddress")
	public Address saveAddress(@RequestBody Address address) {
		return addressService.saveAddress(address);
	}
	@GetMapping("/fetchAddressById")
	public Address fetchAddressById(@RequestParam int id) {
		return addressService.fetchAddressById(id);
	}
	@DeleteMapping("/deleteAddress")
	public Address deleteAddress(@RequestParam int id) {
		return addressService.deleteAddress(id);
	}
	@PutMapping("/updateAddress")
	public Address updateAddress(@RequestParam int oldId,@RequestBody Address address) {
		return addressService.updateAddress(oldId, address);
	}
}
