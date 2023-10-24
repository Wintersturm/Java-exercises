package comcave.klassendiagramm.model.interfaces;

public class Datenbankschreiber implements Schreiber{
	private String datenbankname;
	private String datenbankadresse;
	
	public Datenbankschreiber(String datenbankname, String datenbankadresse) {
		super();
		this.datenbankname = datenbankname;
		this.datenbankadresse = datenbankadresse;
	}
	
	public void schreibeDatenbank() {
		System.out.println("Es wird in die Datenbank " + this.datenbankname + " an der URL " + this.datenbankadresse + " geschrieben");
	}

	@Override
	public void schreibe() {
		this.schreibeDatenbank();	
	}
}
