package domaci_17_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Ringla goreLevo = new Ringla("obicna", 1);
		Ringla goreDesno = new Ringla("obicna", 1);
		Ringla doleLevo = new Ringla("obicna", 1);
		Ringla doleDesno = new Ringla("obicna", 1);
		
		ElektricniSporet sporet = new ElektricniSporet("Bosh", 5, 1, goreLevo, goreDesno, doleLevo, doleDesno);
		
		sporet.pojacaj(1);
		sporet.pojacaj(2);
		sporet.pojacaj(3);
		sporet.pojacaj(4);
		sporet.pojacaj(3);
		sporet.pojacaj(3);
		
		sporet.print();
		System.out.println("Ukupna potrosnja je: " + sporet.ukupnaPotrosnja(10));

	}

}
