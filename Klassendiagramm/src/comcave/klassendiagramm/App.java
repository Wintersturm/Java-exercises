package comcave.klassendiagramm;

import java.util.ArrayList;

import comcave.klassendiagramm.model.abstrakt.Hund;
import comcave.klassendiagramm.model.abstrakt.Katze;
import comcave.klassendiagramm.model.abstrakt.Tier;
import comcave.klassendiagramm.model.aggregation.Bierzelt;
import comcave.klassendiagramm.model.aggregation.Tisch;
import comcave.klassendiagramm.model.generics.Ausstellung;
import comcave.klassendiagramm.model.interfaces.Dateischreiber;
import comcave.klassendiagramm.model.interfaces.Datenbankschreiber;
import comcave.klassendiagramm.model.interfaces.Schreiber;
import comcave.klassendiagramm.model.klassen.Gast;
import comcave.klassendiagramm.model.klassen.Restaurant;
import comcave.klassendiagramm.model.komposition.Baum;

public class App {

	public static void main(String[] args) {
//		Restaurant r = new Restaurant();
//		
//		Gast a = new Gast(r);
//		Gast b = new Gast(r);
//		
//		a.besuchtRestaurant();
//		r.printKunden();
//		
//		b.besuchtRestaurant();
//		r.printKunden();
		
		
//		Tisch a = new Tisch(23);
//		Tisch b = new Tisch(42);
//		Bierzelt bz = new Bierzelt();
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(bz);
//		System.out.println("------------");
//		
//		bz.addTisch(a);
//		bz.addTisch(b);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(bz);
//		System.out.println("------------");
//		
//		bz.removeTisch(b);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(bz);
//		System.out.println("------------");
//	
//		Baum baum = new Baum();
//		baum.addBlatt(12, "grün");
//		baum.addBlatt(13, "gelb");
//		System.out.println(baum);
		
		Tier tier = new Tier();
		Hund rex = new Hund(4, 15, "Hundeartig");
		Katze molly = new Katze(4, 10, "Säugetier");
		System.out.println(rex);
		System.out.println(molly);
		rex.lautAbgeben();
		molly.lautAbgeben();
		rex.bewegen();
		molly.bewegen();
		System.out.println("--------------------------");
		
		
		ArrayList<String> farben = new ArrayList<String>();
		farben.add("Braun");
		farben.add("Rot");
		Hund hasso = new Hund(4, 10, "Wolf", "Weiss", "Schwarz", "Grün");
		Katze mauzi = new Katze(4, 14, "Löwe");
		System.out.println(hasso);
		System.out.println(mauzi);
		hasso.lautAbgeben();
		mauzi.lautAbgeben();
		hasso.bewegen();
		mauzi.bewegen();
		System.out.println("--------------------------");
//		
//		Ausstellung<Hund> hundeausstellung = new Ausstellung<Hund>(rex, hasso);
//		Ausstellung<Katze> katzenausstellung = new Ausstellung<Katze>(molly, mauzi);
//		System.out.println(hundeausstellung);
//		System.out.println(katzenausstellung);
//		System.out.println("--------------------------");
		
//		Dateischreiber filewriter = new Dateischreiber("Kunden.csv", "C://Daten");
//		filewriter.schreibeDatei();
//		
//		Datenbankschreiber dbwriter = new Datenbankschreiber("Kunde", "127.0.0.1");
//		dbwriter.schreibeDatenbank();
		
		
		Schreiber writer = new Dateischreiber("Kunden.csv", "C://Daten");
		writer = new Datenbankschreiber("Kunde", "127.0.0.1");
		writer.schreibe();
	}

}
