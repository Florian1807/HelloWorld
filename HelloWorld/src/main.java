
public class main {
static double zufallszahl= Math.round(Math.random()*100);
	static byte alter = 19;
	static byte geschlecht = 2;
	static String name = "Florian Schaub";
static int spieler1Zahl=42;
static int spieler2Zahl=87;
static int diff1=0;
static int diff2=0;

	
	public static void main(String[] args) {

		diff1=Math.abs(zufallszahl-spieler1Zahl);
		diff2=Math.abs(zufallszahl-spieler2Zahl);
		if diff1== diff2{
			system.out.println("Unentschieden")
		}
		
	System.out.println(zufallszahl);
		if (geschlecht == 2) {
			System.out.println("Hallo " + name + "!");
		} else {

			if (alter >= 18||geschlecht==2) {
				if (geschlecht == 0) {
					System.out.println("Guten Tag Herr " + name + "!");
				} else {
					System.out.println("Guten Tag Frau " + name + "!");

				}
			} else {
				System.out.println("Hallo " + name + "!");
			}
		}
	
	}

}



