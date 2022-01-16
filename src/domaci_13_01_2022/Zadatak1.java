package domaci_13_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		FacebookPost fb = new FacebookPost("Jelena Covic", "Pera Peric", "Cao!");
		fb.like();
		fb.dislike();
		fb.share();
		fb.print();
		
		FacebookPost q = new FacebookPost("Janko Jankovic", "Zivka Zivkovic", "Pozdrav");
		q.like();
		q.dislike();
		q.share();
		q.print();

	}

}
