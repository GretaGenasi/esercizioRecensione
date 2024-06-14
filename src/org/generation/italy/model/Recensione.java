package org.generation.italy.model;
import java.time.LocalDate;
import java.util.*;

public class Recensione {
	
	private LocalDate data;
	private String nomeUtente;
	private int numeroStelle;
	private String testo;
	
	//COSTRUTTORE
	public Recensione(LocalDate data, String nomeUtente, int numeroStelle, String testo) {
		this.data = data;
		this.nomeUtente = nomeUtente;
		this.setNumeroStelle (numeroStelle);
		this.testo = testo;
	}

	//GETTERS E SETTERS
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public int getNumeroStelle() {
		return numeroStelle;
	}

	public void setNumeroStelle(int numeroStelle) {
		if(numeroStelle < 1 || numeroStelle > 5) {
			throw new IllegalArgumentException("Non è possibile attribuire più di 5 stelle.");
		} else
			this.numeroStelle=numeroStelle; 
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Recensione [data=" + data 
				+ ", nomeUtente=" + nomeUtente 
				+ ", numeroStelle=" + numeroStelle 
				+ ", testo=" + testo + "]";
	}
	


} //close class
