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
		double width = 30;
		double height = 12;
		
		double circle_X = x + 95;
		double circle_Y = y + 105;
		
		double eye_X = x + 118;
		double eye_Y = y + 111;
		double eye_Diameter= 4;
		
		double Triangle_X = x + 89;
		double Triangle_Y = y + 102;
        
		canvas.setForegroundColor(Color.GRAY);
		canvas.fillSemiCircle(circle_X, circle_Y, width, height, true, false);
		
		canvas.setForegroundColor(Color.GRAY);
		canvas.fillSemiCircle(circle_X, circle_Y, width, height, true, true);
		
		canvas.setForegroundColor(Color.WHITE);
		canvas.fillCircle(eye_X, eye_Y, eye_Diameter);
		
		canvas.setForegroundColor(Color.GRAY);
		canvas.fillTriangle(Triangle_X ,Triangle_Y, Triangle_X, Triangle_Y +15, Triangle_X +15, Triangle_Y +10);
	} 
}
