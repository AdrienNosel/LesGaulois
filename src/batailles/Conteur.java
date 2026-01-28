package batailles;

public class Conteur {
	private String nom;

	public Conteur(String nom) {
		this.nom = nom;
	}

	public void conter(Bataille bataille) {
		System.out.println("Je suis " + nom + ". Je vais vous conter une histoire qui se déroule en 50 avant Jésus-Christ,");
		System.out.println("du temps où la Gaule est occupée par les Romains.\n");

		System.out.println(bataille.decrireContexte()    + "\n");
		System.out.println(bataille.choisirCombattants() + "\n");
		System.out.println(bataille.preparerCombat()     + "\n");
		System.out.println(bataille.decrireCombat()      + "\n");
		System.out.println(bataille.donnerResultat());
	}
}
