package personnages;

public class Soldat extends Romain {
	
	public enum Grade {
		SOLDAT("soldat"),
		TESSERARIUS("tesserarius"),
		OPTIO("optio"),
		CENTURION("centurion");
		
		private String grade;
		
		private Grade (String grade) {
			this.grade = grade;
		}
		@Override
		public String toString() {
			return grade;
		}
	}
	public enum Equipement {
		CASQUE("casque", 2),
		PLASTRON("plastron", 3),
		BOUCLIER("bouclier", 3);
		
		private String equipement;
		private int force;
		
		private Equipement (String equipement, int force) {
			this.equipement = equipement;
			this.force = force;
		}
		@Override
		public String toString() {
			return equipement;
		}
		public int getForce() {
			return force;
		}
	}
	
	private Grade grade;
	private Equipement[] equipement = new Equipement[3];
	private int nbEquipement = 0;
	
	public Soldat (String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}
	public Grade getGrade() {
		return this.grade;
	}
	public void parler (String texte) {
		System.out.println("Le " + getGrade() +' '+ this.getNom() + 
				           " : '" + texte + "'");
	}
	public void equipeSoldat (Equipement equipement) {
		boolean equipe = false;
		for (int i=0 ; i<nbEquipement ; i++) {
			if (this.equipement[i]==equipement) {
				equipe = true;
				this.parler("Je ne peux pas mettre de " +
				equipement + " j'en ai déja un.");
			}
		}
		if (equipe == false) {
			System.out.println("Le " + this.grade +" "+ 
		                      this.getNom() + " s'équipe avec un " +
					          equipement);
			this.equipement[nbEquipement]=equipement;
			nbEquipement ++;
		}
	}
	@Override
	public void recevoirCoup (int coup) {
		for (int i = 0 ; i < nbEquipement ; i++) {
			if (coup > 0) {
				coup -= this.equipement[i].getForce();
				System.out.println("Le " + this.equipement[i] + " absorbe "
						+ this.equipement[i].getForce() + " du coup.");
				if (this.equipement[i].getForce() <= 0) {
					this.equipement[i] = null;
				}
			}
		}
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
