import java.util.Scanner;

public class Kermis {
	public static void main(String[] args) {
		
		Attractie botsauto = new Botsauto();
		botsauto.naam = "botsauto";
		botsauto.prijs = 2.50f;
		
		Spin spin = new Spin();
		spin.naam = "spin";
		spin.prijs = 2.25f;
		
		Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
		spiegelpaleis.naam = "spiegelpaleis";
		spiegelpaleis.prijs = 2.75f;
		
		Spookhuis spookhuis = new Spookhuis();
		spookhuis.naam = "spookhuis";
		spookhuis.prijs = 3.20f;
		
		Hawaii hawaii = new Hawaii();
		hawaii.naam = "hawaii";
		hawaii.prijs = 2.90f;
		
		Ladderklimmen ladderklimmen = new Ladderklimmen();
		ladderklimmen.naam = "ladderklimmen";
		ladderklimmen.prijs = 5.00f;
		
		Kassa kermisKassa = new Kassa();

		// TEST
		botsauto.kassa.aantalKaartenVerkocht = 2;
		spin.kassa.aantalKaartenVerkocht = 10;
		spiegelpaleis.kassa.aantalKaartenVerkocht = 5;
		spookhuis.kassa.aantalKaartenVerkocht = 1;
		hawaii.kassa.aantalKaartenVerkocht = 1;
		ladderklimmen.kassa.aantalKaartenVerkocht = 1;
		kermisKassa.aantalKaartenVerkocht = botsauto.kassa.aantalKaartenVerkocht + 
				spin.kassa.aantalKaartenVerkocht +  
				spiegelpaleis.kassa.aantalKaartenVerkocht + 
				spookhuis.kassa.aantalKaartenVerkocht + 
				hawaii.kassa.aantalKaartenVerkocht + 
				ladderklimmen.kassa.aantalKaartenVerkocht;
		
		Scanner input = new Scanner(System.in);
		toonMenuLijst();
		System.out.println("====================");
		System.out.println("Voer een getal of letter in: ");
		while (true) {
			kermisKassa.berekenAlleOmzet(botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen, kermisKassa);
			kermisKassa.berekenAantalKaartenVerkocht(botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen, kermisKassa);
			toonMenu(botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen, kermisKassa, input);
		}
	}

	public static void toonMenu(Attractie botsauto, Attractie spin, Attractie spiegelpaleis, Attractie spookhuis, Attractie hawaii, Attractie ladderklimmen, Kassa kermisKassa, Scanner input) {
		if (input.hasNextInt()) {
			int nummer = input.nextInt();
			if (nummer == 1) {
				botsauto.draaien();
			}
			if (nummer == 2) {
				spin.draaien();
			}
			if (nummer == 3) {
				spiegelpaleis.draaien();
			}
			if (nummer == 4) {
				spookhuis.draaien();
			}
			if (nummer == 5) {
				hawaii.draaien();
			}
			if (nummer == 6) {
				ladderklimmen.draaien();
			}
		}
		else {
			char letter = input.next().charAt(0);
			if (letter == 'o') {
				kermisKassa.toonTotaleOmzet(botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen, kermisKassa);
			}
			if (letter == 'k') {
				kermisKassa.toonTotaalKaartenVerkocht(botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen, kermisKassa);
			}
			if (letter == 'm') {
				toonMenuLijst();
			}
		}
		System.out.println("");
		System.out.println("====================");
		System.out.println("Voer een getal of letter in: ");
	}
	
	public static void toonMenuLijst() {
		System.out.println("");
		System.out.println("####################");
		System.out.println("###### Kermis ######");
		System.out.println("####################");
		System.out.println("1 = Botsauto");
		System.out.println("2 = Spin");
		System.out.println("3 = Spiegelpaleis");
		System.out.println("4 = Spookhuis");
		System.out.println("5 = Hawaii");
		System.out.println("6 = Ladderklimmen");
		System.out.println("");
		System.out.println("o = Omzet");
		System.out.println("k = Aantal kaarten verkocht");
		System.out.println("m = Herhaal menu");
	}
}