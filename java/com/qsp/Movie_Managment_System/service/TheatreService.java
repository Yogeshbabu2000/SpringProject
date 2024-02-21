package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.TheatreDao;
import com.qsp.Movie_Managment_System.dto.Address;
import com.qsp.Movie_Managment_System.dto.Screen;
import com.qsp.Movie_Managment_System.dto.Theatre;

@Service
public class TheatreService {
	@Autowired
	TheatreDao theatreDao;
	public Theatre saveTheatre(Theatre theatre) {
		return theatreDao.saveTheatre(theatre);
	}
	public Theatre fetchTheatreById(int id) {
		return theatreDao.fetchTheatreById(id);
	}
	public Theatre deleteTheatre(int id) {
		return theatreDao.deleteTheatre(id);
	}
	public Theatre updateTheatre(int oldId,Theatre theatre) {
		return theatreDao.updateTheatre(oldId, theatre);
	}
	public Theatre addingExistingAddressToExistingTheatre(int addressId,int TheatreId) {
		return theatreDao.addingExistingAddressToExistingTheatre(addressId, TheatreId);
	}
	public Theatre addingExistingScreenToExistingTheatre(int screenId,int theatreId) {
		return theatreDao.addingExistingScreenToExistingTheatre(screenId, theatreId);
	}
	public Theatre addingNewScreenToExistingTheatre(int threatrId,Screen screen) {
		return theatreDao.addingNewScreenToExistingTheatre(threatrId, screen);
	}
}
