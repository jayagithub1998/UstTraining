package com.example.demo_resttemplate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
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
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/redbus")
public class DemoController {
	
	RestTemplate rClient = new RestTemplate();
	private final String BASE_URL ="http://localhost:8080/ticket/";
	
/*	@GetMapping
	public ResponseEntity<Ticket> getTicket(){
		RestTemplate rClient = new RestTemplate();
		ResponseEntity<Ticket> reTicket = rClient.getForEntity("http://localhost:8080/ticket/2",Ticket.class);
		System.out.println("Received Ticket: "+reTicket.getBody());
		return reTicket;
	}
*/
	
	@GetMapping("{ticketid}")
	public ResponseEntity<Ticket> getTicket(@PathVariable int ticketid){
		ResponseEntity<Ticket> reTicket = rClient.getForEntity(BASE_URL+ticketid,Ticket.class);
		System.out.println("Received Ticket: "+reTicket.getBody());
		return reTicket;
	}
	
	@PostMapping
	public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket){
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("x-custom-hdr","abcd");
		HttpEntity<Ticket> request = new HttpEntity<Ticket>(ticket,httpHeaders);
		ResponseEntity<Ticket> reticket=
				rClient.postForEntity(BASE_URL+"book",request,Ticket.class);
		System.out.println("Created Ticket:"+reticket.getBody());
		return reticket;
		
	}
	
	@PutMapping("/{ticketid}")
	public ResponseEntity<Ticket> updateTicket(@PathVariable int ticketid,@RequestBody Ticket ticket){
		rClient.put(BASE_URL+"update/"+ticketid, ticket);
		ResponseEntity<Ticket> rTicket = rClient.getForEntity(BASE_URL+ticketid,Ticket.class);
		System.out.println("Updated Ticket :"+rTicket);
		return rTicket;
	}
	
	//Assignment
	@DeleteMapping("/{ticketid}")
	public ResponseEntity<String> deleteTicket(@PathVariable int ticketid){
		rClient.delete(BASE_URL+ticketid);
		System.out.println("Deleted Ticket :"+ticketid);
		return new ResponseEntity<String>("Ticket "+ticketid+" is deleted", HttpStatus.OK);
	}
}
