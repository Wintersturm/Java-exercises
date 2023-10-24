package comcave.kollektionen.model;

import java.util.HashMap;

public class Maps {
	public static void HashMapBeispiel() {
		HashMap<String, Integer> autos = new HashMap<String, Integer>();
		autos.put("Jeep", 200);
		autos.put("BMW", 350);
		System.out.println(autos);
	}
	
	public static void HashMapBeispiel2() {
		HashMap<String, Double> size = new HashMap<String, Double>();
		size.put("Länge", 300.0);
		size.put("Höhe", 150.0);
		size.put("Breite", 200.0);
		System.out.println(size);
		
		System.out.println(size.get("Höhe"));
		System.out.println(size.values());
	}
}
