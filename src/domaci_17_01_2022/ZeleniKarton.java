package domaci_17_01_2022;

public class ZeleniKarton {
	/* Kreirati klasu ZeleniKarton koja ima: ime i prezime studenta broj indeksa
	 * naziv predmeta ime i prezime profesora ocenu - od 5 do 10 gettere i settere
	 * konstruktore metodu koja vraca da li je ispit polozen ili ne (ispit je
	 * polozen ako je ocena veca od 5) metodu stampaj koja stampa podatke u formatu:
	 * (naziv predmeta) - (ocena) Student: ime i prezime, broj indeksa Profesor: ime
	 * i prezime
	 */

	private String imePrezimeStudenta;
	private int brojIndeksa;
	private String nazivPredmeta;
	private String imePrezimeProf;
	private int ocena;

	public ZeleniKarton() {

	}

	public ZeleniKarton(String imePrezimeStudenta, int brojIndeksa, String nazivPredmeta, String imePrezimeProf,
			int ocena) {
		this.imePrezimeStudenta = imePrezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imePrezimeProf = imePrezimeProf;
		this.ocena = ocena;
	}

	public String getImePrezimeStudenta() {
		return imePrezimeStudenta;
	}

	public void setImePrezimeStudenta(String imePrezimeStudenta) {
		this.imePrezimeStudenta = imePrezimeStudenta;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImePrezimeProf() {
		return imePrezimeProf;
	}

	public void setImePrezimeProf(String imePrezimeProf) {
		this.imePrezimeProf = imePrezimeProf;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean polozio() {
		return this.ocena > 5;
	}

	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		if (this.polozio()) {
			System.out.println("Student: " + this.imePrezimeStudenta + ", " + this.brojIndeksa);
			System.out.println("Profesor: " + this.imePrezimeProf);
		} else {
			System.out.println("Student: " + this.imePrezimeStudenta + ", " + this.brojIndeksa);
			System.out.println("Profesor: " + this.imePrezimeProf);
			System.out.println("Nije polozio");
		}

	}

}
