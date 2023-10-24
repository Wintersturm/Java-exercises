package comcave.klassendiagramm.model.klassen;

public class Gast {
	//Attribute
	//Zugriffsmodifikatoren:
	
	// + = public 
	public static final double MIN = 200.0;
	public static String status = "König";
	public boolean freundeEinladen;
	public char[] alphabet = new char[26];
	
	// - = private
	private double geldbetrag;
	private Restaurant gastgeber;
	
	// # = protected
	protected String[] freunde = new String[10];
	
	// ~ = package/default
	boolean hunger = true;
	
	// Konstruktoren
	
	// Methoden (Operationen)
	public void setGeldbetrag(double geldbetrag) {
		this.geldbetrag = geldbetrag;
		this.freundeEinladen = this.geldbetrag > MIN;
	}
	
	public double getGelbetrag() {
		return this.geldbetrag;
	}
	
	public static String getMINAsString() {
		// return "" + MIN;
		return String.valueOf(MIN);
	}
	
	public Gast(Restaurant r) {
		this.gastgeber = r;
	}
	
	public void besuchtRestaurant() {
		this.gastgeber.wirdBesucht(this);
	}
}
