package inClass.loops;

/**
 * @author Will
 * In Class Week 18
 */

public class LoopsClass {
    public void forLoopExample() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i is: " + i);
        }
    }

    public void whileLoopExample() {
        int i = 0;

        while (i <= 10) {
            System.out.println("i is: " + i);
            i++;
        }
    }

    public void doWhileLoopExample1() {
        int i = 0;

        do {
            System.out.println("i is: " + i);
            i++;
        } while (i <= 10);
    }

    public void doWhileLoopExample2() {
        KeyboardInput keyboardInput = new KeyboardInput();
        boolean validEntry = false;
        int numberEntered;

        do {
            System.out.print("Enter a number between 0 and 10 (inclusive): ");
            numberEntered = keyboardInput.getInputInteger();

            if (numberEntered < 0 || numberEntered > 10) {
                System.out.println("Sorry, that isn't valid.  Try Again!");
            } else {
                validEntry = true;
            }

        } while (!validEntry);

        System.out.println("You entered: " + numberEntered);
    }

    public void forLoopExercise() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x 6 is: " + i * 6);
        }
    }

    public void whileLoopExercise() {
        int i = 1;

        while (i <= 20) {
            System.out.println(i + " x 8 is: " + i * 8);
            i++;
        }
    }

    public void doWhileLoopExercise() {
        int i = 1;

        do {
            System.out.println(i + " x 12 is: " + i * 12);
            i++;
        } while (i <= 40);

    }

}
