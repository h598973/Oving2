package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.klient.*;
import java.util.ArrayList;

public class Filmarkiv implements FilmarkivADT {

	private int antall = 0;
	
	ArrayList <Filmarkiv> filma = new ArrayList<Filmarkiv>(antall);
	
	public Filmarkiv(Film[] filma) {
		
	}

	public void visFilm(int nr) {
	}

	public void leggTilFilm(Film nyfilm) {
		
	}

	public boolean slettFilm(int filmnr) {
		filma.remove(filmnr);
	}

	public Film[] soekTittel(String delstreng) {
		return null;
	}

	public int antall(Sjanger sjanger) {
		return sjanger.antall();
	}

	public int antall() {
		return filma.size();
	}

}
