package domaci_18_01_2022;

import java.util.ArrayList;

public class Student {
	/* Napisati klasu Student koja ima broj indeksa, ime i prezime, tip studija
	 * (osnovne, master, doktorske), niz ispita, konstuktore koje mislite da ce vam
	 * trebati, gettere i settere za indeks, ime i prezime, tip studija, getter za niz
	 * predmeta, metodu dodaj ispit u niz ispita, metodu koja racuna prosek na
	 * studijama (u prosek se ubrajaju samo polozeni ispiti), metodu stampaj koja
	 * stampa u formatu: (broj indeksa) - (ime i prezime) - (tip studija) Predmeti:
	 * (naziv predmeta) - (profesor) - (ocena) (naziv predmeta) - (profesor) -
	 * (ocena) (naziv predmeta) - (profesor) - (ocena) Prosecna ocena: (prosecna
	 * ocena)
	 */

	private int brojIndeksa;
	private String imePrezime;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	
	public Student() {
		
	}
	
	public Student(int brojIndeksa, String imePrezime, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.imePrezime = imePrezime;
		this.tipStudija = tipStudija;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	
	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}
	
	public double racunajProsek() {
		double brPolozenih = 0;
		double suma = 0;
		for(int i = 0; i < ispiti.size(); i++) {
			if(ispiti.get(i).jePolozio()) {
				suma = suma + ispiti.get(i).getOcena();
				brPolozenih = brPolozenih + 1;
			}
		}
		
		double prosecnaOcena = suma /  brPolozenih;
		
		return prosecnaOcena;	
	}
	
	public void stampaj() {
		System.out.println(this.brojIndeksa + " - " + this.imePrezime + " - " + this.tipStudija);
		System.out.println("Predmeti:");
		for(int i = 0; i < ispiti.size(); i++) {
			this.ispiti.get(i).print();
		}
		System.out.println("Prosecna ocena: " + this.racunajProsek());
	}
	

}
