package com.example.GestionaleTicketing.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Utente {
	
	
	enum Ruolo {
		Utente,
		Operatore,
		Admin
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	private String nome;
	
	private String cognome;
	
	private String email;
	
	private String password;
	
	private String token;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private CategoriaTicket categoriaTicket;
	
	@OneToMany(mappedBy = "utente", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Ticket> tickets;
	
	@OneToMany(mappedBy = "operatore", cascade = {}, orphanRemoval = false)
	private List<Ticket> ticketsOperatore;
	
	@Enumerated(EnumType.STRING)
	private Ruolo ruolo;


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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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
