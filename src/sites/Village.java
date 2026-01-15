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
			nbGaulois++;
		}
		else {
			System.out.println("Désolé " + gaulois.getNom() +
					" mon village est déjà bien rempli.");
		}
	}
}