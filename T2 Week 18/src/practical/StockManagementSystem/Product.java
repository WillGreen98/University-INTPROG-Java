package practical.StockManagementSystem;

public class Product {
	private int product_ID;
	private String name;
	private int quantity;

	public Product(int product_ID, String name, int quantity) {
		this.product_ID = product_ID;
		this.name = name;
		this.quantity = quantity;
	}

	public int getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(int product_ID) {
		this.product_ID = product_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void increaseQuantity(int upStock) {
		if (upStock == getQuantity()) {
			System.out.println("You are not increases, value will stay the same");
		} else if (upStock < getQuantity()) {
			System.out.println("Increase in stock cannot be lower than current quantity");
		} else {
			setQuantity(upStock);
		}
	}

	public void sellItem() {
		System.out.println("");
	}

	public void printInfo() {
		System.out.println("Product Id: " + product_ID);
		System.out.println("Name: " + name);
		System.out.println("Quantity: " + quantity);
	}
}