package domaci_20_01_2022;

public class Trener extends Osoba {
	/* Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima: godine iskustva,
	 * tip trenera (kondicioni, za igru, pomocni, personalni), metodu stampaj, koju
	 * prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	 */
	
	private int godIskustva;
	private String tip;
	
	
	public Trener() {
		super();
	}
	
	public Trener(String imePrezime, String jmbg, int godRodjenja, int godIskustva, String tip) {
		super(imePrezime, jmbg, godRodjenja);
		this.godIskustva = godIskustva;
		this.tip = tip;
	}
	
	public void print() {
		super.print();
		System.out.println("Godine iskustva: " + this.godIskustva + ", Tip trenera: " + this.tip);
	}
	
	

}
