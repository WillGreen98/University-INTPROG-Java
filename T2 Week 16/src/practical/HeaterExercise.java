package practical;

/**
 * @author Will
 * Practical Week 16
 */

public class HeaterExercise {
	private float temperature;
	private int adapation_Temp = 5;
	
	private float min_Temp;
	private float max_Temp;
	
	public HeaterExercise(float cTemperature, float cMin, float cMax) {
		temperature = 15.0f;
		min_Temp = cMin;
		max_Temp = cMax;
	}
	
	public float getMin_Temp() {
		return min_Temp;
	}

	public void setMin_Temp(float min_Temp) {
		this.min_Temp = min_Temp;
	}

	public float getMax_Temp() {
		return max_Temp;
	}

	public void setMax_Temp(float max_Temp) {
		this.max_Temp = max_Temp;
	}

	public int getAdapt() {
		return adapation_Temp;
	} 
		
	public void setAdapt(float newAdapt) {
		if(newAdapt <= 0) {
			System.out.println("You cannot set value to zero or below");
		} else {
			adapation_Temp += newAdapt;
		}
	} 
	
	public void cooler() {
		if(getAdapt() < max_Temp && getAdapt() > min_Temp) {
			temperature -= getAdapt();
		} else {
			System.out.println("Error");
		}
	} 
		
	public void warmer() {
		if(getAdapt() < max_Temp && getAdapt() > min_Temp) {
			temperature += getAdapt();
		} else {
			System.out.println("Error");
		}
	} 
	
	public float getTemp() {
		return temperature;
	} 
	
	public static void main(String[] args) {
		HeaterExercise heater = new HeaterExercise(15.0f, -10.0f, 92.0f);
		System.out.println(heater.getTemp());
		
		heater.warmer();
		System.out.println(heater.getTemp());
		
		heater.cooler();
		System.out.println(heater.getTemp());
	}
}
