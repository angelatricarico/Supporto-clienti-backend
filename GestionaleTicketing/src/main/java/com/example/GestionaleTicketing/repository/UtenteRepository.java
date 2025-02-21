package com.example.GestionaleTicketing.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestionaleTicketing.model.Utente;
import com.example.GestionaleTicketing.model.Utente.Ruolo;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long>{
	
	Optional <Utente> findByEmail(String email);
	
	Optional <Utente> findByToken(String token);

	List <Utente> findAllByRuolo(Ruolo ruolo);
	

}
