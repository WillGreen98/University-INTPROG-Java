package practical;

/**
 * @author Will
 * Practical Week 16
 */

public class Dog {
	private String name;
	private float weight;
	private String food;
	
	public String[] food_List = {"Pedigree Chum", "Barker's Chicken","Woofer's Beef"};
	
	public Dog(String name, float weight, String food) {
		this.name = name;
		this.weight = weight;
		this.food = food;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String[] getFood_List() {
		return food_List;
	}

	public void setFood_List(String[] food_List) {
		this.food_List = food_List;
	}
	
	public String bark() {
		return "Woof Woof Woof Woof";
		
	} 
	
	public int feed(int amount, String measure) {
		int calculation = (int) ((weight / 750) * amount);
		
		return calculation;
	} 
	
	public void foodIntake() {
		if(food == food_List[0]) {
			feed(4, "g");
		} else if(food == food_List[1]) {
			feed(8, "g");
		} else if(food == food_List[2]) {
			feed(10, "g");
		} else {
			feed(6, "g");
		}
	} 

	public static void main(String[] args) {
		Dog Loki = new Dog("Loki", 36.0f, "Barker's Chicken");
	}
}