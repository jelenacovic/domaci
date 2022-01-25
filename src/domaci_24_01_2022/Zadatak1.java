package domaci_24_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Korpa k = new Korpa();
		
		SuperKartica kartica = new SuperKartica(123, "Jelena Covic", 20);
		
		Ambalaza prva = new StaklenaAmbalaza("1223-1334", "Sok", 20, 30, 10, true, 15);
		Ambalaza druga = new Tetrapak("4556-232", "Mleko", 30, 40, true, 80);
		Ambalaza treca = new StaklenaAmbalaza("1213-1344", "Pivo", 30, 40, 10, false, 15);
		
		k.dodajAmbalazu(druga);
		k.dodajAmbalazu(prva);
		k.dodajAmbalazu(treca);
	
	
		kartica.print();
		
		k.print();
		
		System.out.print("Ukupna cena korpe je: " + k.ukupnaCena(kartica) + " rsd");

	}

}
