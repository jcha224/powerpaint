/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;

import tool.Ellipse;
import tool.Line;
import tool.Pencil;
import tool.Rectangle;
import tool.Tool;
import view.PowerPaintGUI.ToolAction;

/**
 * This class creates a menu bar for powerpaint.
 * @author John Chang
 * @version 20 May 2016
 */
public class Menu extends JMenuBar {
    
    /** Number used in slider. */
    public static final int FIVE = 5;
    
    /** Icon width and height. */
    public static final int ICON = 12;
    
    /** Icon placement. */
    public static final int PLACE = 20;
    
    /** Auto generated serial version ID. */
    private static final long serialVersionUID = 2401343171737574518L;

    /** The UW purple color. */
    public static Color PURPLE = new Color(55, 0, 11);
    
    /** The UW gold color. */
    public static Color GOLD = new Color(232, 211, 162);
    
    /** The close menu item. */
    private final JMenuItem myClose = new JMenuItem("Close");
    
    /** 
     * The map of the Actions and tools. 
     */
    private final Map<Tool, ToolAction> myToolActions;
    
    /**
     * This constructor creates a menu bar.
     * @param theFrame the power paint window
     * @param theToolActions the list of actions and tools
     */
    public Menu(final PowerPaintGUI theFrame, final Map<Tool, ToolAction> theToolActions) {
        super();
        add(createFileMenu(theFrame));
        add(createOptionsMenu());
        add(createToolsMenu());
        add(createHelpMenu());
        myToolActions = theToolActions;
    }
    
    /**
     * Creates help menu.
     * @param theFrame the power paint window
     * @return the menu
     */
    private JMenu createFileMenu(final JFrame theFrame) {
        final JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        final JMenuItem quit = new JMenuItem("Quit");
        menu.add(myClose);
        menu.add(quit);
        quit.addActionListener(new ActionListener() {
                    
                @Override
                public void actionPerformed(final ActionEvent theEvent) {
                    theFrame.dispatchEvent(new WindowEvent(
                                     theFrame, WindowEvent.WINDOW_CLOSING));
                }
            });
        
        return menu;
    }
    
    /**
     * Creates tool menu.
     * @return the menu
     */
    private JMenu createToolsMenu() {
        final JMenu menu = new JMenu("Tools");
        menu.setMnemonic(KeyEvent.VK_T);
        final ButtonGroup group = new ButtonGroup();
        menu.add(createToolItems(new Pencil(), group));
        menu.add(createToolItems(new Line(), group));
        menu.add(createToolItems(new Rectangle(), group));
        menu.add(createToolItems(new Ellipse(), group));
        return menu;
    }
    
    /**
     * Helper method creates menu items.
     * @param theName the name of menu item
     * @param theGroup the group of radio button menu items
     * @return the menu item button
     */
    private JRadioButtonMenuItem createToolItems(final Tool theName, 
                                                 final ButtonGroup theGroup) {        
        final JRadioButtonMenuItem tool = new JRadioButtonMenuItem(theName.toString());
        theGroup.add(tool);
        return tool;
    }
    
    /**
     * Creates and returns the options menu.
     * @return the options menu
     */
    private JMenu createOptionsMenu() {
        final JMenu menu = new JMenu("Options");
        final ButtonGroup group = new ButtonGroup();
        menu.setMnemonic(KeyEvent.VK_O);
        final JCheckBoxMenuItem checkBox = new JCheckBoxMenuItem("Fill");
        menu.add(createSlider());
        menu.addSeparator();
        menu.add(createColorChooser("Draw Color...", group, KeyEvent.VK_D, PURPLE));
        menu.add(createColorChooser("Fill Color...", group, KeyEvent.VK_F, GOLD));
        menu.addSeparator();
        menu.add(checkBox);
        return menu;
    }

    /**
     * Creates and returns the slider menu.
     * @return the slider
     */
    private JMenu createSlider() {
        final JMenu subMenu = new JMenu("Thickness");
        subMenu.setMnemonic(KeyEvent.VK_T);
        final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 1);
        slider.setMajorTickSpacing(FIVE);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        subMenu.add(slider);
        return subMenu;
    }
    
    /**
     * Creates and returns the color chooser menu item.
     * @param theName the name of Slider
     * @param theGroup the button group
     * @param theKey the shortcut key
     * @param theColor the color
     * @return the color chooser menu
     */
    private JMenuItem createColorChooser(final String theName, final ButtonGroup theGroup, 
                                         final int theKey, final Color theColor) {
        final JMenuItem chooser = new JMenuItem(theName);
        chooser.setMnemonic(theKey);
        theGroup.add(chooser);
        final ActionListener listen = new MyColor(theGroup, chooser);
        chooser.addActionListener(listen);
        final Icon var = new Icon() {
            @Override
            public void paintIcon(final Component theC, final Graphics theG, 
                                  final int theX, final int theY) {
                theG.setColor(theColor);
                
                ((Graphics2D) theG).fill3DRect(PLACE, FIVE, ICON, ICON, true);
            }
            @Override
            public int getIconWidth() {
                return ICON;
            }
            @Override
            public int getIconHeight() {
                return ICON;
            }
        };
        chooser.setIcon(var);
        return chooser;
    }

    /**
     * Creates and returns the help menu.
     * @return the help menu
     */
    private JMenu createHelpMenu() {
        final JMenu menu = new JMenu("Help");
        menu.setMnemonic(KeyEvent.VK_H);
        final JMenuItem about = new JMenuItem("About...");
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                JOptionPane.showMessageDialog(null, "TCSS 305 PowerPaint" 
                                + "\n Spring 2016 \n John Chang", "About", 
                                JOptionPane.PLAIN_MESSAGE, 
                                new ImageIcon("C:\\Users\\John\\305\\username-powerpaint"
                                              + "\\images\\van-Gogh-icon.gif"));
            }
        });
        menu.add(about);
        return menu;
    }
    
    /**
     * Sets the status of close menu item.
     * @param theBool the status
     */
    public void closeActive(final boolean theBool) {
        myClose.setEnabled(theBool);
    }
    
    /**
     * Listens for color chooser actions.
     */
    private class MyColor implements ActionListener {
        /** Button group of color chooser. */
        private final ButtonGroup myGroup;
        
        /** The color chooser button. */
        private final JMenuItem myChooser;
        
        /**
         * Constructor for action listener.
         * @param theGroup the button group
         * @param theChooser the menu item
         */
        MyColor(final ButtonGroup theGroup, final JMenuItem theChooser) {
            myGroup = theGroup;
            myChooser = theChooser;
        }
        @Override
        public void actionPerformed(final ActionEvent theEvent) {
            final Color result = JColorChooser.showDialog(null, "Color Chooser", null);
            if (result != null) {
                myGroup.clearSelection();
              
                myChooser.setIcon(new Icon() {
                    @Override
                    public void paintIcon(final Component theC, final Graphics theG, 
                                          final int theX, final int theY) {
                        theG.setColor(result);
                        
                        ((Graphics2D) theG).fill3DRect(PLACE, FIVE, ICON, ICON, true);
                    }
                    @Override
                    public int getIconWidth() {
                        return ICON;
                    }
                    @Override
                    public int getIconHeight() {
                        return ICON;
                    }
                });
            }           
        }
        
    }
}
