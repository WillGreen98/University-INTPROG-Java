package pizzaOrderingSystem.pizza;

/**
 * @author Will
 * Enum Class to handle price indexing
 */

public enum PizzaOptions_Pricing {	
	SMALL("Size", "small", 0.00, 78.54),
	MEDIUM("Size", "medium", 0.00, 113.10),
	LARGE("Size", "large", 0.00, 153.94),
	DEEPPAN("DoughType", "deep pan", 0.11, 0.00),
	THINCRUST("DoughType", "thin crust", 0.08, 0.00),
	STUFFEDCRUST("DoughType", "stuffed crust", 0.14, 0.00),
	TOMATO("Sauce", "tomato", 0.00, 0.00),
	BBQ("Sauce", "bqq", 0.50, 0.00);
	
	private String type;
	private String value;
	private double price;
	private double area;
	
	/**
	 * @param type
	 * @param value
	 * @param price
	 * @param area
	 */
	PizzaOptions_Pricing(String type, String value, double price, double area) {
		this.type = type;
		this.value = value;
		this.price = price;
		this.area = area;
	}

	/**
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area
	 */
	public void setDiameter(float area) {
		this.area = area;
	}
}