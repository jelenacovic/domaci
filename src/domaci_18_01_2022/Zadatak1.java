package domaci_18_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		
		ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
		
		Student s = new Student(403, "Jelena Covic", "doktorske");
		
		s.dodajIspit(new Ispit("Opsta hemija", 9, "N. N"));
		s.dodajIspit(new Ispit("Bioanaliticka hemija", 8, "I. R."));
		s.dodajIspit(new Ispit("Industrijski procesi", 10, "M. R."));
		s.dodajIspit(new Ispit("Korozija metala", 10, "A. B."));
		
		s.stampaj();

	}

}
