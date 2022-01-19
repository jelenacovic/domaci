package domaci_17_01_2022;

public class Racun {
	/* Kreirati klasu Racun koja ima: broj racuna (npr: 170-289328923-23) ime i
	 * prezime osobe trenutno stanje na racunu (npr: 100, 1220) gettere i setter za
	 * sve atribute, sem settera za stanje na racunu metodu koja menja stanje na
	 * racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od
	 * nule) metodu koja stampa podatke o racunu u formatu: Ime i prezime - broj
	 * racuna stanje na racunu je (trenutno stanje) rsd.
	 */
	
	private String broj;
	private String imePrezime;
	private double trenutnoStanje;
	
	
	
	public Racun(String broj, String imePrezime, double trenutnoStanje) {
		this.broj = broj;
		this.imePrezime = imePrezime;
		this.trenutnoStanje = trenutnoStanje;
	}
	
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
	public void transakcija(double iznos) {
		if(this.trenutnoStanje - iznos > 0) {
			this.trenutnoStanje = this.trenutnoStanje - iznos;
		} else {
			System.out.println("Nemate dovoljno na racunu");
		}
	}
	
	public void print() {
		System.out.println(this.imePrezime + " - " + this.broj);
		System.out.println("Stanje na racunu je: " + this.trenutnoStanje + " rsd");
	}
	

}
