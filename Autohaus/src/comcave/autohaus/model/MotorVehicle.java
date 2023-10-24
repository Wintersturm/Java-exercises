package comcave.autohaus.model;

public class MotorVehicle {
	private double size[] = new double[3];
	private double weigth;
	private String brand;
	private String customer;
	private Address start;
	private Address destination;
	private boolean collect;

	public double[] getSize() {
		return size;
	}

	public void setSize(double[] size) {
		this.size = size;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Address getStart() {
		return start;
	}

	public void setStart(Address start) {
		this.start = start;
	}

	public Address getDestination() {
		return destination;
	}

	public void setDestination(Address destination) {
		this.destination = destination;
	}

	public boolean isCollect() {
		return collect;
	}

	public void setCollect(boolean collect) {
		this.collect = collect;
	}

	public MotorVehicle(double[] size, double weigth, String brand, String customer, Address start, Address destination,
			boolean collect) {
		super();
		this.size = size;
		this.weigth = weigth;
		this.brand = brand;
		this.customer = customer;
		this.start = start;
		this.destination = destination;
		this.collect = collect;
	}
	
	public String printMotorVehicle() {
		if(this.collect) {
			return this.toString();
		} else {
			return this.toString() + "Kein Selbstabholer";
		}
	}
	
	public String toString() {
		return "Größe : " +  this.size[0] + " x " + this.size[1] + " x " + this.size[2] + System.lineSeparator() +
				"Gewicht: " + this.weigth + System.lineSeparator() +
				"Automarke: " + this.brand + System.lineSeparator() +
				"Startadresse: " + this.start.printAddress() + 
				"Zieladresse: " + this.destination.printAddress();
	}
	
}
