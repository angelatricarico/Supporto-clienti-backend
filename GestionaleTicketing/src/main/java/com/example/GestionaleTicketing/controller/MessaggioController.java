package com.example.GestionaleTicketing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestionaleTicketing.repository.MessaggioRepository;
import com.example.GestionaleTicketing.service.TokenService;

@RestController
@RequestMapping("/messaggi")
@CrossOrigin ("*")

public class MessaggioController {
	
	@Autowired
	TokenService tokenService;
	
	@Autowired
	MessaggioRepository messaggioRepository;

}
