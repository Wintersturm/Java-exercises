package comcave.klassendiagramm.model.aggregation;

import java.util.ArrayList;

public class Bierzelt {
	private ArrayList<Tisch> tische;
	
	public Bierzelt() {
		this.tische = new ArrayList<Tisch>();
	}
	
	public void addTisch(Tisch t) {
		this.tische.add(t);
	}
	
	public void removeTisch(Tisch t) {
		this.tische.remove(t);
	}
	
	public String toString() {
		return "Bierzelt" + this.tische.toString();
	}
}
