package comcave.kollektionen;

import java.util.Arrays;

import comcave.kollektionen.model.Liste;
import comcave.kollektionen.model.Maps;
import comcave.kollektionen.model.Sets;
import comcave.kollektionen.model.enums.Hauptstadt;
import comcave.kollektionen.model.enums.Stadt;

public class App {

	public static void main(String[] args) {
//		Liste.ArrayListBeispiel();
		
//		Maps.HashMapBeispiel();
//		Maps.HashMapBeispiel2();
		
//		Sets.SetBeispiel();
//		Sets.SetBeispiel2();
		
		Stadt a = Stadt.Berlin;
		System.out.println(a);
		
		Hauptstadt c = Hauptstadt.Irland;
		System.out.println(c.getStadt());

	}

}
