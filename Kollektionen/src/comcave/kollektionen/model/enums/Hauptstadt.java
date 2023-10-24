package comcave.kollektionen.model.enums;

public enum Hauptstadt {
	England("London"), Deutschland("Berlin"), Irland("Dublin");

	private String stadt;
	
	public String getStadt() {
		return stadt;
	}
	
	Hauptstadt(String stadt) {
		this.stadt = stadt;
	}
}
