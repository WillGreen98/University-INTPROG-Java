package pizzaOrderingSystem.pizza;

/**
 * Class to represent user input.
 * @author 853829
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import pizzaOrderingSystem.KeyboardInput;

public class OrderSystem_Input {
	private KeyboardInput kbInput = new KeyboardInput();
	protected String[] pizza_infos = new String[3];
	
	/**
	 * 
	 */
	public OrderSystem_Input() {}
	
	/**
     * 
     * @return array containing all pizza info
     */
	public String[] pizza_Options() {	
		List<String> size = new ArrayList<>(Arrays.asList("small", "medium", "large"));
		List<String> dough = new ArrayList<>(Arrays.asList("deep pan", "thin crust", "stuffed crust"));
		List<String> sauces = new ArrayList<>(Arrays.asList("tomato", "bbq"));
		
		// Needed as global variable for while condition... Can't do String pizza_Size = kbInput.getInputString();
		String pizza_Size;		
		do {
			System.out.println("Enter Pizza size: ");
			pizza_Size = kbInput.getInputString();
			
			if(size.contains(pizza_Size)) {
				pizza_infos[0] = pizza_Size;
			} else {
				System.out.println("Size not valid. Sizes: " + Arrays.asList(size));	
			}
		} while(!size.contains(pizza_Size));
		
		String pizza_Dough;
		do {
			System.out.println("Enter type of dough: ");
			pizza_Dough = kbInput.getInputString();
			
			if(dough.contains(pizza_Dough)) {
				pizza_infos[1] = pizza_Dough;
			} else {
				System.out.println("Dough type not valid. Dough types: " + Arrays.asList(dough));
			}
		} while(!dough.contains(pizza_Dough));
		
		String pizza_Sauce;
		do {
			System.out.println("Enter the type of sause: ");
			pizza_Sauce = kbInput.getInputString();
			
			if(sauces.contains(pizza_Sauce)) {
				pizza_infos[2] = pizza_Sauce;
			} else {
				System.out.println("Sauce not valid. Sauces: " + Arrays.asList(sauces));
			}
		} while(!sauces.contains(pizza_Sauce));
		
		return pizza_infos; // Return an array to pass values to drawPizza()
	} 
}