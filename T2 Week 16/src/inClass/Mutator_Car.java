package inClass;

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

    public Mutator_Car(String cMake, String cModel, String cReg, float cEngine, String cFuel, String cDriver) {
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
    }
    
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
    
    public int getCurrentGear() {
		return currentGear;
    } 
    
    public float getCurrentMileage() {
    		return currentMileage;
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