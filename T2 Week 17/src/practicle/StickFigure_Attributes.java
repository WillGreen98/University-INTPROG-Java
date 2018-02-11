package practicle;

/**
 * @author Will
 * Practical Week 17
 */

import java.awt.*;
import java.util.Random;
import inClass.input.KeyboardInput;

public class StickFigure_Attributes {
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
	
	public int getWindowSize() {
		KeyboardInput key_In = new KeyboardInput();
		
		System.out.println("Please enter window height: ");
		int window_Size = key_In.getInputInteger();
		System.out.println("\n The window will be: " + window_Size + " x " + window_Size);
		
		return window_Size;
	} 
}