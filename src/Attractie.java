
public class Attractie {

	public String naam;
	public float prijs;
	int oppervlakte;
	Kassa kassa = new Kassa();

	public void draaien() {
		System.out.println("");
		System.out.println("####################");
		System.out.println(this.naam + " draait");
		System.out.println("####################");
		System.out.println("Kaartprijs: " + this.prijs);
		System.out.println("Aantal kaarten verkocht: " + this.kassa.aantalKaartenVerkocht);
		System.out.println("Omzet: " + this.kassa.omzet);
	}
	
}