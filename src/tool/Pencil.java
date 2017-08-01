/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */
package tool;

import java.awt.Shape;
import java.awt.geom.Path2D;

/**
 * A tool that draws freely.
 * @author John Chang
 * @version 20 May 2016
 */
public class Pencil extends AbstractTool {
    @Override
    public Shape getShape() {
        final Path2D line = new Path2D.Double();
        Shape shape = line;
        line.moveTo(getStartPoint().getX(), getStartPoint().getY());
        line.lineTo(getEndPoint().getX(), getEndPoint().getY());
        shape = line;
        setStartPoint(getEndPoint());
        return shape;
    }
    
    @Override
    public String toString() {
        return "Pencil";
    }

}
