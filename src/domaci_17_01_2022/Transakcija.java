package domaci_17_01_2022;

public class Transakcija {
	/*
	 * Kreirati klasu Transakcija koja ima: id transakcije, racun sa kog se prenose
	 * sredstva, racun na koji se prenose sredstva, gettere i settere, konstruktore,
	 * privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja
	 * se racuna: ako je prenos sredstava manji od 4500, provizija je fiksna 45 ako
	 * je prenos sredstava veci od 4500, provizija je 1% S obzirom da se provizija
	 * racuna na osnovu visine transakcije, znaci da metoda prima parametar koji
	 * predstavlja visinu transakcije Ukoliko ne znate da resite ovu metodu, u
	 * metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
	 * metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na
	 * drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
	 * Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) +
	 * (provizija), a na drugi racun dodaje samo (trazena suma). (Za vezbanje)
	 * Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava.
	 * metodu koja stampa podatke o transakciji u formatu: id transkacije Racun sa:
	 * Ime i prezime - broj racuna Racun na: Ime i prezime - broj racuna
	 */

	private String id;
	private Racun posiljalc;
	private Racun primalac;

	
	public Transakcija(String id, Racun posiljalac, Racun primalac) {
		this.id = id;
		this.posiljalc = posiljalac;
		this.primalac = primalac;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getPosiljalc() {
		return posiljalc;
	}

	public void setPosiljalc(Racun posiljalc) {
		this.posiljalc = posiljalc;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}

	public double provizija(double iznos) {
		if (iznos <= 4500) {
			return 45;
		} else {
			return iznos * 0.01;
		}
	}

	public void izvrsiTransakciju(double iznos) {
		if(this.posiljalc.getTrenutnoStanje() - iznos > 0) {
			this.posiljalc.transakcija(iznos + provizija(iznos));
			this.primalac.transakcija(-iznos);
		}
	}
	
	public void print() {
		System.out.println(this.id);
		System.out.println("Racun sa: " + this.posiljalc.getImePrezime() + " - " + this.posiljalc.getBroj());
		System.out.println("Racun na: " + this.primalac.getImePrezime() + " - " + this.primalac.getBroj());
	}

}
