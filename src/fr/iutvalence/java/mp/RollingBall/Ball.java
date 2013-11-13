package fr.iutvalence.java.mp.RollingBall;

/**
 * 
 * a simple ball which will roll over the map
 * 
 * @author andrejul
 * 
 */
public class Ball
{
    /**
     * radius of the ball
     */
    private double radius;

    /**
     * center of the ball
     */
    private Point center;

    /**
     * ball created with two defined parameters : a radius and a center
     * 
     * @param ballRadius
     *            radius of the ball
     * @param ballCenter
     *            center of the ball
     */
    public Ball(double ballRadius, Point ballCenter)
    {
        this.radius = ballRadius;
        this.center = ballCenter;
    }

    /**
     * method to get the center of the ball
     * 
     * @return Point 
     *              the center of the ball
     */
    public Point getCenter()
    {
        return this.center;
    }

    /**
     * method to get the radius of the ball
     * 
     * @return Integer 
     *              radius of the ball
     */
    public double getRadius()
    {
        return this.radius;
    }

    /**
     * Returns an ASCII representation of the ball as : [ center of the ball, radius of the ball ]
     * @return String
     *              the ASCII representation of the ball
     */
    public String toString()
    {

        return "B[ "+this.center+", "+ this.radius+" ]";
    }
}
