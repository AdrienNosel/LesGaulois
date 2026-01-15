package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage (String nom, int force) {
		this.nom = nom;
		this.force = force;
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
		if (this.force > 0) {
			System.out.println(this.nom + " envoie un grand coup"
					+ " dans la mâchoire de " + cible.getNom());
			cible.recevoirCoup(this.force/3);
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

}
