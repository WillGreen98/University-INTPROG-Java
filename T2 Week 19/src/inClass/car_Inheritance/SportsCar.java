package inClass.car_Inheritance;

public class SportsCar extends Car
{
    private boolean turboEngine;
    private boolean sportsMode;
    private boolean roofOpen;

    public SportsCar(String cMake, String cModel, String cReg, double cEngine, String cFuel, String cSide, String cColour, boolean turbo)
    {
        super(cMake, cModel, cReg, cEngine, cFuel, cSide, cColour);
        turboEngine = turbo;
        sportsMode = false;
        roofOpen = false;
    }

    public void startSportsMode()
    {
        sportsMode = true;
    }
    
    public void stopSportsMode()
    {
        sportsMode = false;
    }
    
    public void openRoof()
    {
        roofOpen = true;
    }
    
    public void closeRoof()
    {
        roofOpen = false;
    }

    public void printInformation()
    {
        super.printInformation();
        
        if(turboEngine)
        {
            System.out.println("The car has a turbo engine");
        }
        else
        {
            System.out.println("The car does not have a turbo engine");
        }
        
        if(roofOpen)
        {
            System.out.println("The roof is open");
        }
        else
        {
            System.out.println("The roof is closed");
        }
        
        
        if(sportsMode)
        {
            System.out.println("Sports mode is on");
        }
        else
        {
            System.out.println("Sports mode is off");
        }
        }
    }

