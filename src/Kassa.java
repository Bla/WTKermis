
public class Kassa {
	public int aantalKaartenVerkocht;
	public float omzet;
	
	float berekenOmzet(float kaartPrijs, int verkochteKaarten) {
		this.omzet = verkochteKaarten * kaartPrijs;
		return this.omzet;
	}
	
	public void berekenAlleOmzet(Attractie botsauto, Attractie spin, Attractie spiegelpaleis, Attractie spookhuis, Attractie hawaii, Attractie ladderklimmen, Kassa kermisKassa) {
		float botsAutoOmzet = botsauto.kassa.berekenOmzet(botsauto.prijs, botsauto.kassa.aantalKaartenVerkocht);
		float spinOmzet = spin.kassa.berekenOmzet(spin.prijs, spin.kassa.aantalKaartenVerkocht);
		float spiegelpaleisOmzet = spiegelpaleis.kassa.berekenOmzet(spiegelpaleis.prijs, spiegelpaleis.kassa.aantalKaartenVerkocht);
		float spookhuisOmzet = spookhuis.kassa.berekenOmzet(spookhuis.prijs, spookhuis.kassa.aantalKaartenVerkocht);
		float hawaiiOmzet = hawaii.kassa.berekenOmzet(hawaii.prijs, hawaii.kassa.aantalKaartenVerkocht);
		float ladderklimmenOmzet = ladderklimmen.kassa.berekenOmzet(ladderklimmen.prijs, ladderklimmen.kassa.aantalKaartenVerkocht);
		kermisKassa.omzet = botsAutoOmzet + spinOmzet + spiegelpaleisOmzet + spookhuisOmzet + hawaiiOmzet + ladderklimmenOmzet;
	}
	
	public void toonTotaleOmzet(Attractie botsauto, Attractie spin, Attractie spiegelpaleis, Attractie spookhuis, Attractie hawaii, Attractie ladderklimmen, Kassa kermisKassa) {
		System.out.println("");
		System.out.println("####################");
		System.out.println("### Totale omzet ###");
		System.out.println("####################");
		System.out.println("Botsauto omzet: " + botsauto.kassa.omzet);
		System.out.println("Spin omzet: " + spin.kassa.omzet);
		System.out.println("Spiegelpaleis omzet: " + spiegelpaleis.kassa.omzet);
		System.out.println("Spookhuis omzet: " + spookhuis.kassa.omzet);
		System.out.println("Hawaii omzet: " + hawaii.kassa.omzet);
		System.out.println("Ladderklimmen omzet: " + ladderklimmen.kassa.omzet);
		System.out.println("");
		System.out.println("Totale omzet: " + kermisKassa.omzet);
	}
	
	public void berekenAantalKaartenVerkocht(Attractie botsauto, Attractie spin, Attractie spiegelpaleis, Attractie spookhuis, Attractie hawaii, Attractie ladderklimmen, Kassa kermisKassa) {
		int botsautoKaarten = botsauto.kassa.aantalKaartenVerkocht;
		int spinKaarten = spin.kassa.aantalKaartenVerkocht;
		int spiegelpaleisKaarten = spiegelpaleis.kassa.aantalKaartenVerkocht;
		int spookhuisKaarten = spookhuis.kassa.aantalKaartenVerkocht;
		int hawaiiKaarten = hawaii.kassa.aantalKaartenVerkocht;
		int ladderklimmenKaarten = ladderklimmen.kassa.aantalKaartenVerkocht;
		kermisKassa.aantalKaartenVerkocht = botsautoKaarten + spinKaarten + spiegelpaleisKaarten + spookhuisKaarten + hawaiiKaarten + ladderklimmenKaarten;
	}
	
	public void toonTotaalKaartenVerkocht(Attractie botsauto, Attractie spin, Attractie spiegelpaleis, Attractie spookhuis, Attractie hawaii, Attractie ladderklimmen, Kassa kermisKassa) {
		System.out.println("");
		System.out.println("####################");
		System.out.println("# Kaarten Verkocht #");
		System.out.println("####################");
		System.out.println("Botsauto kaarten verkocht: " + botsauto.kassa.aantalKaartenVerkocht);
		System.out.println("Spin kaarten verkocht: " + spin.kassa.aantalKaartenVerkocht);
		System.out.println("Spiegelpaleis kaarten verkocht: " + spiegelpaleis.kassa.aantalKaartenVerkocht);
		System.out.println("Spookhuis kaarten verkocht: " + spookhuis.kassa.aantalKaartenVerkocht);
		System.out.println("Hawaii kaarten verkocht: " + hawaii.kassa.aantalKaartenVerkocht);
		System.out.println("Ladderklimmen kaarten verkocht: " + ladderklimmen.kassa.aantalKaartenVerkocht);
		System.out.println("");
		System.out.println("Totaal aantal kaarten verkocht: " + kermisKassa.aantalKaartenVerkocht);
	}
	
}