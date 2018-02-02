package practical;

/**
 * @author Will
 *
 */

public class HeaterExercise {
	private float temperature;
	
	public HeaterExercise() {
		temperature = 15.0f;
	}
	
	public void cooler() {
		temperature -= 5.0f;
	} 
	
	public void warmer() {
		temperature += 5.0f;
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
