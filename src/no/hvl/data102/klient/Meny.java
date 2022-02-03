package no.hvl.data102.klient;

import no.hvl.*;

public class Meny {

	public static void main(String[] args) {

	}

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}

	public void Start() {
		// legg inn en den forhåndsdefinerte filmer
		// TODO
	}

}
