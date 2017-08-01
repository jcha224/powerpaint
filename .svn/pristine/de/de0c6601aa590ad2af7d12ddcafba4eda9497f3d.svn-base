/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */
package tool;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 * A tool that draws rectangles.
 * @author John Chang
 * @version 20 May 2016
 */
public class Rectangle extends AbstractTool {

    @Override
    public Shape getShape() {
        final double x1 = getStartPoint().getX();
        final double y1 = getStartPoint().getY();
        final double x2 = getEndPoint().getX();
        final double y2 = getEndPoint().getY();
        return (Shape) new Rectangle2D.Double(
                              Math.min(x1, x2), 
                              Math.min(y1, y2), 
                              Math.abs(x1 - x2), 
                              Math.abs(y1 - y2));
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
