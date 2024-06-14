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
		this.nome = nome;
		this.sistemaOperativo = sistemaOperativo;
		this.prezzo = prezzo;
	}

	//GETTERS E SETTERS
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	
	public void setSistemaOperativo(String sistemaOperativo) {
		if(sistemaOperativo == null || sistemaOperativo.isEmpty()) {
			throw new IllegalArgumentException("Il sistema operativo non può essere vuoto");
		}
		this.sistemaOperativo = sistemaOperativo;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Il nome non può essere vuoto");
		}
		this.nome = nome;
	}

	public void setPrezzo(float prezzo) {
		if(prezzo<0) {
			throw new IllegalArgumentException("Il prezzo non può essere negativo");
		}
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
	public void riceviRecensione(Recensione recensione) {
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
			sommaStelle += recensione.getNumeroStelle();
		}
		return(float) sommaStelle / elencoRecensioni.size();
	}
	
	
	
	
	
	
} //close MobileApp
