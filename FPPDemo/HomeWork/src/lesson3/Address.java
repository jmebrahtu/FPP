 package lesson3;

public class Address {

	private String Street;
	private String City;
	private String State;
	private String  zip;
	public Address(String Street,String City,String State,String  zip) {
		this.Street=Street;
		this.City=City;
		this.State=State;
		this.zip=zip;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
