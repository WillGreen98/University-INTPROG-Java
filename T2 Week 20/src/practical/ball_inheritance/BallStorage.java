package practical.ball_inheritance;

import java.awt.Color;
import java.util.*;

public class BallStorage {
    private ArrayList < Ball > ballCollection;
    private Canvas win;

    public BallStorage(Canvas canvas) {
        ballCollection = new ArrayList < Ball > ();
        win = canvas;
    }

    public void addBall(Ball newBall) {
        ballCollection.add(newBall);
        newBall.drawBall();
    }

    public void moveAllBalls() {
        Random random = new Random();
        int randomNum;
        char direction;

        win.wait(50);

        for (Ball ball: ballCollection) {
            win.setForegroundColor(Color.WHITE); // reset colour before moving or end up with a ghost
            randomNum = random.nextInt(3);

            if (randomNum == 0) {
                direction = 'h';
            } else if (randomNum == 1) {
                direction = 'v';
            } else {
                direction = 'd';
            }

            win.wait(50);
            ball.moveBall(direction);
        }
    }

    public void printAllInformation() {
        for (Ball ball: ballCollection) {
            ball.printInformation();
            System.out.println();
        }
    }

}