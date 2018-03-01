package practical.ball_inheritance;

import java.awt.*;

public class Ball {
    protected double currentX, currentY;
    private double xSpeed, ySpeed;
    protected double diameter;
    protected Color colour;
    protected Canvas win;


    public Ball(double ballDiameter, Color ballColour, double xVel, double yVel, Canvas canvas, double startX, double startY) {
        diameter = ballDiameter;
        colour = ballColour;
        win = canvas;
        currentX = startX;
        currentY = startY;
        xSpeed = xVel;
        ySpeed = yVel;
    }

    public double calculateVolume() {
        double radius = diameter / 2;
        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);

        return volume;
    }

    public void printInformation() {
        System.out.println("Ball Information");
        System.out.println("Primary colour: " + colour.toString());
    }

    public void drawBall() {
        win.setForegroundColor(colour);
        win.fillCircle(currentX, currentY, diameter);
    }

    public void eraseBall() {
        win.eraseCircle(currentX, currentY, diameter);
    }

    public void moveBall(char direction) {
        if (direction == 'h') {
            currentX += xSpeed;
        } else if (direction == 'v') {
            currentY += ySpeed;
        } else {
            currentX += xSpeed;
            currentY += ySpeed;
        }


    }

}