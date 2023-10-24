package comcave.autohaus;

import comcave.autohaus.model.Address;
import comcave.autohaus.model.MotorVehicle;

public class App {

	public static void main(String[] args) {
		Address autohersteller = new Address("", "Autohersteller", "Autoplatz", "1", "11111", "Autostadt");
		Address peterAuto = new Address("Peter", "Musterautohaus", "Marktplatz", "2", "80888", "München");
		
		double[] size = new double[] {300, 150, 150};

		MotorVehicle jeep = new MotorVehicle(size, 1300, "Jeep", null, autohersteller, peterAuto, false);
		System.out.println(jeep.printMotorVehicle());
		
	}

}
