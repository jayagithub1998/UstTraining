package com.example.demo_rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	public DemoRestController() {
		System.out.println("Controller");
	}
	
	@GetMapping("/")
	String met() {
		System.out.println("--jjjjjjjj--");
		return "Hello world";
	}
	
	//request => localhost:8080/ticket
/*	@GetMapping("/ticket")
	Ticket getUser() {
		return new Ticket (1,"Some user","some addr",3);
	}
	*/
	
	//request => localhost:8080/ticket?tid=658
	@GetMapping("/ticket")
	Ticket getUser(@RequestParam("tid") int ticketid) {
		return new Ticket (ticketid,"Some user","some addr",3);
	}
	
	@PostMapping("/book")
	Ticket bookTicket(@RequestBody Ticket ticket) {
		System.out.println("Booking ticket:"+ticket);
		ticket.setId(100);
		return ticket;
	}
	
	@DeleteMapping("/cancel")
	String cancelTicket(@RequestParam("tid") int ticketid) {
		return "Ticket with id "+ticketid+" is cancelled";
	}

}
