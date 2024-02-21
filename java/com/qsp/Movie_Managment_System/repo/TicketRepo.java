package com.qsp.Movie_Managment_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.Movie_Managment_System.dto.Theatre;
import com.qsp.Movie_Managment_System.dto.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
