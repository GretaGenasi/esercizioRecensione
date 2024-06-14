package org.generation.italy.model;
import org.generation.italy.model.*;
import java.util.*;

public class MobileApp {

	private String nome;
	private String sistemaOperativo;
	private float prezzo;
	private float ricavoTot;
	private ArrayList <String> elencoRecensioni = new ArrayList <String> ();
		
	//COSTRUTTORE
	public MobileApp(String nome, String sistemaOperativo, float prezzo) {
		super();
		this.nome = nome;
		this.sistemaOperativo = sistemaOperativo;
		this.prezzo = prezzo;
	}

	//GETTERS E SETTERS
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	//METODI:
	//1. Un solo download
	public void download() {
		ricavoTot += prezzo;
	}
	
	//2. Più download 
	public void download(int numeroDownload) {
		ricavoTot = prezzo * numeroDownload;
	}
	
	//3. Ricevi recensione
	public void riceviRecensione(String recensione) {
		if(recensione != null) {
			elencoRecensioni.add(recensione);
		} else
			throw new IllegalArgumentException("Impossibile ricevere una recensione vuota");
	}
	
	//4. valutazione media stelle
	public float valutazioneMedia() {
		if (elencoRecensioni.isEmpty()) {
			return 0;
		} 
		
		int sommaStelle = 0;
		for (String recensione : elencoRecensioni) {
			sommaStelle += recensione.getNumeroStelle();  //da capire perchè mi da errore
		}
		return(float) sommaStelle / elencoRecensioni.size();
	}
	
	
	
	
	
	
} //close MobileApp
