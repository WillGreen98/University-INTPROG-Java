package inClass.car_Inheritance;

public class CarTesting
{
    public static void main(String[] args)
    {
        Dealership dealership = new Dealership();
        
        dealership.addCar(new Car("Honda", "Civic", "AB12 CDE", 1.6, "Petrol", "Left", "Red"));
        dealership.addCar(new Car("Honda", "Jazz", "FG34 HIJ", 1.4, "Diesel", "Right", "Silver"));
        dealership.addCar(new SportsCar("Mazda", "MX5", "KL56 MNO", 2.0, "Petrol", "Left", "Blue", true));
             
        dealership.printAllCars();
        
    }
}
