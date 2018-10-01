public class Gum extends Snack {

	private boolean chewy;

	public void gum() {

	}

	public void gum(Gum g) {
		System.out.println("Copy Gum Called");
		chewy = g.chewy;
	}

	public void gum(double price, String name, int oz, boolean chewy) {
		super.setPrice(price);
		super.setName(name);
		super.setOz(oz);
		this.chewy=chewy;
	}

	public boolean getChewy() {
		return chewy;
	}

	public void setChewy(boolean chewy) {
		this.chewy = chewy;
	}
	
	public String toString() {
		return super.toString();
	}

}
