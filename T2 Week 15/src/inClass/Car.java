
/**
 * A class to model a Car.
 * 
 * @author Claire Ancient 
 * @version 1.0
 */
public class Car
{
    // instance variables
    String make;
    String model;
    String registration;
    double engine;
    String fuel;
    String driverSide;
    double currentMileage;;
    int currentGear;
    boolean airConOn;
    boolean lightsOn;



    /**
     * Constructor for objects of class Car
     * 
     * @param cMake the make of the car
     * @param cModel the model of the car
     * @param cReg the car registration
     * @param cEngine the engine of the car
     * @param cFuel the fuel used by the car
     * @param cDriver the driver side of the car
     * 
     */
    public Car(String cMake, String cModel, String cReg, double cEngine, String cFuel, String cDriver)
    {
        // instance variables initialisation
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

    /**
     * A method to change the registration number
     * 
     * @param  newReg   the new registration number for the car 
     */
    public void changeRegistration(String newReg)
    {
        registration = newReg;
    }
    
    /**
     * A method to get the number of miles until the next service is due (assuming that there is a service every 12,000 miles)
     * 
     * @return the number of miles until the next service
     */
    public double milesToNextService()
    {
        double milesLeft = 12000 - (currentMileage % 12000);
        
        return milesLeft;
    }
    
    /**
     * A method to add mileage to the car through driving (this method will be changed when we have done for loops)
     * 
     * @param miles number of miles to be driven
     * @return mileage of the car after driving
     */
    public double drive(double miles)
    {
        currentMileage += miles;
        
        return currentMileage;
    }
}
