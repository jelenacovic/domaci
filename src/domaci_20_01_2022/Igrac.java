package domaci_20_01_2022;

public class Igrac extends Osoba {
	/* Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima: broj (broj koji
	 * igrac nosi) poziciju koju igra (odbrambeni, napadac, … ) kapiten (promenljiva
	 * koja kaze da li je igrac kapiten tima, i tipa je boolean, default-ni
	 * konstuktor konstuktor sa parametrima gettere i settere za broj, kapiten i
	 * poziciju, metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve
	 * informacije o igracu
	 */
	
	private int broj;
	private String pozicija;
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
	
	public void print() {
		super.print();
		System.out.println("Broj " + this.broj + " Pozicija: " + this.pozicija);
		if(this.isKapiten() == true) {
			System.out.println("Igrac je kapiten");
		} else {
			System.out.println("Igrac nije kapiten");
		}
	}
	
	
	
	

}
