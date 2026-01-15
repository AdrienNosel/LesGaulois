package sites;

import personnages.Soldat;

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
			nbSoldats++;
		}
		else {
			System.out.println("Désolé " + soldat.getNom() +
					" notre camp est complet !");
		}
	}
}
