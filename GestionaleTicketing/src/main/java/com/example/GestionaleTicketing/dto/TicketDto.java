package com.example.GestionaleTicketing.dto;

import com.example.GestionaleTicketing.model.Ticket.Status;


public class TicketDto {
	

	private Long utenteId;
    private String testoMessaggio;
    private Long idCategoria;
    private String oggetto;
    private Status status;  // Ora usa l'Enum corretto


    // Getter e Setter
    public Long getUtenteId() {
        return utenteId;
    }

    public void setUtenteId(Long utenteId) {
        this.utenteId = utenteId;
    }

    public String getTestoMessaggio() {
        return testoMessaggio;
    }

    public void setTestoMessaggio(String testoMessaggio) {
        this.testoMessaggio = testoMessaggio;
    }

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
    
    
}
