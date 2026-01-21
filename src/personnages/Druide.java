package personnages;

import java.util.Random;

public class Druide extends Gaulois
{
	private int nbDoses;
	private int forcePotion;
	
	public Druide(String nom, int force) {
		super(nom, force);
	}
	
	public void concocterPotion(int quantite) {
		Random forcePotion = new Random();
		this.nbDoses = quantite;
		this.forcePotion = forcePotion.nextInt(2, 6);
		this.parler("J'ai concocté " + this.nbDoses + 
				" doses de potion magique." + 
				" Elle a une force de " + this.forcePotion
				+ ".");
	}
	public void donnerPotion(Gaulois cible) {
		if (cible.getNom() == "Obelix") {
			this.parler("Non, Obélix Non !..." +  
		            "Et tu le sais très bien !");
		}
		else if (this.nbDoses == 0){
			this.parler("Désolé " + cible.getNom() + " il n'y a plus" +
		            " une seule goutte de potion.");
		}
		else {
			cible.boirePotion(forcePotion);
			this.nbDoses --;
			this.parler("Tiens " + cible.getNom() + 
					" un peu de potion magique.");
		}
		
	}
}
