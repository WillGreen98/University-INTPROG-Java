package pizzaOrderingSystem.pizza;

/**
 * Class to represent a single pizza.
 * @author 853829
 */

import java.awt.Color;

import pizzaOrderingSystem.pizza.OrderSystem_Input;
import pizzaOrderingSystem.topping.Anchovy;
import pizzaOrderingSystem.topping.Bacon;
import pizzaOrderingSystem.Canvas;

public class Pizza extends OrderSystem_Input {
	private Canvas canvas;
	private double topLeft_X;
	private double topLeft_Y;

	/**
	 * Constructor for pizza.
	 * 
	 * @param win - the window to draw the pizza on
	 * @param startX - the top-left x coordinate for the section of screen to draw pizza on
	 * @param startY - the top-left y coordinate for the section of screen to draw pizza on
	 */
	public Pizza(Canvas win, double startX, double startY) {
		canvas = win;
		topLeft_X = startX;
		topLeft_Y = startY;
	}
	
	/**
	 * Method to draw first toppings
	 */
	public void drawTopping(String choice, double startX, double startY, int area) {
        int count = 0;
        Bacon bacon = new Bacon(canvas, 0, 0);
        Anchovy anchovy = new Anchovy(canvas, 0, 0);
        
        for(double x=1, y=1; x<4 && y<4; x++, y++) {
            if(choice.equals("anchovy") && count % 2 == area) {
            		anchovy.draw_Topping(canvas, startX + (x * 50) + 50, startY + (y * 50) + 50);
            } else if(choice.equals("bacon") && count % 2 == 0) {
                bacon.draw_Topping(canvas, startX + (x * 50) + 50, startY + (y * 50) + 50);
            }
            count += 1;
        }
	}
	
	/**
	 * Method to asign toppings to value 0 or 1 as index.
	 */
	private void drawTopping() {
		Bacon bacon = new Bacon(canvas, 0, 0);
        Anchovy anchovy = new Anchovy(canvas, 0, 0);
		if("anchoy".equalsIgnoreCase(getToppings_List().get(0))) {
			draw_ToppingOne();
        } else {
            draw_ToppingOne();
        }
		
        if("bacon".equalsIgnoreCase(getToppings_List().get(1))) {
            draw_ToppingTwo();
        } else {
            draw_ToppingTwo();
        }
	}
	
	/**
	 * Method to draw first topping five times
	 */
	public void draw_ToppingOne() {
		drawTopping(null, topLeft_X, topLeft_Y, 0);
		drawTopping(null, topLeft_X + 90, topLeft_Y, 0);
		drawTopping(null, topLeft_X, topLeft_Y + 90, 0);
		drawTopping(null, topLeft_X + 90, topLeft_Y + 90, 0);
		drawTopping(null, topLeft_X + 45, topLeft_Y + 45, 0);
	}
	
	/**
	 * Method to draw second topping four times
	 */
	public void draw_ToppingTwo() {
		drawTopping(null, topLeft_X + 45, topLeft_Y, 0);
		drawTopping(null, topLeft_X, topLeft_Y + 45, 0);
		drawTopping(null, topLeft_X + 90, topLeft_Y + 45, 0);
		drawTopping(null, topLeft_X + 45, topLeft_Y + 90, 0);
	}

	/**
	 * Method to display the pizza on the screen.
	 */
	private void drawPizza() {
		canvas.setForegroundColor(Color.YELLOW);
		canvas.fillCircle(topLeft_X + 150, topLeft_Y + 150, 200);

		Color sauce_Color = null;
		if("tomato".equalsIgnoreCase(getPizza_info()[2])) { // The preferred Java style...
			sauce_Color = Color.RED;
		} else if("bbq".equalsIgnoreCase(getPizza_info()[2])) {
			sauce_Color = Color.ORANGE;
		}

		canvas.setForegroundColor(sauce_Color);
		canvas.fillCircle(topLeft_X + 150, topLeft_Y + 150, 175);

		canvas.setForegroundColor(Color.WHITE);
		canvas.fillCircle(topLeft_X + 150, topLeft_Y + 150, 155);
	}

	/**
	 * Method to write the information shown in the bottom line of the individual
	 * pizza on the screen. This method will display the pizza number and size at
	 * the top of the screen
	 */
	private void drawTopLine() {
		String topLine = "Pizza Size: " + getPizza_info()[0];

		double stringX = topLeft_X + 10;
		double stringY = topLeft_Y + 25;

		canvas.setForegroundColor(Color.BLACK);
		canvas.setFontSize(15);
		canvas.drawString(topLine, stringX, stringY);
	}

	/**
	 * Method to write the information shown in the bottom line of the individual
	 * pizza on the screen. This method will display the type of crust and sauce
	 * ordered
	 */
	private void drawBottomLine() {
		String bottomLine = "Crust Type: " + getPizza_info()[1] + " - Sauce: " + getPizza_info()[2];

		double stringX = topLeft_X + 10;
		double stringY = topLeft_Y + 290;

		canvas.setForegroundColor(Color.BLACK);
		canvas.setFontSize(15);
		canvas.drawString(bottomLine, stringX, stringY);
	}
	
	/**
	 * Method to return pizza attribute price
	 * @return
	 */
	public double getPrice() {
        double pizza_Area = 0.00;
        double price_Total = 0.00;
        
        if("small".equalsIgnoreCase(getPizza_info()[0])) {
            pizza_Area = PizzaOptions_Pricing.SMALL.getArea();
        } else if("medium".equalsIgnoreCase(getPizza_info()[0])){
            pizza_Area = PizzaOptions_Pricing.MEDIUM.getArea();
        } else if("large".equalsIgnoreCase(getPizza_info()[0])) {
            pizza_Area = PizzaOptions_Pricing.LARGE.getArea();
        }

        if("deep pan".equalsIgnoreCase(getPizza_info()[1])) {
            price_Total += pizza_Area * PizzaOptions_Pricing.DEEPPAN.getPrice();
        } else if("thin crust".equalsIgnoreCase(getPizza_info()[1])) {
            price_Total += pizza_Area * PizzaOptions_Pricing.THINCRUST.getPrice();
        } else if("stuffed crust".equalsIgnoreCase(getPizza_info()[1])) {
            price_Total += pizza_Area * PizzaOptions_Pricing.STUFFEDCRUST.getPrice();
        }
        
        if("bbq".equalsIgnoreCase(getPizza_info()[2])) {
            price_Total += PizzaOptions_Pricing.BBQ.getPrice();
        }
        
        Bacon bacon = new Bacon(canvas, 0, 0);
        Anchovy anchovy = new Anchovy(canvas, 0, 0);
        if("anchovy".equalsIgnoreCase(getToppings_List().get(0))) {
            price_Total += (anchovy.getPrice() * 5);
        } else if("bacon".equalsIgnoreCase(getToppings_List().get(1))) {
            price_Total += (bacon.getPrice() * 5);
        }
        
        if("bacon".equalsIgnoreCase(getToppings_List().get(0))) {
            price_Total += (bacon.getPrice() * 4);
        } else if("anchovy".equalsIgnoreCase(getToppings_List().get(1))) {
            price_Total += (anchovy.getPrice() * 4);
        }
                
        return price_Total;
    }
		
	/**
	 * Method to display the pizza information on the screen.
	 */
	public void displayPizza() {
		pizza_Options();
		drawTopLine();
		drawBottomLine();
		drawPizza();
		drawTopping();
	}
}