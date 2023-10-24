package comcave.klassendiagramm.model.interfaces;

public class Dateischreiber implements Schreiber{
	private String dateiname;
	private String dateipfad;
	
	public Dateischreiber(String dateiname, String dateipfad) {
		super();
		this.dateiname = dateiname;
		this.dateipfad = dateipfad;
	}
	
	public void schreibeDatei() {
		System.out.println("Die Datei " + this.dateipfad + "/" + this.dateiname + " wird geschrieben!");
	}

	@Override
	public void schreibe() {
		this.schreibeDatei();	
	}
}
