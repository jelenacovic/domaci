package domaci_20_01_2022_vezba;

public class Zadatak2_vezbanje {

	public static void main(String[] args) {
		
		Igrac player = new Igrac("Jelena Covic", "728234", 1991, 5, "centar", true);
		
		Karton karton1 = new Karton("zuti");
		Karton karton2 = new Karton("crveni");
		
		player.dodajKarton(karton1);
		
		player.print();

	}

}
