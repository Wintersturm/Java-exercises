package comcave.klassendiagramm.model.aggregation;

public class Tisch {
	private int tischNr;
	
	public Tisch(int nr) {
		this.tischNr = nr;
	}
	
	public String toString() {
		return "Tisch: " + this.tischNr;
	}
}
