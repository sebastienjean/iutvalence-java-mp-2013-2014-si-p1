package fr.iutvalence.java.mp.RollingBall;

/**
 * initialization of the game
 * 
 * @author andrejul
 *
 */
public class PlayerFixed
{
    // TODO (FIXED) this method should not be static
    /**
     * method to initialize the game
     * 
     * @param segmentWhereTheBallCanBeReleased 
     *                  the segment where the ball can be released to start the play
     * @return MovingBall
     *                  the game initialized
     */
    // TODO (FIXED) this method should only contain code related to the initial
    // action of the player (it should return a position)
    public Point initialize(Segment segmentWhereTheBallCanBeReleased)
    {
        Point center = segmentWhereTheBallCanBeReleased.getStartingPoint();

        return center;
    }
}
