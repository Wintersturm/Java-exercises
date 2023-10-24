package comcave.klassendiagramm.model.abstrakt;

import java.util.ArrayList;
import java.util.Arrays;

public class Hund extends Tier {
	private ArrayList<String> fellfarben;

	public ArrayList<String> getFellfarben() {
		return fellfarben;
	}

	public void setFellfarben(ArrayList<String> fellfarben) {
		this.fellfarben = fellfarben;
	}

	public Hund(int anzahlGliedmassen, int maximalAlter, String gattung) {
		super(anzahlGliedmassen, maximalAlter, gattung);
		fellfarben = new ArrayList<String>();
	}
	
	public Hund(int anzahlGliedmassen, int maximalAlter, String gattung, ArrayList<String> fellfarben) {
		super(anzahlGliedmassen, maximalAlter, gattung);
		this.fellfarben = fellfarben;
	}
	
	public Hund(int anzahlGliedmassen, int maximalAlter, String gattung, String...farben) {
		super(anzahlGliedmassen, maximalAlter, gattung);
		this.fellfarben = new ArrayList<String>(Arrays.asList(farben));
	}

	@Override
	public void lautAbgeben() {
		System.out.println("Der Hund bellt!");
	}

	@Override
	public String toString() {
		return "Hund [fellfarben=" + fellfarben + ", getAnzahlGliedmassen()=" + getAnzahlGliedmassen()
				+ ", getMaximalAlter()=" + getMaximalAlter() + ", getGattung()=" + getGattung() + "]";
	}
	
	

}
