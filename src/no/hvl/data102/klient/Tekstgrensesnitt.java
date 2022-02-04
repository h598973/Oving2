package no.hvl.data102.klient;


import java.util.Scanner;

import no.hvl.*;
import no.hvl.data102.Film;

public class Tekstgrensesnitt {
	// Lese opplysningene om en FILM fra tastatur.
	public static void main(String[] args) {

	}
	
	//Error
	public Film lesFilm() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Filmnr?");
		int filmnr = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Produsent");
		String produsent = scanner.nextLine();
		
		System.out.println("Tittel?");
		String tittel = scanner.nextLine();
		
		System.out.println("Releaseyear?");
		int releaseYear = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Sjanger");
		String sjanger = scanner.nextLine();
		
		System.out.println("Utgiver?");
		String utgiver = scanner.nextLine();
		
		scanner.close();
		
		return film(filmnr,produsent,tittel,releaseYear,sjanger,utgiver);
		
		
	}//End lesFilm

	// Vise en film med alle opplysningene på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		// TODO
	}// End visFilm

	// Skriv ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		// TODO
	}//End skrivUtFilmDelstrengTittel

	// Skriv ut alle Filmer av en produsent/gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		// TODO
	}//End skrivUtFilmProdusent

	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt og hvor
	// mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		// TODO
	}//End skrivUtStatistikk
	// -EV andre metoder

}//End Tekstgrensesnitt
