package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.SeatsDao;
import com.qsp.Movie_Managment_System.dto.Seats;

@Service
public class SeatsService {
	@Autowired
	SeatsDao seatsDao;
	public  Seats saveSeats(Seats seats) {
		return seatsDao.saveSeats(seats);
	}
	public Seats fetchSeatsById(int id) {
		return seatsDao.fetchSeatsById(id);
	}
	public Seats deleteSeats(int id) {
		return seatsDao.deleteSeats(id);
	}
	public Seats updateSeats(int oldId,Seats seats) {
		return seatsDao.updateSeats(oldId, seats);
	}
}
