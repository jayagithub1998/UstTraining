package com.example.TicketApp.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TicketApp.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketRestController {
	
	private HashMap<Integer,Ticket> tickets;
	
	public TicketRestController() {
		tickets= new HashMap<>();
		tickets.put(1, new Ticket(1,"place1","toplace1",100));
		tickets.put(2, new Ticket(2,"place2","toplace2",200));
		tickets.put(3, new Ticket(3,"place3","toplace3",300));
	}
	
	/*
	@GetMapping("/{tid}")
	ResponseEntity<Ticket> getTicket(@PathVariable("tid") int ticketid){
		Ticket ticket = new Ticket (ticketid,"fromplace","toplace",100);
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}
	
	@PostMapping("/book")
	ResponseEntity<Ticket> bookTicket(@RequestBody Ticket ticket){
		ticket.setId(200);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
	}

	@PutMapping("/update/{tid}")
	ResponseEntity<Ticket> updateTicket(@RequestBody Ticket ticket){
		return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
	}
	

	@DeleteMapping("/{tid}")
	ResponseEntity<Integer> deleteTicket(@PathVariable("tid") Integer ticketid){
		return new ResponseEntity<Integer> (ticketid,HttpStatus.OK);
	}
	*/
	
	
	@GetMapping("/{tid}")
	ResponseEntity<Ticket> getTicket(@PathVariable("tid") int ticketid){
		Ticket ticket = tickets.get(ticketid);
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}
	
	@PostMapping("/book")
	ResponseEntity<Ticket> bookTicket(@RequestBody Ticket ticket){
		tickets.put(ticket.getId(), ticket);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{tid}")
	ResponseEntity<Ticket> updateTicket(@PathVariable("tid") Integer ticketid,@RequestBody Ticket ticket){
		tickets.replace(ticketid, ticket);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
	}
	@DeleteMapping("/{tid}")
	ResponseEntity<Integer> deleteTicket(@PathVariable("tid") Integer ticketid){
		Ticket ticket = tickets.remove(ticketid);
		return new ResponseEntity<Integer> (ticketid,HttpStatus.OK);
	}
}
