package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain (String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom () {
		return nom;
	}
	public void parler (String texte) {
		System.out.println("Le romain " + this.nom + 
				           " : '" + texte + "'");
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
