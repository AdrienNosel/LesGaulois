package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] membres;
	private int nbGaulois;
	
	public Village (Gaulois chef, int capacite) {
		this.chef = chef;
		this.membres = new Gaulois[capacite];
		nbGaulois = 0;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	public void ajouterGaulois (Gaulois gaulois) {
		if (nbGaulois < membres.length) {
			membres[nbGaulois] = gaulois;
			this.chef.parler("Bienvenue " + gaulois.getNom() + " !");
			nbGaulois++;
		}
		else {
			this.chef.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli.");
		}
	}
	public void afficherVillageois() {
		System.out.println("Le village de " + this.chef.getNom() + " est habité par :");
		for (int i = 0 ; i < nbGaulois ; i++) {
			System.out.println("- " + membres[i].getNom());
		}
	}
	public void changerChef(Gaulois gaulois) {
		this.chef.parler("Je laisse mon grand bouclier au grand " + gaulois.getNom() + ".");;
		gaulois.parler("Merci !");
		this.chef = gaulois;
	}
}