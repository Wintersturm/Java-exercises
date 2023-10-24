package comcave.einfuehrung;

import comcave.einfuehrung.model.Tasse;

public class App {

	public static void main(String[] args) {
		Tasse tasseEins = new Tasse();
		
		tasseEins.setColor("Grün");
		tasseEins.setSize(5);
		tasseEins.setVolume(25);
		tasseEins.setHeight(5);
		
		System.out.println("Volumen: " + tasseEins.getVolume());
		System.out.println("Size: " + tasseEins.getSize() );
		System.out.println("Height: " + tasseEins.getHeight());
		
		//Volumenformel = V = pi * r² * h
		tasseEins.setVolume(3.1415f * (tasseEins.getSize() * tasseEins.getSize()) * tasseEins.getHeight());
		System.out.println("Volumen: " + tasseEins.getVolume());
		System.out.println("Size: " + tasseEins.getSize() );
		System.out.println("Height: " + tasseEins.getHeight());
		
		tasseEins.setHeight(10);
		System.out.println("Volumen: " + tasseEins.getVolume());
		System.out.println("Size: " + tasseEins.getSize() );
		System.out.println("Height: " + tasseEins.getHeight());
		System.out.println("----------");
		
		Tasse tasseZwei = new Tasse(123, 12, 24, "Gelb");	
		Tasse tasseDrei = new Tasse(123, 12, 24, "Gelb");
		Tasse tasseVier = tasseZwei;
		
		if(tasseZwei.equals(tasseDrei)) {
			System.out.println("Tassen sind gleich.");
		} else {
			System.out.println("Tassen sind nicht gleich.");
		}
	}

}
