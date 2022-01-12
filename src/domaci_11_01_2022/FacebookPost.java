package domaci_11_01_2022;

public class FacebookPost {

	String korisnik;
	String profil;
	String tekst;
	int brLajkova;
	int brDeljenja;

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
