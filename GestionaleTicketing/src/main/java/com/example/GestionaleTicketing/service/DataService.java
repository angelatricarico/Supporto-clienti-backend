package com.example.GestionaleTicketing.service;

import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestionaleTicketing.repository.TicketRepository;

@Service
public class DataService {
	
	private final TicketRepository ticketRepository;
	
	@Autowired
	public DataService(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}
	
	
	public void getTicketsCountByMonth() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
		Map<String, Long> data = ticketRepository.findAll().stream()
				.collect(Collectors.groupingBy(
						ticket -> ticket.getDataApertura().format(formatter),
						Collectors.counting()
						));
		
	}
}
