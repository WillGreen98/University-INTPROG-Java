package inClass.car_Inheritance;

/**
 * @author Will
 * In Class Week 19
 */

import java.util.*;

public class Dealership {
    private ArrayList<Car> carSelection;

    public Dealership() {
        carSelection = new ArrayList<Car>();
    }

    public void addCar(Car newCar) {
        carSelection.add(newCar);
    }

    public void removeCar(int index) {
        carSelection.remove(index);
    }

    public Car getCar(int index) {
        return carSelection.get(index);
    }

    public void printAllCars() {
        for (Car car : carSelection) {
            car.printInformation();
        }
    }

    public void printCarsByColour(String colourToFind) {
        String currentColour;
        int count = 0;

        for (Car car : carSelection) {
            currentColour = car.getColour();

            if (currentColour.equals(colourToFind)) {
                car.printInformation();
                count++;
            }

        }

        if (count == 0) {
            System.out.println("There is no cars which are " + colourToFind);
        }
    }

    public void findCarByRegistration(String regToFind) {
        boolean found = false;
        int index = 0;

        Car currentCar;
        String currentReg;

        while (index < carSelection.size() && !found) {
            currentCar = carSelection.get(index);
            currentReg = currentCar.getRegistration();

            if (currentReg.equals(regToFind)) {
                currentCar.printInformation();
                found = true;
            }

            index++;
        }

        if (!found) {
            System.out.println("Car with registration " + regToFind + " not found");
        }
    }

    public void removeCarByRegistration(String regToFind) {
        boolean found = false;
        Iterator<Car> it = carSelection.iterator();
        Car currentCar;
        String currentReg;

        while (it.hasNext()) {
            currentCar = it.next();
            currentReg = currentCar.getRegistration();

            if (currentReg.equals(regToFind)) {
                it.remove();
                System.out.println("The car has been removed");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Car not found");
        }
    }
}
