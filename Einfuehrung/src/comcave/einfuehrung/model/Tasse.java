package comcave.einfuehrung.model;

public class Tasse {
	// Attribute - Eigenschaften die ein Objekt beschreiben
	// Accessmodifier - Datentyp - Name
	private int id;
	private double volume;
	private String color;
	private Integer size;
	private int height;
	
	// Getter / Setter 
	// Methoden für Attribute
	public int getId() {
		return this.id;
	}
	
	public double getVolume() {
		return this.volume;
	}
	
	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
		this.volume = Math.PI * Math.pow(this.size, 2) * this.height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
		this.volume = Math.PI * Math.pow(this.size, 2) * this.height;
	}
	
	// Konstruktoren
	// Default-Constructor - implizit immer vorhanden
	public Tasse() {
		
	}
	
	// Parameterisierten Konstruktoren
	public Tasse(int id, int height, int size, String color) {
		this.id = id;
		this.height = height;
		this.size = size;
		this.color = color;
		this.calcVolume();
	}
	
	
	// Methoden
	// Accessmodifier - Rückgabetyp - Namen
	private void calcVolume() {
		this.volume = Math.PI * Math.pow(this.size, 2) * this.height;
	}
	
	// Spezielle Methoden die in jeder Klasse vorhanden sein sollten
	// toString - Represäntation des Objektes in Textform
	public String toString() {
		return "Volume: " + this.volume + System.lineSeparator() +
			   "Height: " + this.height + System.lineSeparator() +
			   "Size: " + this.size + System.lineSeparator() +
			   "Color: " + this.color + System.lineSeparator();
	}
	//equals - Vergleich von 2 Objekten einer Klasse
	public boolean equals(Tasse tasse) {
		boolean equal = false;
		if(this.size == tasse.size) {
			if(this.height == tasse.height) {
				if(this.color.equals(tasse.color)) {
					equal = true;
				}
			}
		}
		return equal;
	}
}
