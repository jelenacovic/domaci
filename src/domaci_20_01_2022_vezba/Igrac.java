package domaci_20_01_2022_vezba;

import java.util.ArrayList;

public class Igrac extends Osoba {
	/* Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima: broj (broj koji
	 * igrac nosi) poziciju koju igra (odbrambeni, napadac, … ) niz kartona kapiten
	 * (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
	 * default-ni konstuktor konstuktor sa parametrima gettere i settere za broj,
	 * kapiten i poziciju, metodu dodaj karton, gde se dodaje karton u niz metodu
	 * koja vraca broj zutih kartona metodu koja vraca broj crvenih kartona metodu
	 * stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o
	 * igracu
	 */
	
	private int broj;
	private String pozicija;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();
	private boolean kapiten;
	
	public Igrac() {
		super();
	}

	public Igrac(String imePrezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean kapiten) {
		super(imePrezime, jmbg, godRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void dodajKarton(Karton karton) {
			kartoni.add(karton);
	}
	
	public int brZutih() {
		int brZutih = 0;
		for(int i = 0; i < kartoni.size(); i++) {
			if(kartoni.get(i).getTip().equals("zuti")){
			brZutih++;	
			}
		}
		return brZutih;
	}
	
	public int brCrvenih() {
		int brCrvenih = 0;
		for(int i = 0; i < kartoni.size(); i++) {
			if(kartoni.get(i).getTip().equals("crveni")) {
				brCrvenih++;
			}
		}
		return brCrvenih;
	}
	
	public void print() {
		super.print();
		System.out.println("Broj dresa: " + this.broj + " Pozicija: " + this.pozicija);
		if(isKapiten() == true) {
			System.out.println("Igrac je kapiten");
		} else {
			System.out.println("Igrac nije kapiten");
		}
		
		System.out.println("Broj zutih kartona: " + this.brZutih() + " Broj crvenih kartona: " + this.brCrvenih());
	}
	
	

	

}
