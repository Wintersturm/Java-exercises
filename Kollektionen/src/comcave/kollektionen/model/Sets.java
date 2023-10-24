package comcave.kollektionen.model;

import java.util.Arrays;
import java.util.HashSet;

public class Sets {
	public static void SetBeispiel() {
		HashSet<String> zutaten = new HashSet<String>();
		zutaten.add("Reis");
		zutaten.add("Salz");
		zutaten.add("Pfeffer");
		zutaten.add("Salz");
		
		System.out.println(zutaten);
	}
	
	public static void SetBeispiel2() {
		String[] worte = new String[] {"Hallo", "Java", "Insel", "Auto", "Java"};
		HashSet<String> woerter = new HashSet<String>(Arrays.asList(worte));
		System.out.println(Arrays.toString(worte));
		System.out.println(woerter);
	}
}
