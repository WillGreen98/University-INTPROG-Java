package inClass.overloading;

public class Overloading {
    /** type signature: example() */
    public void example() {
        int a = 6;
        int b = 8;
        System.out.println("Method 1: " + (a + b));
    }

    /** type signature: example(String, int, int) */
    public void example(int a, int b) {
        System.out.println("Method 2: " + (a + b));
    }

    /** type: signature: example(int) */
    public void example(int a) {
        int b = 23;
        System.out.println("Method 3: " + (a + b));
    }

    /** type: signature: example(double) */
    public void example(double a) {
        double b = 12.3;
        System.out.println("Method 4: " + (a + b));
    }
}
