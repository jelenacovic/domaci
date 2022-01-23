package domaci_21_01_2022;

public class Menadzer extends Radnik {
	/* Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima: override uje
	 * metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	 */
	public Menadzer(String imePrezime) {
		super(imePrezime);
	}
	
	public double plata() {
		double plata = 0;
		for(int i = 0; i < sektori.size(); i++) {
		plata = sektori.get(i).getPlata() + plata;
		}
		return plata;
	}
	

}
