package com.example.demo_ticket.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_ticket.model.Ticket;
import com.example.demo_ticket.repository.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepo;
	
	public Ticket getTicketServ(int ticketid) {
		Optional<Ticket> oticket = ticketRepo.findById(ticketid);
		return oticket.get();
	}

}
