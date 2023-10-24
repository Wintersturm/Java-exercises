package comcave.klassendiagramm.model.klassen;

import java.util.Arrays;

public class Restaurant {
	private Gast[] kunden;
	
	public Restaurant() {
		kunden = new Gast[50];
	}
	
	public void wirdBesucht(Gast g) {
		for (int i = 0; i < kunden.length; i++) {
			if(kunden[i] == null) {
				kunden[i] = g;
				break;
			}
		}
	}
	
	public void printKunden() {
		System.out.println(Arrays.toString(kunden));
	}
}
