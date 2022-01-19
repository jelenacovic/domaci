package domaci_17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Racun racunPosiljalac = new Racun("180-428422-02", "Jelena Covic", 15000);
		Racun racunPrimalac = new Racun("170-83131-98", "Pera Peric", 5000);
		
		Transakcija transakcija = new Transakcija("id 123", racunPosiljalac, racunPrimalac);
		
		transakcija.izvrsiTransakciju(3000);
		
		transakcija.print();

	}

}
