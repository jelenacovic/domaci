package domaci_14_01_2022;

public class Vaga {
	/* Kreirati klasu Vaga koja ima: merna jedinica (kg ili lb) proizvod (proizvod
	 * koji se meri) default-ni konstuktor getteri i setteri za sve atribute metodu
	 * sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar
	 * funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena.
	 * metodu stampaj koja stampa racun u formatu: (sifra) - (naziv) (cena za
	 * odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) Ukupno: (ukupna
	 * cena)
	 */
	
	private String mernaJedinica;
	private Proizvod proizvod;
	
	public Vaga() {
		
	}
	
	public String getMernaJedinica() {
		return this.mernaJedinica;
	}
	
	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}
	
	public Proizvod getProizvod() {
		return this.proizvod;
	}
	
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	public double izracunajCenu(int tezina) {
		if(this.mernaJedinica.equals("kg")) {
			return tezina * this.proizvod.getCenaKg();
		} else if(this.mernaJedinica.equals("lb")) {
			return tezina * this.proizvod.getCenaLb();
		}
		return 0;
	}
	
	public void print(int tezina) {
		this.proizvod.print();
		if(this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + " kg x " + tezina);
		} else {
			System.out.println(this.proizvod.getCenaLb() + " lb x " + tezina);
		}
		System.out.println("Ukupno: " + this.izracunajCenu(tezina));
	}

}
