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
	private ArrayList<String> toppings_List;
	
	protected String[] pizza_info = new String[3];

	public OrderSystem_Input() {
		toppings_List = new ArrayList<String>();
	}
	
	public void ask_Topping(int toppings_Count) {
		List<String> toppings = new ArrayList<>(Arrays.asList("anchovy", "bacon"));
		
		String topping;
		for(int i=0; i<toppings_Count; i++) {
			do {
				System.out.println("Enter Topping: ");
				topping = kbInput.getInputString();
				
				if(toppings.contains(topping)) {
					toppings_List.add(topping);					
				} else {
					System.out.println("Topping not avaliable. Toppings: " + Arrays.asList(toppings));
				}
			} while(!toppings.contains(topping));
		}
	}
	
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
				pizza_info[0] = pizza_Size;
			} else {
				System.out.println("Size not valid. Sizes: " + Arrays.asList(size));	
			}
		} while(!size.contains(pizza_Size));
		
		String pizza_Dough;
		do {
			System.out.println("Enter type of dough: ");
			pizza_Dough = kbInput.getInputString();
			
			if(dough.contains(pizza_Dough)) {
				pizza_info[1] = pizza_Dough;
			} else {
				System.out.println("Dough type not valid. Dough types: " + Arrays.asList(dough));
			}
		} while(!dough.contains(pizza_Dough));
		
		String pizza_Sauce;
		do {
			System.out.println("Enter the type of sause: ");
			pizza_Sauce = kbInput.getInputString();
			
			if(sauces.contains(pizza_Sauce)) {
				pizza_info[2] = pizza_Sauce;
			} else {
				System.out.println("Sauce not valid. Sauces: " + Arrays.asList(sauces));
			}
		} while(!sauces.contains(pizza_Sauce));
		
		int toppings_Num; 
		System.out.println("How many topppings would you like to add? : ");
		toppings_Num = kbInput.getInputInteger();
		
		if(Integer.toString(toppings_Num).isEmpty() || toppings_Num == 0) { 
			System.out.println("A simple pizza person, you are, enjoy you must.");
			ask_Topping(toppings_Num);
		} else if(toppings_Num == 1) {
			ask_Topping(toppings_Num);
		} else if(toppings_Num == 2) {
			ask_Topping(toppings_Num);
		} else {
			System.out.println("Error, invalid option.");
		}
		
		return pizza_info; // Return an array to pass values to drawPizza()
	} 
}