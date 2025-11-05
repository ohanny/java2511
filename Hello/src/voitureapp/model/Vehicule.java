package voitureapp.model;

public class Vehicule {

	private void roulerInternal() {
		System.out.println("mécanisme interbe rouler");
	}
	
	public void rouler() {
		roulerInternal();
		System.out.println("on roule");
	}
	
}
