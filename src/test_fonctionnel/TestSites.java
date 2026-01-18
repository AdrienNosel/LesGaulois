package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import personnages.Soldat.Grade;
import sites.Camp;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois ("Vercingétorix", 5);
		Gaulois agcanonnix = new Gaulois ("Agcanonnix", 1);
		Gaulois assurancetourix = new Gaulois ("Assurancetourix", 2);
		Gaulois asterix = new Gaulois ("Asterix", 5);
		Gaulois obelix = new Gaulois ("Obelix", 15);
		Gaulois prolix = new Gaulois ("Prolix", 2);
		Gaulois abraracourcix = new Gaulois ("Abraracourcix", 5);
		
		Soldat minus = new Soldat ("Minus", 2, Grade.CENTURION);
		Soldat brutus = new Soldat ("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat ("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusoctopus = new Soldat ("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat ("Ballondebaudrus", 3, Grade.OPTIO);
		Soldat briseradius = new Soldat ("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat ("Chorus", 4, Grade.CENTURION);
		
		Village village = new Village (vercingetorix, 4);
		
		Camp camp = new Camp (minus, 3);
		
		/////////////////AFFICHAGE//////////////////////
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village.");
		village.ajouterGaulois(agcanonnix);
		village.ajouterGaulois(assurancetourix);
		village.ajouterGaulois(asterix);
		village.ajouterGaulois(obelix);
		village.ajouterGaulois(prolix);
		System.out.println();
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusoctopus);
		camp.ajouterSoldat(ballondebaudrus);
		System.out.println();
		village.afficherVillageois();
		System.out.println();
		camp.afficherCamp();
		System.out.println();
		village.changerChef(abraracourcix);
		System.out.println();
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
	}

}
