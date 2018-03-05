package inClass.planets_Enum;

/**
 * @author Will
 * In Class Week 20
 * 
 * Enum class adapted from: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */

public class PlanetsMain {
    public static void main(String args[]) {
        double earthWeight = 175;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for(Planet p : Planet.values()) {
            System.out.println("Your weight on " + p + " is " + p.surfaceWeight(mass));
        }
    }
}
