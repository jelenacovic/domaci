package domaci_10_01_2022;

public class Proizvod {
	
	String naziv;
	double cena;
	double tezina;
	
	public void stampaj() {
		System.out.print("Naziv: " + this.naziv + ",");
		System.out.print("Cena: " + this.cena + ",");
		System.out.println("Tezina: " + this.tezina);
	}

}
