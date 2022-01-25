package domaci_24_01_2022;

public class StaklenaAmbalaza extends Ambalaza{
	/* Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
	 * kaucija za flasu atribut koji kaze da li se za flasu placa kaucija osnovna
	 * cena gettere i setter za atribute konstuktori koji su vam potrebni racuna
	 * cenu ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija); ako se ne placa,
	 * (osnovna cena) * 1.2 metoda stampaj stampa sve podatke iz klase staklena
	 * flasa.
	 */

	private double kaucija;
	private boolean isKaucija;
	private double osnovnaCena;
	
	public StaklenaAmbalaza() {
		super();
	}
	
	public StaklenaAmbalaza(String barkod, String naziv, double neto, double bruto, double kaucija, boolean isKaucija, double osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.kaucija = kaucija;
		this.isKaucija = isKaucija;
		this.osnovnaCena = osnovnaCena;
	}
	
	public double cenaArtikla() {
		if(this.isKaucija) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}
	
	public void print() {
		if(this.isKaucija) {
			System.out.println("Barkod: " + this.barkod);
			System.out.println("Naziv artikla: " + this.naziv);
			System.out.println("Kaucija za flasu se placa i iznosi: " + this.kaucija);
		} else {
			System.out.println("Kaucija za flasu se ne placa");
		}
		System.out.println("Cena je: " + this.cenaArtikla());
	}
	
	
}
