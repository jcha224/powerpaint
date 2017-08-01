/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

import tool.Pencil;
import tool.Tool;

/**
 * This class creates the area that will be drawn on.
 * @author John Chang
 * @version 20 May 2016
 */
public class DrawPanel extends JPanel {

    /** A generated serial version ID. */
    private static final long serialVersionUID = 26364429754226518L;

    /** The size of this panel. */
    private static final Dimension PANEL_SIZE = new Dimension(600, 300);
    
    /** The tool currently being used. */
    private Tool myTool;
    
    /** A list of already drawn images. */
    private final List<Shape> myImages;
    
    /**
     * This constructor instantiates the fields.
     */
    public DrawPanel() {
        super();
        myImages = new ArrayList<>();
        start();
        myTool = new Pencil();
    }
    
    /**
     * Initializes the drawing panel.
     */
    private void start() {
        setPreferredSize(PANEL_SIZE);
        setBackground(Color.WHITE);
        
        final MouseInputAdapter mouse = new MouseEvents();
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }
    
    /**
     * Initializes the current tool.
     * @param theTool the current tool
     */
    public void setTool(final Tool theTool) {
        myTool = theTool;
    }
    
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D graphics = (Graphics2D) theGraphics;
        for (final Shape shape : myImages) {
            graphics.draw(shape);
        }
        graphics.draw(myTool.getShape());
    }
    
    /**
     * Inner class listens for mouse events.
     */
    public class MouseEvents extends MouseInputAdapter {
        
        @Override
        public void mousePressed(final MouseEvent theEvent) {
            myTool.setStartPoint(theEvent.getPoint());
            repaint();
        }
        
        @Override
        public void mouseDragged(final MouseEvent theEvent) {
            myTool.setEndPoint(theEvent.getPoint());
            repaint();
        }
        
        @Override
        public void mouseReleased(final MouseEvent theEvent) {
            myImages.add(myTool.getShape());
        }
    }
}