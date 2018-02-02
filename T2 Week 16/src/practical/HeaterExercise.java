package practical;

/**
 * @author Will
 * Practical Week 16
 */

public class HeaterExercise {
	private float temperature;
	private int adapation_temp = 5;
	
	public HeaterExercise() {
		temperature = 15.0f;
	}
	
	public int getAdapt() {
		return adapation_temp;
	} 
	
	public void setAdapt(float newAdapt) {
		if(newAdapt <= 0) {
			System.out.println("You cannot set value to zero or below");
		} else {
			adapation_temp += newAdapt;
		}
	} 
	
	public void cooler() {
		temperature -= getAdapt();
	} 
	
	public void warmer() {
		temperature += getAdapt();
	} 
	
	public float getTemp() {
		return temperature;
	} 
	
	public static void main(String[] args) {
		HeaterExercise heater = new HeaterExercise();
		System.out.println(heater.getTemp());
		
		heater.warmer();
		System.out.println(heater.getTemp());
		
		heater.cooler();
		System.out.println(heater.getTemp());
	}
}
