package beispieluml;

public class Lager {
	public void materialEinlagern() {
		System.out.println("Einlagern");
		materialbestandErmitteln(); // include
	}
	
	public void materialEntnehmen() {
		System.out.println("Entnehmen");
		materialbestandErmitteln(); // include
	}
	
	public void materialbestandErmitteln() {
		System.out.println("Bestand ermitteln");
		
		//extend
		int a = 5;
		int b = 10;
		if(a < b) {
			materialBestellen();
		}
	}
	
	public void materialBestellen() {
		System.out.println("Material bestellen");
	}
}
