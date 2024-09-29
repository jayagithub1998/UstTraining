package com.example.demo_ticket.repository;

import org.springframework.stereotype.Repository;

import com.example.demo_ticket.model.Ticket;

@Repository
public class TicketRepository extends JpaRepository<Ticket,Integer> {

}
