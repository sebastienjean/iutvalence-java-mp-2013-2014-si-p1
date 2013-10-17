package fr.iutvalence.java.mp.RollingBall;

/**
 * extend of the class Ball which can be in move
 * 
 * @author andrejul
 *
 */
public class MovingBall extends Ball
{

    /**
     * speed vector of the MovingBall
     */
    private Vector speed;
    
    /**
     * MovingBall created with a radius, a center and a vector (the speed of the ball)
     * @param radiusOfTheBallWanted radius of the ball
     * @param centerOfTheBallWanted center of the ball
     * @param speedOfTheBall speed of the ball
     */
    public MovingBall(int radiusOfTheBallWanted, Point centerOfTheBallWanted, 
                                                            Vector speedOfTheBall)
    {
        super(radiusOfTheBallWanted, centerOfTheBallWanted);
        this.speed = speedOfTheBall;
    }
    
}