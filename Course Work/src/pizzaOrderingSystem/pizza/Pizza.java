package pizzaOrderingSystem.pizza;

/**
 * Class to represent a single pizza.
 * @author 853829
 */

import java.awt.Color;
import pizzaOrderingSystem.Canvas;
import pizzaOrderingSystem.KeyboardInput;

public class Pizza {
    private Canvas canvas;
    private KeyboardInput kbInput;
    private double topLeftX;
    private double topLeftY;
    
	private String[] pizza_infos = null;
    
    /**
     * Constructor for pizza.
     * @param win the window to draw the pizza on
     * @param startX the top-left x coordinate for the section of screen to draw pizza on
     * @param startY the top-left y coordinate for the section of screen to draw pizza on
     */
    public Pizza(Canvas win, double startX, double startY) {        
        canvas = win;
        topLeftX = startX;
        topLeftY = startY;
    }
    
    public String[] pizza_Options() {
    		String[] size = {"small", "medium", "large"};
    		String[] dough = {"deep pan", "thin crust", "stuffed crust"};
    		String[] sauce = {"tomato", "bbq"};
    		
    		String pizza_Size = kbInput.getInputString();
    		String pizza_Dough = kbInput.getInputString();
    		for(int i=0; i<size.length && i<dough.length; i++) {
    			for(String s: size) {
    				if(s != pizza_Size) {
    					System.out.println("Size not allowed. Size: " + size);
    				}
    			}
    			
    			for(String d: dough) {
    				if(d != pizza_Dough) {
    					System.out.println("Dough type not allowed. Dough: " + dough);
    				}
    			}
    		}
    	
    		String pizza_Sauce = kbInput.getInputString();
    		Color sauce_Color;
    		for(int i=0; i<sauce.length; i++) {
    			for(String s: sauce) {
    				if(s != pizza_Sauce) {
					System.out.println("Invalid sauce. Sauces: " + sauce);
				}
    			}
    			
    			if(pizza_Sauce == sauce[0]) {
    				sauce_Color = Color.RED;
    			} else if(pizza_Sauce == sauce[1]) {
    				sauce_Color = Color.ORANGE;
			}
    		}
    	
    		pizza_infos[0] = pizza_Size;
    		pizza_infos[1] = pizza_Dough;
    		pizza_infos[2] = pizza_Sauce;
    		pizza_infos[3] = sauce_Color;
		return pizza_infos;
    } 
        
    /**
     * Method to display the pizza on the screen.
     */
    private void drawPizza() {
        canvas.setForegroundColor(Color.YELLOW);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 200);
        
        String[] pizza_Info = pizza_Options();
        Color c = pizza_Info[3];
        canvas.setForegroundColor(c);
        canvas.fillCircle(topLeftX + 170, topLeftY + 170, 200);
    }
    
    /**
     * Method to write the information shown in the bottom line of the 
     * individual pizza on the screen. 
     * This method will display the pizza number and size at the top of the 
     * screen (once completed)
     */
    private void drawTopLine() {
        String topLine = "Pizza" + pizza_infos[0];
                
        double stringX = topLeftX + 10;
        double stringY = topLeftY + 25;
        
        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(topLine, stringX, stringY);
    }
    
    /**
     * Method to write the information shown in the bottom line of the 
     * individual pizza on the screen.  
     * This method will display the type of crust and sauce ordered (once 
     * completed)
     */
    private void drawBottomLine() {
        String bottomLine = "Crust: " + pizza_infos[1];
                
        double stringX = topLeftX + 10;
        double stringY = topLeftY + 290;
        
        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(bottomLine, stringX, stringY);
    }    
    
    /**
     * Method to display the pizza information on the screen.
     */
    public void displayPizza() {
    		pizza_Options();
        drawPizza();
        drawTopLine();
        drawBottomLine();
    }
}