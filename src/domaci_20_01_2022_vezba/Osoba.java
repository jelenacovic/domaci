package domaci_20_01_2022_vezba;

public class Osoba {
	/* Kreirati klasu Osoba koja ima: ime i prezime jmbg godinu rodjenja default-ni
	 * konstuktor, konstuktor sa parametrima, gettere i settere, metodu stampaj koja
	 * stampa u formatu: (ime i prezime), (jmbg), (godina rodjenja)
	 */
	
	protected String imePrezime;
	protected String jmbg;
	protected int godRodjenja;
	
	public Osoba() {
		
	}
	
	public Osoba(String imePrezime, String jmbg, int godRodjenja) {
		this.imePrezime = imePrezime;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}
	
	public void print() {
		System.out.println(this.imePrezime + ", " + this.jmbg + ", " + this.godRodjenja);
	}
	
	

}
