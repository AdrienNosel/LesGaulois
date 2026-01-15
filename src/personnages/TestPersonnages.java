package personnages;

import personnages.Soldat.Grade;
import sites.Camp;
import sites.Village;

public class TestPersonnages {
//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois ("Astérix",8);
//		asterix.parler("Bonjour à tous");
//		Romain minus = new Romain ("Minus",6);
//		minus.parler("UN GAU... UN GAUGAU..");
//		for (int i = 0 ; i < 4 ; i++) {
//			asterix.frapper(minus);	
//			minus.frapper(asterix);
//		}
//	}
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois ("Vercingétorix", 5);
		Soldat minus = new Soldat ("Minus", 2, Grade.CENTURION);
		Village village = new Village (vercingetorix, 4);
		Camp camp = new Camp (minus, 3);
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village.");
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
	}
}
