package domaci_13_01_2022;

public class FacebookPost {
	/* Od atributa:
	ime i prezime korisnika koji je objavio post
	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
	tekst objave
	broj lajkova
	broj deljenja
	  Od gettera i settera:
	korisnik moze da procita bilo koji atribut 
	ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
	 Konstruktore:
		konstruktori koji su potrebni i logicni
	  Od metoda:
	like(), koja povecava broj lajkova za 1.
	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
	share(), koja povecava broj deljenja za 1
	print(), koja stampa objavu u formatu:
	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
	(tekst objave)
	Likes (broj lajkova) | Shares (broj deljenja) */

	private String korisnik;
	private String profil;
	private String tekst;
	private int brLajkova;
	private int brDeljenja;
	
	public FacebookPost(String korisnik, String profil, String tekst) {
		this.korisnik = korisnik;
		this.profil = profil;
		this.tekst = tekst;
	}
	
	public String getKorisnik() {
		return this.korisnik;
	}
	
	public void setKorisnik(String korisnik) {
		this.korisnik = korisnik;
	}
	
	public String getProfil() {
		return this.profil;
	}
	
	public void setProfil(String profil) {
		this.profil = profil;
	}
	
	public String getTekst() {
		return this.tekst;
	}
	
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	public void setBrLajkova(int brLajkova) {
		this.brLajkova = brLajkova;
	}
	
	public void setBrDeljenja(int brDeljenja) {
		this.brDeljenja = brDeljenja;
	}
	
	public void like() {
		this.brLajkova = this.brLajkova + 1;
	}

	public void dislike() {
		if (this.brLajkova >= 1) {
			this.brLajkova = this.brLajkova - 1;
		} else {
			this.brLajkova = 0;
		}
	}

	public void share() {
		this.brDeljenja = this.brDeljenja + 1;
	}

	public void print() {
		System.out.println(this.korisnik + " >>>> " + this.profil);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.brLajkova + " | " + this.brDeljenja);
	}

}
