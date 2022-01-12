package domaci_11_01_2022;

public class SmartAirConditioning {

	String marka;
	int potrosnjaHladi;
	int potrosnjaGreje;
	double temperatura;
	String mode;

	public void stampaj() {
		System.out.println("Marka: " + this.marka + " Temperatura: " + this.temperatura + " Mode: " + this.mode);
		
	}
	
	public int mesecnaPotrosnja() {
		int racun = 0;
		if(this.mode.equals("Hladi")) {
			 racun = 30 * 15 * this.potrosnjaHladi;
		} else {
			racun = 30 * 15 * this.potrosnjaGreje;
		}
		return racun;
	}
	
	public int potrosnjaKlime() {
		int iznos =0;
		if(this.mesecnaPotrosnja() < 350) {
			iznos = this.mesecnaPotrosnja() * 6;
		} else {
			iznos = this.mesecnaPotrosnja() * 9;
		}
		return iznos;
	
	}

}
