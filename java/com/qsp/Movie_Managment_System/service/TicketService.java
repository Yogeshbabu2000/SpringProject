package com.qsp.Movie_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Movie_Managment_System.dao.TicketDao;
import com.qsp.Movie_Managment_System.dto.Seats;
import com.qsp.Movie_Managment_System.dto.Ticket;

@Service
public class TicketService {
	@Autowired
	TicketDao ticketDao;
	public Ticket saveTicket(Ticket ticket) {
		return ticketDao.saveTicket(ticket);
	}
	public Ticket fetchTicketById(int id) {
		return ticketDao.fetchTicketById(id);
	}
	public Ticket deleteTicket(int id) {
		return ticketDao.deleteTicket(id);
	}
	
	public Ticket updateTicket(int oldId,Ticket ticket) {
		return ticketDao.updateTicket(oldId, ticket);
	}
	public Ticket addingExistingSeatToExistingTicket(int seatId,int ticketId) {
		return ticketDao.addingExistingSeatToExistingTicket(seatId, ticketId);
	}
}
