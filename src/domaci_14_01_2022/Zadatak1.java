package domaci_14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Autor author = new Autor("Oskar", "Vajld");
		
		Knjiga book = new Knjiga("978-86-10-00558-5", "Slika Dorijana Greja", 1890, author);
		book.print();

	}

}
