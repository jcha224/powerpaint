/**
 * TCSS 305 - SPRING 2016
 * Assignment 5 - PowerPaint
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;


import tool.Ellipse;
import tool.Line;
import tool.Pencil;
import tool.Rectangle;
import tool.Tool;

/**
 * This class contains the implementation of the GUI.
 * @author John Chang
 * @version 5 May 2016
 */
public class PowerPaintGUI extends JFrame {

    /**
     * Default generated serial number.
     */
    private static final long serialVersionUID = -6870003831272220140L;

    /** 
     * The map of the Actions and tools. 
     */
    private final Map<Tool, ToolAction> myToolActions;
    
    /** The panel that will contain the drawing space. */
    private final DrawPanel myDrawPanel;
    
    /**
     * Instantiates the the GUI.
     */
    public PowerPaintGUI() {
        super("PowerPaint");
        myDrawPanel = new DrawPanel();  
        myToolActions = new HashMap<>();
    }

    /**
     * Called by main class to start the GUI implementation. 
     */
    public void start() {
        myToolActions.put(new Pencil(), new ToolAction(new Pencil()));
        myToolActions.put(new Line(), new ToolAction(new Line()));
        myToolActions.put(new Ellipse(), new ToolAction(new Ellipse()));
        myToolActions.put(new Rectangle(), new ToolAction(new Rectangle()));
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(
                        "C:\\Users\\John\\305\\username-powerpaint\\images\\" 
                                        + "van-Gogh-icon.gif").getImage());
//        myDrawPanel.setPreferredSize(new Dimension(WINDOW_SIZE, PANE_WIDTH));
//        myDrawPanel.setOpaque(true);
        add(myDrawPanel, BorderLayout.CENTER);
        
        
        setJMenuBar(new Menu(this, myToolActions));
        add(createToolBar(), BorderLayout.SOUTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pack();
    }
    
    /** 
     * Creates a tool bar for window.
     * @return JToolBar with toggle buttons
     */
    public JToolBar createToolBar() {
        final JToolBar toolBar = new JToolBar();
        final ButtonGroup buttonGroup = new ButtonGroup();
        
        JToggleButton button = new JToggleButton("Pencil");
        button.addActionListener(new ToolAction(new Pencil()));
        buttonGroup.add(button);
        toolBar.add(button);
        button = new JToggleButton("Line");
        button.addActionListener(new ToolAction(new Line()));
        buttonGroup.add(button);
        toolBar.add(button);
        button = new JToggleButton("Rectangle");
        button.addActionListener(new ToolAction(new Rectangle()));
        buttonGroup.add(button);
        toolBar.add(button);
        button = new JToggleButton("Ellipse");
        button.addActionListener(new ToolAction(new Ellipse()));
        buttonGroup.add(button);
        toolBar.add(button);
        return toolBar;
    } 
    
    /**
     * Action listener for tools.
     * @author John Chang
     */
    class ToolAction extends AbstractAction {

        /**  
         * A generated serial version UID for object Serialization.
         */
        private static final long serialVersionUID = 1039806949202634879L;
        
        /** The tool for this action. */
        private final Tool myTool;

        /**
         * Initializes the Actions Fields.
         * @param theTool this Actions tool 
         */
        ToolAction(final Tool theTool) {
            super(theTool.toString());
            myTool = theTool;
            putValue(SHORT_DESCRIPTION, myTool.toString());
            
            putValue(SELECTED_KEY, true);

        }

        @Override
        public void actionPerformed(final ActionEvent theEvent) {
            myDrawPanel.setTool(myTool);
        }

    }
}

