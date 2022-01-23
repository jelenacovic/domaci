package domaci_21_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Menadzer menadzer = new Menadzer("Jelena Covic");
		
		Magacioner magacioner = new Magacioner("Pera Peric");
		
		Sektor sektor1 = new Sektor("Transport", 45000);
		Sektor sektor2 = new Sektor("Logistika", 50000);
		Sektor sektor3 = new Sektor("Prodaja", 65000);
		
		menadzer.zaposli(sektor3);
		
		magacioner.zaposli(sektor1);
		magacioner.zaposli(sektor2);
		
		
		System.out.println("Plata menadzera " + menadzer.getImePrezime() + " je: " + menadzer.plata());
		System.out.println("Plata magacionera " + magacioner.getImePrezime() + " je: " + magacioner.plata());
	}

}
