package com.qsp.Movie_Managment_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Movie_Managment_System.dto.Ticket;
import com.qsp.Movie_Managment_System.service.TicketService;

@RestController
public class TicketController {
	@Autowired
	TicketService ticketService;
	@PostMapping("/saveTicket")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketService.saveTicket(ticket);
	}
	@GetMapping("/fetchTicketById")
	public Ticket fetchTicketById(@RequestParam  int id) {
		return ticketService.fetchTicketById(id);
	}
	@DeleteMapping("/deleteTicket")
	public Ticket deleteTicket(@RequestParam int id) {
		return ticketService.deleteTicket(id);
	}
	@PutMapping("/updateTicket")
	public Ticket updateTicket(@RequestParam int oldId,@RequestBody Ticket ticket) {
		return ticketService.updateTicket(oldId, ticket);
	}
	@PutMapping("/addingExistingSeatToExistingTicket")
	public Ticket addingExistingSeatToExistingTicket(int seatId,int ticketId) {
		return ticketService.addingExistingSeatToExistingTicket(seatId, ticketId);
	}
}
