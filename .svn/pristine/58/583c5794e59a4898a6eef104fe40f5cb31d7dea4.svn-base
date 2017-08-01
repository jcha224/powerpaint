/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */

package view;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Runs PowerPaint by starting the PowerPaintGUI.
 * 
 * @author John Chang
 * @version 5 May 2016
 */
public final class PowerPaintMain {

    /**
     * The constructor of this class. 
     */
    private PowerPaintMain() {
        throw new IllegalStateException();
    }

    /**
     * The Main method calls and starts the PowerPain GUI.
     * 
     * @param theArgs command line argument
     */
    public static void main(final String[] theArgs) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (final UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (final IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (final InstantiationException ex) {
            ex.printStackTrace();
        } catch (final ClassNotFoundException ex) {
            ex.printStackTrace();
        }
      /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
      
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PowerPaintGUI().start();
            }
        });
    }
    
}

