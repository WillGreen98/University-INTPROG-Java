package pizzaOrderingSystem.pizza;

/**
 * Class to manage the pizza order.
 * @author 853829
 */

import java.awt.Color;

import pizzaOrderingSystem.Canvas;

public class OrderingSystem {
    private Canvas canvas;
    OrderSystem_Input osi = new OrderSystem_Input();  
    
    /**
     * Constructor for the ordering system.
     */
    public OrderingSystem() {
        canvas = new Canvas("Pizza Ordering", 900, 650);         
    }
    
    
    
    /**
     * Method to draw the outline of the order screen.
     */
    public void drawOrderScreen() {
        canvas.setForegroundColor(Color.BLACK);
        // vertical dividers
        canvas.drawLine(300, 0, 300, 600);
        canvas.drawLine(600, 0, 600, 600);
        
        // halfway divider
        canvas.drawLine(0, 300, 900, 300);
        
        // total price line
        canvas.drawLine(0, 600, 900, 600);
        canvas.setFontSize(25);
        canvas.drawString("Total Price of the Order: £" + 7, 10, 640);
        
    }
     
    /**
     * Method to manage the ordering of a pizza.
     */
    public void startOrdering() {
    		// First Row
        Pizza pizza1 = new Pizza(canvas, 0, 0);
        pizza1.displayPizza();
        
        Pizza pizza2 = new Pizza(canvas, 300, 0);
        pizza2.displayPizza();
        
        Pizza pizza3 = new Pizza(canvas, 600, 0);
        pizza3.displayPizza();
        
        // Second Row
        Pizza pizza4 = new Pizza(canvas, 0, 300);
        pizza4.displayPizza();
        
        Pizza pizza5 = new Pizza(canvas, 300, 300);
        pizza5.displayPizza();
        
        Pizza pizza6 = new Pizza(canvas, 600, 300);
        pizza6.displayPizza();
         	
//        int[] xPos = {0, 300, 600};
//        
//        Pizza[] pizza_Init = new Pizza[5];
//        for(int i=0, xi=0; i<=pizza_Init.length && xi<=xPos.length; i++, xi++) {
//      		pizza_Init[i] = new Pizza(canvas, (xi==3) ? xi=0 : xi++, (i==3) ? 0 : 300);
//        		pizza_Init[i].displayPizza();
//        	}
    }
}   