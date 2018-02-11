package practicle;

/**
 * @author Will
 * Practical Week 17
 */

import java.awt.*;
import inClass.canvas.Canvas;

public class StickFigure {
	private Canvas window;
	private double scale;
	private Color color;
	
	public StickFigure(Canvas window, double scale, Color color) {
		this.window = window;
		this.scale = scale;
		this.color = color;
	}
	
	public void draw_StickFigure() {
		window.setForegroundColor(color);
		
		window.fillCircle(250 * scale, 100 * scale, 100 * scale);
		window.drawLine(250 * scale, 150 * scale, 250 * scale, 300 * scale);
		window.drawLine(150 * scale, 200 * scale, 350 * scale, 200 * scale);
		window.drawLine(250 * scale, 300 * scale, 200 * scale, 400 * scale);
		window.drawLine(250 * scale, 300 * scale, 300 * scale, 400 * scale);
	} 
	
	public static void main(String[] args) {
		StickFigure_Attributes stk_Att = new StickFigure_Attributes();
		
		int window_Size = stk_Att.getWindowSize();
		double scale = window_Size / 500;
		
		Canvas stkF_Canvas = new Canvas("Stick Figure", window_Size, window_Size);
		StickFigure stkF = new StickFigure(stkF_Canvas, scale ,stk_Att.randCol());
		stkF.draw_StickFigure();

	}
}