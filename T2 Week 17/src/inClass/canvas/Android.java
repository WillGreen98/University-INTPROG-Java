package inClass.canvas;

/**
 * @author Will
 * In Class Week 17
 */

import java.awt.*;
import inClass.canvas.Canvas;

public class Android {
    private Canvas window;

    public Android(Canvas window) {
        this.window = window;
    }

    public void drawAndroid() {
        window.setForegroundColor(Color.GREEN);
        
        // head
        window.fillSemiCircle(150, 50, 200, 200,false, true);
    
        // body
        window.fillRectangle(150, 155, 200, 195);
        
        // left arm
        window.fillRectangle(100, 225, 45, 75);
        window.fillSemiCircle(100, 200, 45, 50, false, true);
        
        // right arm
        window.fillRectangle(355, 225, 45, 75);
        window.fillSemiCircle(355, 200, 45, 50, false, true);
        
        // left leg
        window.fillRectangle(175, 355, 50, 95);
        
        // right leg
        window.fillRectangle(275, 355, 50, 95);
        
        // eyes
        window.setForegroundColor(Color.WHITE);
        window.fillCircle(200, 100, 25);
        window.fillCircle(300, 100, 25);
    }
    
    public static void main(String[] args) {
        Canvas androidCanvas = new Canvas("Android", 500, 500);
        
        Android android = new Android(androidCanvas);
        android.drawAndroid();
    }
}
