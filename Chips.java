public class Chips extends Snack {

	private boolean salty;

	public void chips() {

	}

	public void chips(Chips ch) {
		System.out.println("Copy Chips Called");
		salty = ch.salty;
	}

	public void chips(double price, String name, int oz, boolean salty) {
		super.setPrice(price);
		super.setName(name);
		super.setOz(oz);
		this.salty=salty;
	}

	public boolean getSalty() {
		return salty;
	}

	public void setSweet(boolean salty) {
		this.salty = salty;
	}
	
	public String toString() {
		return super.toString();
	}

}
