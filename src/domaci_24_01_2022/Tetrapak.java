package domaci_24_01_2022;

public class Tetrapak extends Ambalaza{
	/* Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima: atribut koji
	 * kaze da li se moze reciklirati osnovna cena gettere i setter za atribute
	 * konstuktori koji su vam potrebni racuna cenu tako da ispunjava uslova: ako je
	 * od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena); ako
	 * nije u cenu ulazi samo osnovna cena metoda stampaj stampa sve podatke iz
	 * klase tetrapak.
	 */

	private boolean isReciklaza;
	private double osnovnaCena;
	
	
	public Tetrapak() {
		super();	
	}
	
	public Tetrapak(String barkod, String naziv, double neto, double bruto, boolean isReciklaza, double osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.isReciklaza = isReciklaza;
		this.osnovnaCena = osnovnaCena;
	}
	
	public double cenaArtikla() {
		if(this.isReciklaza) {
			return this.tezina() * 1.5 + this.osnovnaCena;
		} else {
			return this.osnovnaCena;
		}
	}
	
	public void print() {
		if(this.isReciklaza) {
			System.out.println("Barkod: " + this.barkod);
			System.out.println("Naziv artikla: " + this.naziv);
			System.out.println("Tetrapak je od recikliranog materijala");
		} else {
			System.out.println("Tetrapak nije od recikliranog materijala");
		}
		System.out.println("Cena je: " + this.cenaArtikla());
		
	}
	
	
}
