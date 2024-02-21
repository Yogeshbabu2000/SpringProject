package com.qsp.Movie_Managment_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Address;
import com.qsp.Movie_Managment_System.dto.Screen;
import com.qsp.Movie_Managment_System.dto.Theatre;
import com.qsp.Movie_Managment_System.repo.TheatreRepo;

@Repository
public class TheatreDao {
	@Autowired
	TheatreRepo theatreRepo;
	
	@Autowired
	AddressDao addressDao;
	
	@Autowired
	ScreenDao screenDao;
	
	public Theatre saveTheatre(Theatre theatre) {
		return theatreRepo.save(theatre);
	}
	public Theatre fetchTheatreById(int id) {
		return theatreRepo.findById(id).get();
	}
	public Theatre deleteTheatre(int id) {
		Theatre theatre=fetchTheatreById(id);
		theatreRepo.delete(theatre);
		return theatre;
	}
	public Theatre updateTheatre(int oldId,Theatre theatre) {
		theatre.setTheatreId(oldId);
		return theatreRepo.save(theatre);
	}
	
	public Theatre addingExistingAddressToExistingTheatre(int addressId,int TheatreId) {
		Address address=addressDao.fetchAddressById(addressId);
		Theatre theatre=fetchTheatreById(TheatreId);
		theatre.setAddress(address);
		return saveTheatre(theatre);
	}
	public Theatre addingExistingScreenToExistingTheatre(int screenId,int theatreId) {
		Theatre theatre=fetchTheatreById(theatreId);
		Screen screen=screenDao.fetchScreenById(screenId);
		theatre.getList().add(screen);
		return saveTheatre(theatre);
	}
	public Theatre addingNewScreenToExistingTheatre(int threatrId,Screen screen) {
		Theatre theatre=fetchTheatreById(threatrId);
		theatre.getList().add(screen);
		return saveTheatre(theatre);
	}
}
