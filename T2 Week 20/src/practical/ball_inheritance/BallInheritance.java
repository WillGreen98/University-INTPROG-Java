package practical.ball_inheritance;

import java.awt.*;

public class BallInheritance 
{  

    public static void main(String[] args) 
    {
        Canvas canvas = new Canvas("Ball Inheritance", 500, 500);
        BallStorage ballStorage = new BallStorage(canvas);
        
        //ballStorage.addBall(new Football(100, 100, 5, 5, canvas, Color.PINK, Color.BLACK));
        //ballStorage.addBall(new RugbyBall(150, 200, 3, 4, canvas, Color.ORANGE));
        
        for (int i = 0; i < 50; i++)
        {
            ballStorage.moveAllBalls();
        }
        
        ballStorage.printAllInformation();
        
    }
    
}
