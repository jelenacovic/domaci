package domaci_11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning c = new SmartAirConditioning();

		c.marka = "Samsung";
		c.potrosnjaHladi = 1;
		c.potrosnjaGreje = 2;
		c.temperatura = 20;
		c.mode = "Hladi";
		
		c.stampaj();
		
		int x = c.mesecnaPotrosnja();
		System.out.println("Mesecna potrosnja je: " + x + " kW/h");
		
		int y = c.potrosnjaKlime();
		System.out.println("Ukupna cena potrosnje je: " + y + " din");

		
		
		
		
		
		
		
		
		
		
		SmartAirConditioning a = new SmartAirConditioning();

		a.marka = "Galanz";
		a.potrosnjaHladi = 1;
		a.potrosnjaGreje = 3;
		a.temperatura = 30;
		a.mode = "Greje";
		a.stampaj();

	}

}
