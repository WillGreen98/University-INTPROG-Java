package inClass;

/**
 * @author Will
 * In Class Week 15 - Examples
 */

public class CarClass {
	private String make;
	private String model;
	private String reg;
	private double engine;
	private String fuel;
	private float currentMileage;
	
	public CarClass(String cMake,String cModel, String cReg, double cEngine, String cFuel, float currentMileage) {
		make = cMake;
		model = cModel;
		reg = cReg;
		engine = cEngine;
		fuel = cFuel;
		currentMileage = 0f;
	}
	
	public void changeReg(String newReg) {
		reg = newReg;
	}
	
	public double mileageToNextSerive() {
		double milesLeft = 12000 - (currentMileage % 12000);
		
		return milesLeft;
	} 
	
}