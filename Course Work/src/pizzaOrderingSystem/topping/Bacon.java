package pizzaOrderingSystem.topping;

/**
 * Toping Class to manage pizza toping Bacon.
 * @author 853829
 */

import pizzaOrderingSystem.Canvas;
import java.awt.Color;

public class Bacon extends Topping {
	public Bacon(Canvas canvas, int x, int y) {
		super(canvas, x, y);
		setPrice(0.02f);
	}
	
	public void draw_Topping() {
		Color rectColor;
		int width = 5;
		int height = 15;
		
		for(int i=0, j=20; i<=3 && j<=80; i++, j+=5) {
			rectColor = (i % 2 == 0) ? Color.RED : Color.PINK;
			canvas.setForegroundColor(rectColor);
			canvas.fillRectangle(j, 20, width, height);
		}
	} 
}
