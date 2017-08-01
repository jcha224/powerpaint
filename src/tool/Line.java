/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */
package tool;

import java.awt.Shape;
import java.awt.geom.Line2D;

/**
 * A tool that draws lines.
 * @author John Chang
 * @version 20 May 2016
 */
public class Line extends AbstractTool {

    @Override
    public Shape getShape() {
        return new Line2D.Double(getStartPoint(), getEndPoint());
    }
    
    @Override
    public String toString() {
        return "Line";
    }
}
