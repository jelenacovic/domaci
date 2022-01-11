package domaci_10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		SmartAirConditioning c = new SmartAirConditioning();
		
		c.marka =  "Samsung";
		c.temperatura = 20;
		c.mode = "Hladi";
		c.stampaj();
		
		
		SmartAirConditioning a = new SmartAirConditioning();
		
		a.marka = "Galanz";
		a.temperatura = 30;
		a.mode = "Greje";
		a.stampaj();

	}

}
