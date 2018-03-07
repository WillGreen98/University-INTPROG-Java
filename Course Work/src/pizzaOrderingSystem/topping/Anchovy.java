package pizzaOrderingSystem.topping;

/**
 * Toping Class to manage pizza toping Anchovy.
 * @author 853829
 */

import pizzaOrderingSystem.Canvas;

public class Anchovy extends Topping {
	private float price = 0.07f;
	
	public Anchovy(Canvas canvas, int x, int y, Float price) {
		super(canvas, x, y, price);	
	}
	
	public void draw_Topping() {} 
}
