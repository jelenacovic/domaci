package domaci_11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		FacebookPost fb = new FacebookPost();
		fb.korisnik = "Jelena Covic";
		fb.profil = "Pera Peric";
		fb.tekst = "Welcome";
		fb.brLajkova = 10;
		fb.brDeljenja = 5;
		
		
		fb.like();
		
		fb.dislike();
		
		fb.share();
		
		fb.print();

	}

}
