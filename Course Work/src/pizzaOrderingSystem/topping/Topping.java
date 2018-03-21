package pizzaOrderingSystem.topping;

/**
 * Super-Class to manage the pizza toping.
 * @author 853829
 */

import pizzaOrderingSystem.Canvas;

public class Topping {
	protected Canvas canvas;
	protected int x;
	protected int y;
	protected float price;
	
	public Topping(Canvas canvas, int x, int y) {
		this.canvas = canvas;
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}