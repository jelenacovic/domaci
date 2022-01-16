package domaci_14_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Proizvod p = new Proizvod(1, "banane", 110);
		
		Vaga v = new Vaga();
		v.setProizvod(p);
		v.setMernaJedinica("kg");
		v.print(5);
	}

}
