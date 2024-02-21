package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.AddressDao;
import com.qsp.Movie_Managment_System.dto.Address;

@Service
public class AddressService {
	@Autowired
	AddressDao addressDao;
	
	public Address saveAddress(Address address) {
		return addressDao.saveAddress(address);
	}
	
	public Address fetchAddressById(int id) {
		return addressDao.fetchAddressById(id);
	}
	public Address deleteAddress(int id) {
		return addressDao.deleteAddress(id);
	}
	public Address updateAddress(int oldId,Address address) {
		return addressDao.updateAddress(oldId, address);
	}
}
