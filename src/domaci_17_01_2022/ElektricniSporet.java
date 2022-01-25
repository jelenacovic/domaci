package domaci_17_01_2022;

public class ElektricniSporet {
	/*
	 * Kreirati klasu ElektricniSporet koja ima: marku storeta (npr: Beko, Bosh)
	 * garanciju kao broj godina maksimalan broj ukljucenih ringli u istom trenutku
	 * (1, 2, 3 ili 4) 4 ringle gore levo gore desno dole levo dole desno
	 * konstruktor koji postavlja sve atribute gettere za sve atribut ne postoje
	 * setteri metodu pojacaj kojoj se prosledjuje pozicija ringle pozicija 1 je
	 * ringla gore levo pozicija 2 je ringla gore desno pozicija 3 je ringla dole
	 * levo pozicija 4 je ringla dole desno Ako se prelazi maksimalan broj
	 * ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se
	 * pojacava u tom pozivu funkije Za gasenje ringli iskoristite metodu koja je
	 * definisana ispod 👇 metodu iskljuci ringlu kojoj se prosledjuje pozicija
	 * ringle pozicija 1 je ringla gore levo pozicija 2 je ringla gore desno
	 * pozicija 3 je ringla dole levo pozicija 4 je ringla dole desno metodu koja
	 * racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira
	 * potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
	 * metodu koja stampa podatke u formatu:
	 */

	private String marka;
	private int garancija;
	private int maxBrUkljucenihRingli;
	private Ringla goreLevo;
	private Ringla goreDesno;
	private Ringla doleLevo;
	private Ringla doleDesno;

	public ElektricniSporet() {

	}

	public ElektricniSporet(String marka, int garancija, int maxBrUkljucenihRingli, Ringla goreLevo, Ringla goreDesno,
			Ringla doleLevo, Ringla doleDesno) {
		this.marka = marka;
		this.garancija = garancija;
		this.maxBrUkljucenihRingli = maxBrUkljucenihRingli;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
	}

	public String getMarka() {
		return marka;
	}

	public int getGarancija() {
		return garancija;
	}

	public int getMaxBrUkljucenihRingli() {
		return maxBrUkljucenihRingli;
	}

	public Ringla getGoreLevo() {
		return goreLevo;
	}

	public Ringla getGoreDesno() {
		return goreDesno;
	}

	public Ringla getDoleLevo() {
		return doleLevo;
	}

	public Ringla getDoleDesno() {
		return doleDesno;
	}

	public void pojacaj(int pozicija) {
		switch (pozicija) {
		case 1:
			this.goreLevo.pojacajRinglu();
			break;
		case 2:
			this.goreDesno.pojacajRinglu();
			break;
		case 3:
			this.doleLevo.pojacajRinglu();
			break;
		case 4:
			this.doleDesno.pojacajRinglu();
			break;
		}

		
		if (pozicija == 1 && !this.goreDesno.daLiJeUkljucena()
				&& !this.doleLevo.daLiJeUkljucena() && !this.doleDesno.daLiJeUkljucena()) {
			this.goreLevo.pojacajRinglu();
			this.goreDesno.iskljuciRinglu();
			this.doleLevo.iskljuciRinglu();
			this.doleDesno.iskljuciRinglu();
		} else if (pozicija == 2 && !this.goreLevo.daLiJeUkljucena()
				&& !this.doleLevo.daLiJeUkljucena() && !this.doleDesno.daLiJeUkljucena()) {
			this.goreDesno.pojacajRinglu();
			this.goreLevo.iskljuciRinglu();
			this.doleLevo.iskljuciRinglu();
			this.doleDesno.iskljuciRinglu();
		} else if (pozicija == 3 && !this.goreLevo.daLiJeUkljucena()
				&& !this.goreDesno.daLiJeUkljucena() && !this.doleLevo.daLiJeUkljucena()) {
			this.doleLevo.pojacajRinglu();
			this.goreDesno.iskljuciRinglu();
			this.goreLevo.iskljuciRinglu();
			this.doleDesno.iskljuciRinglu();
		} else if (pozicija == 4 && !this.goreLevo.daLiJeUkljucena()
				&& !this.goreDesno.daLiJeUkljucena() && !this.doleLevo.daLiJeUkljucena()) {
			this.doleDesno.pojacajRinglu();
			this.goreDesno.iskljuciRinglu();
			this.goreLevo.iskljuciRinglu();
			this.doleLevo.iskljuciRinglu();
		}
	} 

	public void iskljuci(int pozicija) {
		switch (pozicija) {
		case 1:
			this.goreLevo.iskljuciRinglu();
			break;
		case 2:
			this.goreDesno.iskljuciRinglu();
			break;
		case 3:
			this.doleLevo.iskljuciRinglu();
			break;
		case 4:
			this.doleDesno.iskljuciRinglu();
			break;
	default:
			this.goreLevo.iskljuciRinglu();
			this.goreDesno.iskljuciRinglu();
			this.doleLevo.iskljuciRinglu();
		this.doleDesno.iskljuciRinglu();
		}
	}



	public double ukupnaPotrosnja(int vreme) {
		return this.goreLevo.potrosnja(vreme) + this.goreDesno.potrosnja(vreme) + this.doleLevo.potrosnja(vreme)
				+ this.doleDesno.potrosnja(vreme);
	}

	public void print() {
		System.out.println(this.marka + " - " + this.garancija + " godina");
		System.out.println("Ringle:");
		System.out.println("Gore levo:");
		this.goreLevo.print();
		System.out.println("Gore desno:");
		this.goreDesno.print();
		System.out.println("Dole levo:");
		this.doleLevo.print();
		System.out.println("Dole desno:");
		this.doleDesno.print();
	}

}
