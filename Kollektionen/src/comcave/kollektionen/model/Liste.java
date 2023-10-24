package comcave.kollektionen.model;

import java.util.ArrayList;

public class Liste {
	public static void ArrayListBeispiel() {
		ArrayList<String> woerter = new ArrayList<String>();
		woerter.add("hallo");
		woerter.add("welt");
		woerter.add("star");
		woerter.add("wars");
		System.out.println(woerter);
		
//		woerter.remove(1);
		woerter.set(1, "hallo");
		System.out.println(woerter);
	}
}
