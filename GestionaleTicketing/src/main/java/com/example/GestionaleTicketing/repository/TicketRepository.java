package com.example.GestionaleTicketing.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestionaleTicketing.model.Ticket;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	
    Optional<Ticket> findById(Long id);

}
