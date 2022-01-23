package domaci_21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {
	/* Kreirati abstraktnu klasu Radnik koja ima: ime i prezime, niz sektora u kojima
	 * radi, abstraktnu metodu koja vraca platu radnika, metodu zaposli u sektor 
	 * kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	 */
	
	protected String imePrezime;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	
	
	public Radnik(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	
	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}



	public abstract double plata();
	
	public void zaposli(Sektor sektor) {
		this.sektori.add(sektor);
		}

}
