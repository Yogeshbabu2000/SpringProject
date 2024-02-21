package com.qsp.Movie_Managment_System.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Address;
import com.qsp.Movie_Managment_System.repo.AddressRepo;

@Repository
public class AddressDao {
	
	@Autowired
	AddressRepo addressRepo;
	
	public Address saveAddress(Address address) {
		return addressRepo.save(address);
	}
	
	public Address fetchAddressById(int id) {
		return addressRepo.findById(id).get();
	}
	public Address deleteAddress(int id) {
		Address address=fetchAddressById(id);
		addressRepo.delete(address);
		return address;
	}
	public Address updateAddress(int oldId,Address address) {
		address.setAddressId(oldId);;
		return addressRepo.save(address);
	}
}
