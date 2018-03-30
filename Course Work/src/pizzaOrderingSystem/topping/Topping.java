package pizzaOrderingSystem.topping;

/**
 * Super-Class to manage the pizza toping.
 * @author 853829
 */

import pizzaOrderingSystem.Canvas;

public class Topping {
	protected Canvas canvas;
	protected double x;
	protected double y;
	private double topLeftX;
	private double topLeftY;
	protected float price;

	/**
	 * @param canvas
	 * @param x
	 * @param y
	 */
	public Topping(Canvas canvas, double x, double y) {
		this.canvas = canvas;
		topLeftX = x;
		topLeftY = y;
	}
	
	/**
	 * @return
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
}