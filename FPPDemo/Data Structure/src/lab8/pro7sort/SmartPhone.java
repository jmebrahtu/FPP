package lab8.pro7sort;

public class SmartPhone {

	private String brand;
	private String model;
	private int price;

	public SmartPhone(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SmartPhone [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}

}
