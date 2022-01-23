package domaci_20_01_2022_vezba;

public class Karton {

	/* Kreirati klasu Karton koja ima: tip kartona (crveni, zuti) konstuktore za
	 * koje mislite da ce vam trebati gettere i settere za karton
	 */
	
	private String tip;
	
	public Karton() {
		
	}
	
	public Karton(String tip) {
		this.tip = tip;
	}

	public String getTip() {
		return tip;
	}

	public void setKarton(String tip) {
		this.tip = tip;
	}
}
