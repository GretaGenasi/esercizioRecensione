package org.generation.italy;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.generation.italy.model.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		
		//Chiedere inserimento nome, sistema operativo e prezzo dell'app
		System.out.println("Ciao! \n\n");
		System.out.print("Inserisci nome dell'app: ");
		String nome = sc.nextLine();
		
		System.out.print("Inserisci il sistema operativo: ");
		String sistemaOperativo = sc.nextLine();
		
		System.out.println("Inserisci il prezzo dell'app: ");
		float prezzo = sc.nextFloat();
		sc.nextLine();
		
		MobileApp m = new MobileApp(nome, sistemaOperativo, prezzo);
		
		//Creazione del menu
		boolean esci = false;
		while (!esci) {
			System.out.println("Seleziona un numero dal menu: ");
			System.out.println("1. Download singolo");
			System.out.println("2. Download multiplo");
			System.out.println("3. Ricevi recensione");
			System.out.println("4. Visualizza recensioni");
			System.out.println("5. Esci");
			System.out.print("\n Sccegli un'opzione: ");
			String scelta = sc.nextLine();
			
			switch(scelta) {
			//download singolo
			case "1": 
				m.download();
				break;
			
			//download multiplo
			case "2":
				System.out.print("Inserisci il numero di download: ");
				int nDownload = sc.nextInt();
				sc.nextLine();
				m.download(nDownload);
				break;
			
			//ricevi recensioni
			case "3":
				System.out.print("Inserisci il nome utente: ");
				String nomeUtente = sc.nextLine();
				
				System.out.print("Inserisci il numero di stelle: ");
				int numeroStelle = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Inserisci il testo della recensione: ");
				String testo = sc.nextLine();
				
				Recensione r = new Recensione(null, nomeUtente, numeroStelle, testo);
				m.riceviRecensione(r);
				break;
			
				
			//visualizza recensioni
			case "4":
				
			
			//esci
			case "5":
				esci = true;
				break;
				
			default:
				System.out.println("Opzione non valida");
				break;
	
			}
		}
		

	} //close main

}
