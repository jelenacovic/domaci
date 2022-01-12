package domaci_11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod p = new Proizvod();

		p.naziv = "Sir";
		p.cena = 55.5;
		p.tezina = 150;
		
		p.stampaj();

		int povecanje = 10;
		p.povecajCenu(povecanje);
		
		int popust = 30;
		p.vratiCenuSaPopustom(popust);
		
		int postarina = p.racunajPostarinu();
		System.out.println("Postarina je " + postarina + " din");
	
		
		
		
		
		
		
		
		Proizvod q = new Proizvod();

		q.naziv = "Keks";
		q.cena = 150;
		q.tezina = 90;
		q.stampaj();

	}

}
