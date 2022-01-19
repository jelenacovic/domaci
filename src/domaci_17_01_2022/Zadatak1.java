package domaci_17_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		/* U glavnoj klasi: kreirati niz od 10tak zelenih kartona za ispite i odstampati
		 * podatke za sve ispite (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve
		 * ispite (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih
		 * ispita
		 */

		ArrayList<ZeleniKarton> karton = new ArrayList<ZeleniKarton>();

		ZeleniKarton karton1 = new ZeleniKarton("Jelena Covic", 403, "Opsta hemija", "N. N.", 9);
		ZeleniKarton karton2 = new ZeleniKarton("Jelena Covic", 403, "Biohemija", "I. P.", 9);
		ZeleniKarton karton3 = new ZeleniKarton("Jelena Covic", 403, "Industrijski procesi", "M. R.", 10);
		ZeleniKarton karton4 = new ZeleniKarton("Jelena Covic", 403, "Bioanaliticka hemija", "I. R.", 8);
		ZeleniKarton karton5 = new ZeleniKarton("Jelena Covic", 403, "Korozija metala", "A. B.", 10);
		ZeleniKarton karton6 = new ZeleniKarton("Jelena Covic", 403, "Industrijska hemija 1", "A. B.", 10);
		ZeleniKarton karton7 = new ZeleniKarton("Jelena Covic", 403, "Industrijska 2", "M. M,", 10);
		ZeleniKarton karton8 = new ZeleniKarton("Jelena Covic", 403, "Kinetika i kataliza", "E. P.", 10);
		ZeleniKarton karton9 = new ZeleniKarton("Jelena Covic", 403, "Organska sinteza", "G. P.", 8);
		ZeleniKarton karton10 = new ZeleniKarton("Jelena Covic", 403, "HPP", "D. K. ", 10);
		ZeleniKarton karton11 = new ZeleniKarton("Jelena Covic", 403, "Organska hemija 2", "N. R.", 5);

		karton.add(karton1);
		karton.add(karton2);
		karton.add(karton3);
		karton.add(karton4);
		karton.add(karton5);
		karton.add(karton6);
		karton.add(karton7);
		karton.add(karton8);
		karton.add(karton9);
		karton.add(karton10);
		karton.add(karton11);

		
		for (int i = 0; i < karton.size(); i++) {
			karton.get(i).stampaj();
		}

	
		double suma = 0;
		for (int i = 0; i < karton.size(); i++) {
			suma = suma + karton.get(i).getOcena();
		}
		double avg = suma / karton.size();

		System.out.println("Prosecna ocena je: " + avg);

		
		double brPolozenih = 0;
		double suma1 = 0;
		for (int i = 0; i < karton.size(); i++) {
			if (karton.get(i).polozio()) {

				suma1 = suma1 + karton.get(i).getOcena();
				brPolozenih = brPolozenih + 1;
			}

		}
		
		double avg1 = suma1 / brPolozenih;
		System.out.println("Prosecna ocena polozenih ispita je: " + avg1);

	}

}
