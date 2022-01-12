package domaci_11_01_2022;

public class Proizvod {

	String naziv;
	double cena;
	double tezina;
	
	public void stampaj() {
		System.out.print("Naziv: " + this.naziv + ",");
		System.out.print("Cena: " + this.cena + ",");
		System.out.println("Tezina: " + this.tezina);
	}
	
	public void povecajCenu(int povecanje) {
		this.cena = this.cena + povecanje;
		
	}
	
	public double vratiCenuSaPopustom(double popust) {
		double iznos = this.cena * (100 - popust) / 100;
		return iznos;		
	}
	
	public int racunajPostarinu() {
		int postarina;
		if(this.tezina <= 100) {
			postarina = 200;
		} else if(this.tezina < 500) {
			postarina = 400;
		} else {
			postarina = 1000;
		} 
		return postarina;
	}
}
