package personnages;

public abstract class Personnage {
	private String nom;
	protected int force;
	
	public Personnage (String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public int getForce () {
		return force;
	}
	public String getNom () {
		return nom;
	}
	public void parler (String texte) {
		System.out.println("Le " + donnerAuteur() + this.nom + 
				           " : '" + texte + "'");
	}
	protected abstract String donnerAuteur();
	
	public void frapper (Personnage cible) {
		if ((this.force > 0)&&(cible.getForce() > 0)) {
			System.out.println(this.nom + " envoie un grand coup de force "
					+ this.force + " dans la mâchoire de " + cible.getNom());
			cible.recevoirCoup(this.force);
		}
	}
	public void recevoirCoup (int coup) {
		this.force = this.force - coup;
		if (this.force > 0) {
			this.parler("Aïe !");
		}
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		}
	}
	public void boirePotion (int forcePotion) {
		this.force = this.force * forcePotion;
	}

}
