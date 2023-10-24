package comcave.klassendiagramm.model.abstrakt;

public class Katze extends Tier {

	public Katze(int anzahlGliedmassen, int maximalAlter, String gattung) {
		super(anzahlGliedmassen, maximalAlter, gattung);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lautAbgeben() {
		System.out.println("Die Katze miaut!");
	}

	@Override
	public String toString() {
		return "Katze [getAnzahlGliedmassen()=" + getAnzahlGliedmassen() + ", getMaximalAlter()=" + getMaximalAlter()
				+ ", getGattung()=" + getGattung() + "]";
	}
	
	

}
