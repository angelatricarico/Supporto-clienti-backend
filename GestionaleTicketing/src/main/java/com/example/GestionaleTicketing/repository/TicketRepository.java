package com.example.GestionaleTicketing.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestionaleTicketing.model.Ticket;
import com.example.GestionaleTicketing.model.Ticket.Status;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

	List<Ticket> findAllByStatus(Status chiuso);
	

}
