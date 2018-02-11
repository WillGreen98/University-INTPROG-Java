package practicle;

/**
 * @author Will
 * Practical Week 17
 */

import java.awt.*;
import java.util.Random;
import inClass.canvas.Canvas;

public class StickFigure {
	private Canvas window;
	private Color color;
	
	public StickFigure(Canvas window, Color color) {
		this.window = window;
		this.color = color;
	}
	
	public Color randCol() {
		Random rand = new Random();
		int randInt = rand.nextInt(3);
		
		if(randInt == 0) {
			return Color.RED;
		} else if(randInt == 1) {
			return Color.BLUE;
		} else {
			return Color.GREEN;
		}
	} 
	
	public void draw_StickFigure() {
		window.setForegroundColor(Color.RED);
		
		window.fillCircle(250, 100, 100);
		window.drawLine(250, 150, 250, 300);
		window.drawLine(150, 200, 350, 200);
		window.drawLine(250, 300, 200, 400);
		window.drawLine(250, 300, 300, 400);
	} 
	
	public static void main(String[] args) {
		Canvas stkF_Canvas = new Canvas("Stick Figure", 500, 500);
		StickFigure stkF = new StickFigure(stkF_Canvas);
		Color rand_Color = stkF.randCol();
		
		stkF.draw_StickFigure();

	}
}