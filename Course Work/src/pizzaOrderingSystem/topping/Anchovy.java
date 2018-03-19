package pizzaOrderingSystem.topping;

import java.awt.Color;

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
	
	public void draw_Topping() {
		double circleP1X = x + 95;
		double circleP1Y = y + 105;
		double width = 30;
		double height = 12;
		double eyeX = x + 118;
		double eyeY = y + 111;
		double eyeDiameter = 4;
		double TriangleP1X = x + 89;
		double TriangleP1Y = y + 102;
        
		canvas.setForegroundColor(Color.black);
		canvas.fillSemiCircle(circleP1X, circleP1Y, width, height, true, false);
		canvas.setForegroundColor(Color.black);
		canvas.fillSemiCircle(circleP1X, circleP1Y, width, height, true, true);
		canvas.setForegroundColor(Color.white);
		canvas.fillCircle(eyeX, eyeY, eyeDiameter);
		canvas.setForegroundColor(Color.black);
		canvas.fillTriangle(TriangleP1X ,TriangleP1Y, TriangleP1X, TriangleP1Y +15, TriangleP1X +15, TriangleP1Y +10);
	} 
}
