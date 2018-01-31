package inClass.car;

/**
 * @author Will
 * In Class Week 15
 */

public class Car {
    String make;
    String model;
    String registration;
    double engine;
    String fuel;
    String driverSide;
    double currentMileage;
    int currentGear;
    boolean airConOn;
    boolean lightsOn;

    public Car(String cMake, String cModel, String cReg, double cEngine, String cFuel, String cDriver) {
        make = cMake;
        model = cModel;
        registration = cReg;
        engine = cEngine;
        fuel = cFuel;
        driverSide = cDriver;
        currentMileage = 0.0;
        currentGear = 1;
        airConOn = true;
        lightsOn = false;
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
