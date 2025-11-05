package voitureapp.model;


public class Voiture extends Vehicule {
	String modele;
	String couleur;
	int puissance;
	int position;
	
	java.util.Date miseEnCirculation;
	
	public Voiture() {}

	public Voiture(String modele, String couleur) {
		this.modele = modele;
		this.couleur = couleur;
	}

	public Voiture(String modele, String couleur, int puissance) {
		this.modele = modele;
		this.couleur = couleur;
		this.puissance = puissance;
	}
	
	void setModele(String modele) {
		this.modele = modele;
	}
			
	void avancer(int delta) {
		if (delta < 0) return;
		position += delta;
	}
	
	void avancer() {
		int delta = 5;
		if (delta < 0) return;
		position += delta;
		
		rouler();
		//roulerInternal();
		
	}
	
}
