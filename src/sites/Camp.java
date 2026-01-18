package sites;

import personnages.Soldat;
import personnages.Soldat.Grade;

public class Camp {
	private Soldat commandant;
	private Soldat[] membres;
	private int nbSoldats;
	
	public Camp (Soldat commandant, int capacite) {
		this.commandant = commandant;
		this.membres = new Soldat[capacite];
		nbSoldats = 0;
	}
	public Soldat getCommandant() {
		return commandant;
	}
	public void ajouterSoldat (Soldat soldat) {
		if (nbSoldats < membres.length) {
			membres[nbSoldats] = soldat;
			soldat.parler("Je mets mon épée au service de Rome dans le camps dirigé par " + this.commandant.getNom() + ".");
			nbSoldats++;
		}
		else {
			this.commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !");
		}
	}
	public void afficherCamp() {
		System.out.println("Le camp dirifé par " + this.commandant.getNom() + " contient les soldats :");
		for (int i = 0 ; i < nbSoldats ; i++) {
			System.out.println("- " + membres[i].getNom());
		}
	}
	public void changerCommandant(Soldat soldat) {
		if (soldat.getGrade() == Grade.CENTURION) {
			soldat.parler("Moi " + soldat.getNom() + " je prends la direction du camp romain.");;
			this.commandant = soldat;
		}
		else {
			soldat.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp.");
		}
	}
}
