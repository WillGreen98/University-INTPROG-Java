package inClass.clockDemo;

/**
 * @author Will
 * In Class Week 16
 */

public class ClockDemo {
	// instance variables - replace the example below with your own
    private ClockDisplay digitalClock;

    public ClockDemo() {
        digitalClock = new ClockDisplay();
        System.out.println("The time is: " + digitalClock.getTime());
    }

    public void moveClock() {
        digitalClock.timeTick();
        System.out.println("The time is: " + digitalClock.getTime());
    }

    public void accelerateClock() {
        for(int i=0; i <=56; i++) {
            digitalClock.timeTick();
            System.out.println("The time is: " + digitalClock.getTime());
        }
    }
}
