package comcave.klassendiagramm.model.komposition;

public class Blatt {
	private int BlattNr;
	private String farbe;
	
	public Blatt(int nr, String farbe) {
		this.BlattNr = nr;
		this.farbe = farbe;
	}

	@Override
	public String toString() {
		return "Blatt [BlattNr=" + BlattNr + ", farbe=" + farbe + "]";
	}
}
