public class Drink extends Product {

	private int fluidOz;

	public void drink() {

	}

	public void drink(Drink d) {
		System.out.println("Copy Drink Called");
		fluidOz = d.fluidOz;
	}

	public void drink(double price, String name, int fluidOz) {
		super.setPrice(price);
		super.setName(name);
		this.fluidOz=fluidOz;
	}
	
	public int getFluidOz() {
		return fluidOz;
	}

	public void setFluidOz(int fluidOz) {
		this.fluidOz = fluidOz;
	}

	public String toString() {
		return super.toString();
	}

}
