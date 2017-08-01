/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */
package tool;

import java.awt.Point;

/**
 * This abstract class is the basic implementation of tool.
 * @author John Chang
 * @version 20 May 2016
 */
public abstract class AbstractTool implements Tool {

    /** A point beyond the drawing panel. */
    public static final Point NULL_POINT = new Point(-50, -50);
    
    /** The starting point for tool. */
    private Point myStartPoint;
    
    /** The ending point for tool. */
    private Point myEndPoint;
    
    /**
     * This is the constructor for tool.
     */
    public AbstractTool() {
        myStartPoint = NULL_POINT;
        myEndPoint = NULL_POINT;
    }

    @Override
    public void setStartPoint(final Point thePoint) {
        myStartPoint = thePoint;
        myEndPoint = thePoint;
    }

    @Override
    public void setEndPoint(final Point thePoint) {
        myEndPoint = thePoint;
    }
    
    /**
     * Returns start point for this tool.
     * @return the starting point
     */
    protected Point getStartPoint() {
        return myStartPoint;
    }
    
    /**
     * Returns the end point for this tool.
     * @return the ending point
     */
    protected Point getEndPoint() {
        return myEndPoint;
    }

}
