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
}
