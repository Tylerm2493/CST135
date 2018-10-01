public class Candy extends Snack {

	private boolean sweet;

	public void candy() {

	}

	public void candy(Candy c) {
		System.out.println("Copy Candy Called");
		sweet=c.sweet;
	}

	public void candy(double price, String name, int oz, boolean sweet) {
		super.setPrice(price);
		super.setName(name);
		super.setOz(oz);
		this.sweet=sweet;
	}
	
	public boolean getSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public String toString() {
		return super.toString();
	}

}
