package com.example.demo_rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@GetMapping("/ticket1")
	String met() {
		return "Hello from UserRestController";
	}
	
	//@RequestParam("tid") ==> localhost:8080/ticket?tid=658  ==> Request parameter
	//localhost:8080/tkt/cancel/6574 ==> path variable
	
	@GetMapping("/ticket")
	ResponseEntity getUser(@RequestParam("tid") int ticketid) {
		Ticket ticket = new Ticket(ticketid,"some user","some addr",3);
		ResponseEntity rentity = new ResponseEntity(ticket,HttpStatus.OK);
		return rentity;
	}
	
	

	@PostMapping("/book")
	ResponseEntity<Ticket> bookTicket(@RequestBody Ticket ticket) {
		System.out.println("Booking ticket:"+ticket);
		ticket.setId(100);
		ResponseEntity rentity = new ResponseEntity(ticket,HttpStatus.CREATED);
		return rentity;
	}
	
	//using path variable
/*	@DeleteMapping("/cancelp/{ticketid}")
	ResponseEntity<String> cancelPTicket(@PathVariable int ticketid) {
		String str = "Successfully cancelled ticket with id "+ticketid;
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}*/
	
	//using path variable
	@DeleteMapping("/cancelp/{ticketid}")
	ResponseEntity<String> cancelPTicket(@PathVariable("ticketid") int tid) {
		String str = "Successfully cancelled ticket with id "+tid;
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}

	//using Request parameter
	@DeleteMapping("/cancel")
	String cancelTicket(@RequestParam("tid") int ticketid) {
		return "Ticket with id "+ticketid+" is cancelled";
	}


}
