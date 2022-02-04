package no.hvl.data102;

import no.hvl.data102.klient.Sjanger;

public class Film {

	private int filmnr;
	private String produsent;
	private String tittel;
	private int releaseYear;
	private Sjanger sjanger;// Skal endres
	private String utgiver;
	
	public Film() {
		
	}
	public Film(int filmnr, String produsent, String tittel, int releaseYear, Sjanger sjanger, String utgiver) {
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.releaseYear = releaseYear;
		this.sjanger = sjanger;
		this.utgiver = utgiver;
	}

	public int getFilmnr(int filmnr) {
		return this.filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent(String produsent) {
		return this.produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTittel(String tittel) {
		return this.tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getReleaseYear(int releaseYear) {
		return this.releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Sjanger getSjanger(Sjanger sjanger) {
		return this.sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getUtgiver(String utgiver) {
		return this.utgiver;
	}

	public void setUtgiver(String utgiver) {
		this.utgiver = utgiver;
	}

	//Not complete
	@Override
	public boolean equals(Object film) {
		if (this.filmnr == this.getFilmnr(filmnr))
			return true;
		else
			return false;
	}

	//Not Complete
	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}
}
