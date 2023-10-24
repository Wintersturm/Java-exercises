package comcave.autohaus.model;

public class Address {
	private String firstname;
	private String lastname;
	private String street;
	private String number;
	private String zipcode;
	private String city;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		if(zipcode.chars().allMatch(Character::isDigit)) {
			this.zipcode = zipcode;
		}
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String firstname, String lastname, String street, String number, String zipcode, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
		this.number = number;
		this.setZipcode(zipcode);
		this.city = city;
	}
	
	public String printAddress() {
		return this.firstname + " " +
				this.lastname + " " +
				this.street + " " + 
				this.number + " " +
				this.zipcode + " " +
				this.city + System.lineSeparator();
	}
	
	public String toString() {
		return this.printAddress();
	}
	
	

}
