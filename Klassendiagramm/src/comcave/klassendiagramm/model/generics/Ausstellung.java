package comcave.klassendiagramm.model.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Ausstellung<E> {
	private ArrayList<E> teilnehmer;

	public ArrayList<E> getTeilnehmer() {
		return teilnehmer;
	}
	
	public Ausstellung(E...elemente) {
		this.teilnehmer = new ArrayList<E>(Arrays.asList(elemente));
	}

	@Override
	public String toString() {
		return "Ausstellung [teilnehmer=" + teilnehmer + "]";
	}
	
	public void hinzufuegen(E teilnehmer) {
		this.teilnehmer.add(teilnehmer);
	}
	
	public void entfernen(E teilnehmer) {
		this.teilnehmer.remove(teilnehmer);
	}
	
}
