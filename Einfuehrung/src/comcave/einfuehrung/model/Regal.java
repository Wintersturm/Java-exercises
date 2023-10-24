package comcave.einfuehrung.model;

import java.util.Arrays;

public class Regal {
	private double length;
	private int count;
	private String color;
	private Tasse[] tassen;
	
	public double getLength() {
		return length;
	}
	public int getCount() {
		return count;
	}
	public String getColor() {
		return color;
	}
	public Tasse[] getTassen() {
		return tassen;
	}
	
	public Regal(double length, String color) {
		super();
		this.length = length;
		this.color = color;
		this.count = (int) this.length / 10;
		this.tassen = new Tasse[count];
	}
	
	@Override
	public String toString() {
		return "Regal [length=" + length + ", count=" + count + ", color=" + color + ", tassen="
				+ Arrays.toString(tassen) + "]";
	}
	
	
	
}
