package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix",8);
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain ("Minus",6);
		minus.parler("UN GAU... UN GAUGAU..");
		for (int i = 0 ; i < 4 ; i++) {
			asterix.frapper(minus);	
			minus.frapper(asterix);
		}
	}
}
