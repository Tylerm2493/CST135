public abstract class Snack extends Product {

	private int oz;

	public void snack() {

	}

	public void snack(Snack s) {
		System.out.println("Copy Snack Called");
		oz = s.oz;
	}

	public void snack(double price, String name, int oz) {
		super.setPrice(price);
		super.setName(name);
		this.oz=oz;
	}

	public String toString() {
		return super.toString();
	}

	public int getOz() {
		return oz;
	}

	public void setOz(int oz) {
		this.oz = oz;
	}

}
