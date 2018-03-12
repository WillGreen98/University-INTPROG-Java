package practical.cat;

import java.awt.*;

public class Cat {
    private Canvas canvas;
    private Color fur;
    private String name;

    public Cat() {
        name = "Ginger";
        fur = Color.ORANGE;
        canvas = new Canvas(name, 500, 500);
    }

    public void drawCat() {
        // body
        canvas.setForegroundColor(fur);
        canvas.fillSemiCircle(125, 250, 250, 550, false, true);

        // legs
        canvas.setForegroundColor(Color.BLACK);
        canvas.drawLine(235, 350, 235, 500);
        canvas.drawLine(210, 350, 210, 500);
        canvas.drawLine(265, 350, 265, 500);
        canvas.drawLine(290, 350, 290, 500);

        drawEars();
        drawFace();

    }

    private void drawEars() {
        canvas.setForegroundColor(fur);
        canvas.fillTriangle(200, 75, 175, 150, 225, 150);
        canvas.fillTriangle(300, 75, 275, 150, 325, 150);

        canvas.setForegroundColor(Color.PINK);
        canvas.fillTriangle(200, 90, 185, 150, 215, 150);
        canvas.fillTriangle(300, 90, 285, 150, 315, 150);
    }

    private void drawFace() {
        // head
        canvas.setForegroundColor(fur);
        canvas.fillCircle(250, 200, 200);

        // nose
        canvas.setForegroundColor(Color.PINK);
        canvas.fillTriangle(235, 200, 265, 200, 250, 225);

        drawEyes();
        drawMouth();
        drawWhiskers();
    }

    private void drawEyes() {
        canvas.setForegroundColor(Color.WHITE);
        canvas.fillSemiCircle(185, 160, 50, 15, false, true);
        canvas.fillSemiCircle(185, 160, 50, 15, false, false);
        canvas.fillSemiCircle(260, 160, 50, 15, false, true);
        canvas.fillSemiCircle(260, 160, 50, 15, false, false);

        canvas.setForegroundColor(Color.CYAN);
        canvas.fillCircle(210, 167.5, 15);
        canvas.setForegroundColor(Color.BLACK);
        canvas.fillCircle(210, 167.5, 5);

        canvas.setForegroundColor(Color.CYAN);
        canvas.fillCircle(285, 167.5, 15);
        canvas.setForegroundColor(Color.BLACK);
        canvas.fillCircle(285, 167.5, 5);
    }

    private void drawMouth() {
        canvas.setForegroundColor(Color.BLACK);
        canvas.drawLine(250, 225, 250, 250);
        canvas.drawLine(225, 250, 275, 250);
        canvas.drawLine(225, 250, 205, 225);
        canvas.drawLine(275, 250, 295, 225);
    }

    private void drawWhiskers() {
        canvas.setForegroundColor(Color.BLACK);
        canvas.drawLine(237.5, 237.5, 100, 215);
        canvas.drawLine(237.5, 237.5, 100, 237.5);
        canvas.drawLine(237.5, 237.5, 100, 260);

        canvas.drawLine(262.5, 237.5, 400, 215);
        canvas.drawLine(262.5, 237.5, 400, 237.5);
        canvas.drawLine(262.5, 237.5, 400, 260);
    }

}