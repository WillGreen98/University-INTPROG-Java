package inClass.car_Inheritance;

/**
 * @author Will
 * In Class Week 19
 */

public class Car {
    /** instance variables */
    private String make;
    private String model;
    private String reg;
    private double engine;
    private String fuel;
    private double currentMileage;
    private String driverSide;
    private int currentGear;
    private boolean airConOn;
    private boolean lightsOn;
    private String colour;

    public Car(String cMake, String cModel, String cReg, double cEngine, String cFuel, String cSide, String cColour) {
        make = cMake;
        model = cModel;
        reg = cReg;
        engine = cEngine;
        fuel = cFuel;
        currentMileage = 0;
        driverSide = cSide;
        currentGear = 1;
        airConOn = true;
        lightsOn = false;
        colour = cColour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getRegistration() {
        return reg;
    }

    public void setRegistration(String newReg) {
        reg = newReg;
    }

    public boolean getLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean newLightsOn) {
        lightsOn = newLightsOn;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int newGear) {
        if (newGear <= 0) {
            System.out.println("Gear cannot be less than 1");
        } else if (newGear > 5) {
            System.out.println("Gear cannot be more than 5");
        } else {
            currentGear = newGear;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String newColour) {
        colour = newColour;
    }

    public double getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(double newMileage) {
        if (newMileage < currentMileage) {
            System.out.println("Mileage cannot go backwards");
        } else {
            currentMileage = newMileage;
        }
    }

    public void printInformation() {
        String printString = "Car Information";
        printString += "\nMake: " + make;
        printString += "\nModel: " + model;
        printString += "\nRegistration: " + reg;
        printString += "\nEngine Size: " + engine;
        printString += "\nFuel: " + fuel;
        printString += "\nCurrent Mileage: " + currentMileage;
        printString += "\nDrivers Side: " + driverSide;
        printString += "\nColour: " + colour;

        System.out.println(printString);
    }

    public static void main(String[] args) {
        Dealership dealership = new Dealership();

        dealership.addCar(new Car("Honda", "Civic", "AB12 CDE", 1.6, "Petrol", "Left", "Red"));
        dealership.addCar(new Car("Honda", "Jazz", "FG34 HIJ", 1.4, "Diesel", "Right", "Silver"));
        dealership.addCar(new SportsCar("Mazda", "MX5", "KL56 MNO", 2.0, "Petrol", "Left", "Blue", true));

        dealership.printAllCars();

    }
}