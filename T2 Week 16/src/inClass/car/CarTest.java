package inClass.car;

import inClass.car.*;

public class CarTest {
    public static void main(String[] args) {
        Mutator_Car car = new Mutator_Car("Honda", "Jazz", "AB12 CDE", 1.6f, "Petrol", "Left", "Purple");
        
        
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car registration: " + car.getRegistration());
        System.out.println("Car Lights on: " + car.getLightsOn());
        System.out.println("Current gear: " + car.getCurrentGear());
        System.out.println("Car colour: " + car.getColour());
        System.out.println("Car mileage: " + car.getCurrentMileage());
        
        System.out.println("Car registration before change: " + car.getRegistration());
        car.setRegistration("FG34 HIJ");
        System.out.println("Car registration after change: " + car.getRegistration());
        
        System.out.println("Car Lights on before change: " + car.getLightsOn());
        car.setLightsOn(true);
        System.out.println("Car Lights on after change: " + car.getLightsOn());
        
        System.out.println("Car colour before change: " + car.getColour());
        car.setColour("Red");
        System.out.println("Car colour after change: " + car.getColour());
        
        System.out.println("Current gear before change: " + car.getCurrentGear());
        car.setCurrentGear(3);
        System.out.println("Current gear after change to 3: " + car.getCurrentGear());
        car.setCurrentGear(5);
        System.out.println("Current gear after change to 5: " + car.getCurrentGear());
        car.setCurrentGear(0);
        System.out.println("Current gear after invalid change attempt (0): " + car.getCurrentGear());
        car.setCurrentGear(-1);
        System.out.println("Current gear after invalid change attempt (-1): " + car.getCurrentGear());
        car.setCurrentGear(10);
        System.out.println("Current gear after invalid change attempt (10): " + car.getCurrentGear());
    
        System.out.println("Car mileage before change: " + car.getCurrentMileage());
        car.setCurrentMileage(1000);
        System.out.println("Car mileage after change to 1000: " + car.getCurrentMileage());
        car.setCurrentMileage(1500);
        System.out.println("Car mileage after change to 1500: " + car.getCurrentMileage());
        car.setCurrentMileage(1000);
        System.out.println("Car mileage after invalid change attempt (1000): " + car.getCurrentMileage());
    }
}