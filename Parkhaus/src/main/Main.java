package main;

public class Main {

	public static void main(String[] args) {
		Parkhaus parkhaus = new Parkhaus(2, 10); // 2 Etagen und 10 Parkplätze
		
		Fahrzeug auto1 = new Fahrzeug("CE123AB");
		Fahrzeug auto2 = new Fahrzeug("CE456CD");
		Fahrzeug motorrad1 = new Fahrzeug("CE789EF");
		Fahrzeug motorrad2 = new Fahrzeug("CE147GH");
		
		System.out.println("Verfügbare Parkplätze: " + parkhaus.freieParkplaetze());
		
		parkhaus.einfahrt(auto1);
		parkhaus.einfahrt(auto2);
		parkhaus.einfahrt(motorrad1);
		parkhaus.einfahrt(motorrad2);
		
		/*Test ob Einfahrt und Ausfahrt funktioniert
		if (parkhaus.einfahrt(auto1)) {
		    System.out.println("Auto 1 erfolgreich eingeparkt");
		} else {
		    System.out.println("Auto 1 konnte nicht eingeparkt werden");
		}

		if (parkhaus.ausfahrt(auto1)) {
		    System.out.println("Auto 1 erfolgreich ausgeparkt");
		} else {
		    System.out.println("Auto 1 konnte nicht ausgeparkt werden");
		}
		*/
		
		
		System.out.println("Verfügbare Parkplätze nach Einfahrt von Fahrzeugen: " + parkhaus.freieParkplaetze());

		parkhaus.ausfahrt(auto2);

		System.out.println("Verfügbare Parkplätze nach Ausfahren von Auto2: " + parkhaus.freieParkplaetze());
	
	}
	
	
	
}
