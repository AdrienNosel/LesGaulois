package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois (String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	String getNom () {
		return nom;
	}
	public void parler (String texte) {
		System.out.println("Le gaulois " + this.nom + 
				           " : '" + texte + "'");
	}
	public void frapper (Romain cible) {
		System.out.println(this.nom + " envoie un grand coup"
				+ " dans la mâchoire de " + cible.getNom());
		cible.recevoirCoup(this.force/3);
	}
}