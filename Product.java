public abstract class Product extends Dispenser{

	private String name;

	private double price;

	public void product() {

	}

	public void product(Product p) {
		System.out.println("Copy Product Called");
		name = p.name;
		price = p.price;
	}

	public void product(double price, String name) {
		this.price=price;
		this.name=name;
	}

	public String toString() {
		return "";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
