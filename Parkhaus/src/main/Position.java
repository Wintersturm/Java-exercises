package main;

public class Position {
	private int etage;
	private int parkplatz;
	
	public Position(int etage, int parkplatz) {
		this.etage = etage;
		this.parkplatz = parkplatz;
	}
	
	public int getEtage() {
		return etage;
	}
	
	public int getParkplatz() {
		return parkplatz;
	}
}
