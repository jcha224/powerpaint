/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */
package tool;

import java.awt.Point;
import java.awt.Shape;

/**
 * This interface defines the behaviors the tools.
 * @author John Chang
 * @version 20 May 2016
 */
public interface Tool {

    /**
     * Returns the shape that should be drawn.
     * @return the shape of tool
     */
    Shape getShape();
    
    /**
     * Sets the initial point for this tool.
     * @param thePoint the start point
     */
    void setStartPoint(Point thePoint);
    
    /**
     * Sets the end point for this tool.
     * @param thePoint the end point
     */
    void setEndPoint(Point thePoint);
}
