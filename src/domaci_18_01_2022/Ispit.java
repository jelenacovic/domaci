package domaci_18_01_2022;

public class Ispit {
	/* Napisati klasu Ispit koja ima naziv predmeta, ocenu (u rasponu od 5 do 10), Ime
	 * i prezime profesora koji predaje predmet, konstuktore koje mislite da ce vam
	 * trebati, gettere i settere za sve atribute, metodu koja kaze da li je ispit
	 * polozen (polozen je ako je ocena od 6 do 10), metodu koja stampa ispit u
	 * formatu: (naziv predmeta) - (profesor) - (ocena)
	 */

	private String naziv;
	private int ocena;
	private String imePrezimeProf;
	
	
	public Ispit() {
		
	}

	public Ispit(String naziv, int ocena, String imePrezimeProf) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.imePrezimeProf = imePrezimeProf;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getImePrezimeProf() {
		return imePrezimeProf;
	}

	public void setImePrezimeProf(String imePrezimeProf) {
		this.imePrezimeProf = imePrezimeProf;
	}
	
	public boolean jePolozio() {
		return this.ocena > 5;
	}
	
	public void print() {
		System.out.println(this.naziv + " - " + this.getImePrezimeProf() + " - " + this.getOcena());
	}
	
	

}
