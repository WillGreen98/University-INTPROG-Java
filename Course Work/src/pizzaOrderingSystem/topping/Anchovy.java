package pizzaOrderingSystem.topping;

/**
 * Toping Class to manage pizza toping Anchovy.
 * @author 853829
 */

import java.awt.Color;
import pizzaOrderingSystem.Canvas;

public class Anchovy extends Topping {
	/**
	 * @param canvas
	 * @param x
	 * @param y
	 */
	public Anchovy(Canvas canvas, double x, double y) {
		super(canvas, x, y);
		setPrice(0.07f);
	}

	public void draw_Topping(Canvas canvas, double x, double y) {
		double width = 30;
		double height = 12;

		double circle_X = x + 95;
		double circle_Y = y + 105;

		double Triangle_X = x + 89;
		double Triangle_Y = y + 102;

		canvas.setForegroundColor(Color.GRAY);
		canvas.fillSemiCircle(circle_X, circle_Y, width, height, true, false);

		canvas.setForegroundColor(Color.GRAY);
		canvas.fillSemiCircle(circle_X, circle_Y, width, height, true, true);

		canvas.setForegroundColor(Color.WHITE);
		canvas.fillCircle(x + 118, y + 111, 4);

		canvas.setForegroundColor(Color.GRAY);
		canvas.fillTriangle(Triangle_X, Triangle_Y, Triangle_X, Triangle_Y + 15, Triangle_X + 15, Triangle_Y + 10);
	}
}
