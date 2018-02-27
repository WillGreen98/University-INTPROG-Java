package practical.android;

import java.awt.*;

public class Android {
    // instance variables - replace the example below with your own
    private Canvas win;

    /**
     * Constructor for objects of class Android
     */
    public Android(Canvas window) {
        win = window;
    }

    public void drawAndroid() {
        win.setForegroundColor(Color.GREEN);

        // head
        win.fillSemiCircle(30, 10, 40, 40, false, true);

        // body
        win.fillRectangle(30, 31, 40, 39);

        // left arm
        win.fillRectangle(20, 45, 9, 15);
        win.fillSemiCircle(20, 40, 9, 10, false, true);

        // right arm
        win.fillRectangle(71, 45, 9, 15);
        win.fillSemiCircle(71, 40, 9, 10, false, true);

        // left leg
        win.fillRectangle(35, 71, 10, 19);

        // right leg
        win.fillRectangle(55, 71, 10, 19);

        // eyes
        win.setForegroundColor(Color.GRAY);
        win.fillCircle(40, 20, 5);
        win.fillCircle(60, 20, 5);
    }

    public static void main(String[] args) {
        Canvas canvas = new Canvas("Android", 100, 100);

        Android android = new Android(canvas);
        android.drawAndroid();
    }
}
