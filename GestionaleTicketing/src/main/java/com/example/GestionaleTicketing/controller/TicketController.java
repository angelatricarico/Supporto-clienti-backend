package com.example.GestionaleTicketing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestionaleTicketing.model.Ticket;
import com.example.GestionaleTicketing.model.Utente;
import com.example.GestionaleTicketing.repository.TicketRepository;
import com.example.GestionaleTicketing.service.TokenService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/ticket")
@CrossOrigin ("*")

public class TicketController {
	
	@Autowired
	TokenService tokenService;
	
	@Autowired
	TicketRepository ticketRepository;
	

	/*@GetMapping
	public LocalDate getProva() {
		return LocalDate.now();
	}*/
	
	@GetMapping
	public List <Ticket> getAllTickets(HttpServletRequest request, HttpServletResponse response ) {
		Optional <Utente> utente = getAuthUser(request);
		
		if (utente.get().getRuolo() == Utente.Ruolo.Utente) {
			return utente.get().getTickets();
		} else if (utente.get().getRuolo() == Utente.Ruolo.Operatore) {
			return utente.get().getTicketsOperatore();			
		} else {
			return ticketRepository.findAll();
		}
	}
	
	
	
	
	private Optional<Utente> getAuthUser(HttpServletRequest request) {
        // Legge l'header "Authorization"
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && !authHeader.isEmpty()) {
            String token;
            // Se il token è inviato come "Bearer <token>", lo estrae
            if (authHeader.startsWith("Bearer ")) {
                token = authHeader.substring(7);
            } else {
                token = authHeader;
            }
            // Usa il TokenService per ottenere l'utente associato al token
            return tokenService.getAuthUser(token);
        }
        System.out.println("Se non c'è header \"Authorization\", restituisce null");
        // Se non c'è header "Authorization", restituisce null
        return null;
	}
}
