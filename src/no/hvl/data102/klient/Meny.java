package no.hvl.data102.klient;

import no.hvl.*;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {

	public static void main(String[] args) {

	}

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.setFilmarkiv(filmarkiv);
	}

	public void Start() {
		// legg inn en den forhåndsdefinerte filmer
		// TODO
	}

	public FilmarkivADT getFilmarkiv() {
		return filmarkiv;
	}

	public void setFilmarkiv(FilmarkivADT filmarkiv) {
		this.filmarkiv = filmarkiv;
	}

}
