package inClass.input;

/**
 * @author Will
 * In Class Week 17
 */

public class InputsForCar
{
    private KeyboardInput inputs;

    public InputsForCar()
    {
        inputs = new KeyboardInput();
    }

    public String enterMake()
    {
        System.out.print("Enter the car make: ");
        String make = inputs.getInputString();
        
        return make;
    }
    
    public String enterModel()
    {
        System.out.print("Enter the car model: ");
        String model = inputs.getInputString();
        
        return model;
    }
    
    public String enterRegistration()
    {
        System.out.print("Enter the car registration: ");
        String reg = inputs.getInputString();
        
        return reg;
    }
    
    public double enterEngineSize()
    {
        System.out.print("Enter the car engine size: ");
        double engine = inputs.getInputDouble();
        
        return engine;
    }
    
    public String enterFuel()
    {
        System.out.print("Enter the car fuel: ");
        String fuel = inputs.getInputString();
        
        return fuel;
    }
    
    public String enterDriverSide()
    {
        System.out.print("Enter the car driver side: ");
        String dSide = inputs.getInputString();
        
        return dSide;
    }
    
    public String enterColour()
    {
        System.out.print("Enter the car colour: ");
        String colour = inputs.getInputString();
        
        return colour;
    }
}
