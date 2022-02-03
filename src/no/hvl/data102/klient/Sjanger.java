package no.hvl.data102.klient;

public enum Sjanger {
	KRIM, KOMEDIE, DRAMA;
	
	public static void main(String[]args) {
		Sjanger s1 =Sjanger.KRIM;
		System.out.println(s1);
	}
	public int antall() {
		int lengde = Sjanger.values().length;
			return lengde;	
	}
}
