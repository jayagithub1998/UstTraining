package com.example.demo_ticket.service;

import java.util.List;
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
	
	public Ticket bookTicketServ(Ticket ticket) {
		return ticketRepo.save(ticket);
	}
	public Ticket cancelTicketRepo(int ticketid) {
		Ticket ticket = ticketRepo.findById(ticketid).get();
		ticketRepo.deleteById(ticketid);
		return ticket;
	}
	
	public Ticket updateTicketServ(int tid, Ticket ticket) {
		Ticket eTicket = ticketRepo.findById(tid).get();
		eTicket.setFromplace(ticket.getFromplace());
		eTicket.setToplace(ticket.getToplace());
		eTicket.setPrice(ticket.getPrice());
		return ticketRepo.save(eTicket);
	}
	
	public List<Ticket> getTicketFromToPlace(String fromplace,String toplace){
		List<Ticket> ltic =ticketRepo.findByFromplaceOrToplace(fromplace, toplace);
		System.out.println("Service"+ltic);
		return ticketRepo.findByFromplaceOrToplace(fromplace, toplace);
	}
	
	public float getAveragePrice(String fromplace) {
		List<Ticket> lticket=ticketRepo.met(fromplace);
		float avg_price=0;
		for(Ticket t:lticket) {
			avg_price+=t.getPrice();
		}
		avg_price=avg_price/lticket.size();
		return avg_price;
	}

	/*
@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepo;
	//Dependency Injection
	
	public Ticket getTicketServ(int ticketid) {
		return ticketRepo.getTicketRepo(ticketid);
	}
	
	public Ticket bookTicketServ(Ticket ticket) {
	return ticketRepo.bookTicketRepo(ticket);
	}
	
	public Ticket updateTicketServ(int tid, Ticket ticket) {
		return ticketRepo.updateTicketRepo(tid, ticket);
	}
	
	public Ticket cancelTicketRepo(int ticketid) {
		Ticket ticket = ticketRepo.getTicketRepo(ticketid);
		ticketRepo.cancelTicketRepo(ticketid);
		return ticket;
	}
	
	*/
}
