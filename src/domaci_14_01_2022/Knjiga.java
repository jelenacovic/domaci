package domaci_14_01_2022;

public class Knjiga {
	/* Kreirati klasu Knjiga koji ima: -ISBN -naziv -godina izdanja -autor
	 * -konstuktore koje mislite da su vam potrebni -gettere i settere za atribute
	 * -metodu print koja stampa u formatu (izbegavati dupliranje koda): (ISBN)
	 * (naziv) - (godina izdanja) autor: (ime autora) (prezime autora)
	 */
	
	private String isbn; 
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getNaziv() {
		return this.naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}
	
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	
	public void print() {
		System.out.println("ISBN: " + this.isbn);
		System.out.println(this.naziv + " - " + this.godinaIzdanja);
		System.out.println("Autor: " + this.autor.getIme() + " " + this.autor.getPrezime());
	}
}
