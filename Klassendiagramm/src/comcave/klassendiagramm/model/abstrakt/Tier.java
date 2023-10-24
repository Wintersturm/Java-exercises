package comcave.klassendiagramm.model.abstrakt;

public abstract class Tier {
	private int anzahlGliedmassen;
	private int maximalAlter;
	private String gattung;

	public int getAnzahlGliedmassen() {
		return anzahlGliedmassen;
	}

	public void setAnzahlGliedmassen(int anzahlGliedmassen) {
		this.anzahlGliedmassen = anzahlGliedmassen;
	}

	public int getMaximalAlter() {
		return maximalAlter;
	}

	public void setMaximalAlter(int maximalAlter) {
		this.maximalAlter = maximalAlter;
	}

	public String getGattung() {
		return gattung;
	}

	public void setGattung(String gattung) {
		this.gattung = gattung;
	}

	public Tier(int anzahlGliedmassen, int maximalAlter, String gattung) {
		super();
		this.anzahlGliedmassen = anzahlGliedmassen;
		this.maximalAlter = maximalAlter;
		this.gattung = gattung;
	}
	
	public void bewegen() {
		System.out.println("Das Tier bewegt sich.");
	}
	
	public abstract void lautAbgeben();

	@Override
	public String toString() {
		return "Tier [anzahlGliedmassen=" + anzahlGliedmassen + ", maximalAlter=" + maximalAlter + ", gattung="
				+ gattung + "]";
	}
	
}
