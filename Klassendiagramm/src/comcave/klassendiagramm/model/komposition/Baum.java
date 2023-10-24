package comcave.klassendiagramm.model.komposition;

import java.util.ArrayList;

public class Baum {
	private ArrayList<Blatt> blaetter;
	
	public Baum() {
		this.blaetter = new ArrayList<Blatt>();
	}
	
	public void addBlatt(int nr, String farbe) {
		this.blaetter.add(new Blatt(nr, farbe ));
	}

	@Override
	public String toString() {
		return "Baum [blaetter=" + blaetter + "]";
	}
	
	
}
