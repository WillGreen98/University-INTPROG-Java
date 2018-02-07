package inClass.canvas;

/**
 * @author Will
 * In Class Week 17
 */

import java.awt.*;

public class Android {
    private Canvas win;

    public Android(Canvas window) {
        win = window;
    }

    public void drawAndroid() {
        win.setForegroundColor(Color.GREEN);
        
        // head
        win.fillSemiCircle(150, 50, 200, 200,false, true);
    
        // body
        win.fillRectangle(150, 155, 200, 195);
        
        // left arm
        win.fillRectangle(100, 225, 45, 75);
        win.fillSemiCircle(100, 200, 45, 50, false, true);
        
        // right arm
        win.fillRectangle(355, 225, 45, 75);
        win.fillSemiCircle(355, 200, 45, 50, false, true);
        
        // left leg
        win.fillRectangle(175, 355, 50, 95);
        
        // right leg
        win.fillRectangle(275, 355, 50, 95);
        
        // eyes
        win.setForegroundColor(Color.WHITE);
        win.fillCircle(200, 100, 25);
        win.fillCircle(300, 100, 25);
    }
    
    public static void main(String[] args) {
        Canvas androidCanvas = new Canvas("Android", 500, 500);
        
        Android android = new Android(androidCanvas);
        android.drawAndroid();
    }
}
