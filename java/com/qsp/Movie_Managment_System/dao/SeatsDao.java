package com.qsp.Movie_Managment_System.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Seats;
import com.qsp.Movie_Managment_System.repo.SeatsRepo;

@Repository
public class SeatsDao {
	@Autowired
	SeatsRepo seatsRepo;
	public  Seats saveSeats(Seats seats) {
		return seatsRepo.save(seats);
	}
	public Seats fetchSeatsById(int id) {
		return seatsRepo.findById(id).get();
	}
	public Seats deleteSeats(int id) {
		Seats seats=fetchSeatsById(id);
		seatsRepo.delete(seats);
		return seats;
	}
	public Seats updateSeats(int oldId,Seats seats) {
		seats.setSeatsId(oldId);
		return seatsRepo.save(seats);
	}
}
