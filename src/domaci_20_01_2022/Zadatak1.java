package domaci_20_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		//Igrac player1 = new Igrac("Jelena Covic", "1837482", 1991, 17, "centar", true);
		//Igrac player2 = new Igrac("Pera Peric", "6381372", 1989, 4, "krilo", false);
		
	//	player1.print();
		
		//Trener coach1 = new Trener("Zika Zikic", "6329381", 1987, 10, "kondicnioni");
		//Trener coach2 = new Trener("Marko Markovic", "631313", 1980, 13, "za igru");
		
		//coach1.print();
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		
		System.out.print("Unesite broj igraca: ");
		int n = s.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = s.next();
			System.out.print("Unesite JMBG: ");
			String jmbg = s.next();
			System.out.print("Unesite godinu rodjenja: ");
			int god = s.nextInt();
			System.out.print("Unesite broj dresa: ");
			int br = s.nextInt();
			System.out.print("Unesite poziciju: ");
			String pozicija = s.next();
			System.out.print("Da li je igrac kapiten: ");
			boolean kapiten = s.nextBoolean();
			
			
			Igrac player = new Igrac(imePrezime, jmbg, god, br, pozicija, kapiten);
			igraci.add(player);
		}
		
		for(int i =0; i < igraci.size(); i++) {
			igraci.get(i).print();
		}
		
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		
		System.out.print("Unesite broj trenera: ");
		int m = s.nextInt();
		
		
		for(int i = 0; i < m; i++) {
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = s.next();
			System.out.print("Unesite JMBG: ");
			String jmbg = s.next();
			System.out.print("Unesite godinu rodjenja: ");
			int god = s.nextInt();
			System.out.print("Unesite broj godina iskustva: ");
			int br = s.nextInt();
			System.out.print("Unesite tip: ");
			String tip = s.next();
			
			
			Trener coach = new Trener(imePrezime, jmbg, god, br, tip);
			treneri.add(coach);
		}
		
		for(int i = 0; i < treneri.size(); i++) {
			treneri.get(i).print();
		}
	
		

	}

}
