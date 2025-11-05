package voitureapp.model;

public final class Avion extends VehiculeVolant {

	private int altitude;
	private final String type;
	
	public Avion(String type) {
		super();
		this.type = type;
	}

	@Override
	public void rouler() {
		final int delta = 10;
		//type = "Boeing";
		if (altitude == 0) {
			super.rouler();
		} else {
			System.out.println("l'avion ne peut pas rouler, il est en vol");
		}
	}
	
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
}
