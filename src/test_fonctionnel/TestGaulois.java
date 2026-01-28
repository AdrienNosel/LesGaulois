package test_fonctionnel;


import personnages.Druide;
import personnages.Gaulois;
import personnages.Soldat;
import personnages.Soldat.Equipement;
import personnages.Soldat.Grade;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois agecanonnix = new Gaulois ("Agecanonnix", 1);
		Gaulois assurancetourix = new Gaulois ("Assurancetourix", 2);
		Gaulois asterix = new Gaulois ("Asterix", 5);
		Gaulois obelix = new Gaulois ("Obelix", 15);
		Gaulois abraracourcix = new Gaulois ("Abraracourcix", 5);
		Druide panoramix = new Druide ("Panoramix", 1);
		
		Soldat minus = new Soldat ("Minus", 2, Grade.CENTURION);
		
		panoramix.concocterPotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(agecanonnix);
		System.out.println();
		minus.equipeSoldat(Equipement.BOUCLIER);
		minus.equipeSoldat(Equipement.CASQUE);
		minus.equipeSoldat(Equipement.CASQUE);
		minus.equipeSoldat(Equipement.PLASTRON);
		System.out.println();
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		minus.frapper(asterix);
	}
}
