package domaci_24_01_2022;

import java.util.ArrayList;

public class Korpa {
	/* Kreirati klasu Korpa koja ima: niz ambalaza metodu dodaj ambalazu metodu
	 * izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba
	 * izbaciti privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda
	 * kao parametar prima popust. metodu koja racuna i vraca ukupncu cenu korpe
	 * (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz
	 * koje se cita popust.
	 */
	
	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		ambalaze.add(ambalaza);
	}
	
	public void izbaciAmbalazu(String barkod) {
		for(int i = 0; i < ambalaze.size(); i++) {
			if(this.ambalaze.get(i).getBarkod().equals(barkod)) {
				this.ambalaze.remove(i);
			}
		}	
	}
	
	private double cenaSaPopustom(double popust) {
		double suma = 0;
		for(int i = 0; i < ambalaze.size(); i++) {
			suma = suma + this.ambalaze.get(i).cenaArtikla();
		}
		return suma - (suma * popust / 100);
	}
	
	public double ukupnaCena(SuperKartica superKartica) {
		return cenaSaPopustom(superKartica.getPopust());
	}
	
	public void print() {
		System.out.println("Lista artikala u korpi: ");
		for (int i = 0; i < ambalaze.size(); i++) {
			ambalaze.get(i).print();
		}
	}
}
