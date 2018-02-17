package inClass.car_mutator;

/**
 * @author Will
 * In Class Week 16
 */

public class Mutator_Car {
    String make;
    String model;
    String registration;
    float engine;
    String fuel;
    String driverSide;
    float currentMileage;;
    int currentGear;
    boolean airConOn;
    boolean lightsOn;
    String colour;

    public Mutator_Car(String cMake, String cModel, String cReg, float cEngine, String cFuel, String cDriver, String cColour) {
        make = cMake;
        model = cModel;
        registration = cReg;
        engine = cEngine;
        fuel = cFuel;
        driverSide = cDriver;
        currentMileage = 0.0f;
        currentGear = 1;
        airConOn = true;
        lightsOn = false;
        colour = cColour;
    }
    
    // Getter Methods    
    public String getMake() {
    		return make;
    } 
    
    public String getModel() {
		return model;
    }
    
    public String getReg() {
		return registration;
    } 
    
    public boolean getLight_Stat() {
		return lightsOn;
    } 
    
    public String getColour() {
    		return colour;
    } 
    
    public int getCurrentGear() {
		return currentGear;
    } 
    
    public float getCurrentMileage() {
    		return currentMileage;
    } 
    
    // Setter Methods
    public void setReg(String newReg) {
    		registration = newReg;
    } 
    
    public void setColour(String newColour) {
    		colour = newColour;
    } 
    
    public void setLights(boolean setLights) {
    		lightsOn = setLights;
    }
    
    public void setCurrentMileage(float newMiles) {
    		currentMileage = newMiles;
    		if(newMiles < currentGear) {
    			// Matilda Joke
    			System.out.println("Milage cannot go backwards... Unless your name is: Harry Wormwood");
		} else {
			currentMileage = newMiles;
		}
    } 
    
    public void setGear(int gear) {
	    	if(gear <= 0) {
	    		System.out.println("Gear cannot be less than 1");
	    	} else if (gear > 5) {
	    		System.out.println("Gear cannot be more than 5");
	    } else {
	    		currentGear = gear;
	    }
    } 

    public void changeRegistration(String newReg) {
        registration = newReg;
    }
    
    public double milesToNextService() {
        double milesLeft = 12000 - (currentMileage % 12000);
        
        return milesLeft;
    }

    public double drive(double miles) {
        currentMileage += miles;
        
        return currentMileage;
    }
}