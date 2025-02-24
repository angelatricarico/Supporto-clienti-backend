package com.example.GestionaleTicketing.dto;

import java.util.List;

import com.example.GestionaleTicketing.model.CategoriaTicket;
import com.example.GestionaleTicketing.model.Ticket;


public class UtenteDto {
	
	public enum Ruolo {
		Utente,
		Operatore,
		Admin
	}
	

	Long id;

	private String nome;
	
	private String cognome;
	
	private String email;

	
	private CategoriaTicket categoriaTicket;
	
	private List<Ticket> tickets;
	
	private List<Ticket> ticketsOperatore;
	
	private Ruolo ruolo;


	public UtenteDto(Long id, String nome, String cognome, String email, CategoriaTicket categoriaTicket,
			List<Ticket> tickets, List<Ticket> ticketsOperatore, Ruolo ruolo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.categoriaTicket = categoriaTicket;
		this.tickets = tickets;
		this.ticketsOperatore = ticketsOperatore;
		this.ruolo = ruolo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public CategoriaTicket getCategoriaTicket() {
		return categoriaTicket;
	}

	public void setCategoriaTicket(CategoriaTicket categoriaTicket) {
		this.categoriaTicket = categoriaTicket;
	}

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public List<Ticket> getTicketsOperatore() {
		return ticketsOperatore;
	}

	public void setTicketsOperatore(List<Ticket> ticketsOperatore) {
		this.ticketsOperatore = ticketsOperatore;
	}
	

}


