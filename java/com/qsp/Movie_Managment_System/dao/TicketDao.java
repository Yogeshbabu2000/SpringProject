package com.qsp.Movie_Managment_System.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Movie_Managment_System.dto.Seats;
import com.qsp.Movie_Managment_System.dto.Ticket;
import com.qsp.Movie_Managment_System.repo.TicketRepo;

@Repository
public class TicketDao {
	@Autowired
	TicketRepo ticketRepo;
	
	@Autowired
	SeatsDao seatsDao;
	
	public Ticket saveTicket(Ticket ticket) {
		return ticketRepo.save(ticket);
	}
	public Ticket fetchTicketById(int id) {
		return ticketRepo.findById(id).get();
	}
	public Ticket deleteTicket(int id) {
		Ticket ticket=fetchTicketById(id);
		ticketRepo.delete(ticket);
		return ticket;
	}
	
	public Ticket updateTicket(int oldId,Ticket ticket) {
		ticket.setTicketId(oldId);
		return ticketRepo.save(ticket);
	}
	
	public Ticket addingExistingSeatToExistingTicket(int seatId,int ticketId) {
		Seats seats =seatsDao.fetchSeatsById(seatId);
		Ticket ticket=fetchTicketById(ticketId);
		ticket.setSeats(seats);
		return ticket;
	}
}
