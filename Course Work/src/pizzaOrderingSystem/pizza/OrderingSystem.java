package pizzaOrderingSystem.pizza;

/**
 * Class to manage the pizza order.
 * @author 853829
 */

import java.awt.Color;
import java.util.ArrayList;

import pizzaOrderingSystem.Canvas;

public class OrderingSystem extends OrderSystem_Input {
	private Canvas canvas;
	Pizza[] pizza_Init = new Pizza[6];
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	

	/**
	 * Constructor for Ordering System
	 */
	public OrderingSystem() {
		canvas = new Canvas("Pizza Ordering", 900, 650);
	}

	/**
	 * Calculates total cost of all pizzas combined
	 * @return
	 */
	public double calculatePrice() {
        double price_Total = 0.00;
        for(Pizza pizza: pizzas) {
            System.out.println(pizza.getPrice());
            price_Total += pizza.getPrice();
        }
        
        return price_Total;
    }

	/**
	 * Method to display all information on pricing -> Section
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
		canvas.drawString("Total Price of the Order: £" + String.format("%.2f", calculatePrice()), 10, 640);
	}

	/**
	 * Method to manage the ordering of a pizza.
	 * @return 
	 */
	public void startOrdering() {
		int counter = 1;
		int[] xPos = {0, 300, 600};
		
		for(int i=0, x=0; i<pizza_Init.length; i++, x++) {
			pizza_Init[i] = new Pizza(canvas, xPos[(x>2) ? x=0 : x], (i>2) ? 300 : 0);
			pizzas.add(pizza_Init[i]);
			pizza_Init[i].displayPizza();
			counter++;
		}
	}
}