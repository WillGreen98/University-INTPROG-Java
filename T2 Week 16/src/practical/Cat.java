package practical;

/**
 * @author Will
 * Practical Week 16
 */

public class Cat {
	private String name;
	private int age;
	private String furCol = "Brown";
	private String disposition = "";
	
	public Cat(String cName, int cAge, String cFurColour, String cDisposition) {
		name = cName;
		age = cAge;
		furCol = cFurColour;
		disposition = cDisposition;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFurCol() {
		return furCol;
	}

	public void setFurCol(String furCol) {
		this.furCol = furCol;
	}

	public String getDisposition() {
		return disposition;
	}

	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}
	
	public String output() {
		String myStr = "";
		String mood = getDisposition();
		if(mood == "Happy" || mood == "happy") {
			myStr = "Purr Purr Purr Purr";
		} else {
			myStr = "Meow Meow Meow Meow";
		}
		
		return myStr;
	} 

	public static void main(String[] args) {
		Cat cat = new Cat("Will", 4, "Brown", "Happy");
	}
}