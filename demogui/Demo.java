
package demogui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Demo { //********ATTRIBUTES/REFERENCE VARS **********
    
    private JFrame window; // stores memory pointer to window
    private JPanel panelA, panelB, panelC, panelD, panelE; // Will add more
    private JButton buttonA, buttonB, buttonC, buttonD;
    private JLabel labelA; // Will add more
    private JMenuBar menuBar;
    private JMenu menuOp, menuPlay; // declare 2 menus - "Options", "Players"
    private JMenuItem[] mOpItem; // Drop down list of choices for "Optoins"
    private JMenuItem[] mPlayItem; // Drop down list of choices for "Players"
    private static final String ABOUT = "DemoGUI written by me, the programmer";
    
    // Default Constructor ***************** CONSTRUCTORS *************
    public Demo(){
        window = new JFrame("Graphics Design"); // Add txt now or later
        panelA = new JPanel(); // Construct a penl before adding components
        panelB = new JPanel();
        panelC = new JPanel();
        panelD = new JPanel();
        panelE = new JPanel();
        buttonA = new JButton("I WILL FORCE THIS PROGRAM TO BE BIGGER"); // OPtional text- edit later
        buttonB = new JButton(); // will add text later
        buttonC = new JButton();
        buttonD = new JButton();
        labelA = new JLabel("Graphics designer");
        
        // Setting up menu bar for program
        menuBar = new JMenuBar();
        menuOp = new JMenu("OPTIONS"); // text to appear on menu bar
        mOpItem = new JMenuItem[4]; // 4 choices in drop down
        mOpItem[0] = new JMenuItem("Print");
        mOpItem[1] = new JMenuItem("Save");
        mOpItem[2] = new JMenuItem("Delete");
        mOpItem[3] = new JMenuItem("About..."); // click about to trigger event
        
        // Careful unusual coding and indetation
        mOpItem[3].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(window, ABOUT, "SWIC 171", JOptionPane.PLAIN_MESSAGE);
            } // end public void
        } // end add.ActionListener
        ); // close (new ActionListener)
        
        menuPlay = new JMenu("Players"); // text toa ppear on menu bar
        mPlayItem = new JMenuItem[3]; // 3 choices in drop down
        mPlayItem[0] = new JMenuItem("vs computer");
        mPlayItem[1] = new JMenuItem("2 players");
        mPlayItem[2] = new JMenuItem("2 teams");
        
        // Add components and separator to the menu "OPTIONS"
        // Separator is a line for ease of readability on the human
        menuOp.add(mOpItem[0]);
        menuOp.add(mOpItem[1]);
        menuOp.add(mOpItem[2]);
        menuOp.addSeparator();// adds visual separator - 3above, 1 below
        menuOp.add(mOpItem[3]);
        // Can do this part with a loop if not wanting to have separator
        
        //Add components to the meny "Players"
        menuPlay.add(mPlayItem[0]);
        menuPlay.add(mPlayItem[1]);
        menuPlay.add(mPlayItem[2]);
        
        // Add both menus to the menuBar
        menuBar.add(menuOp);
        menuBar.add(menuPlay);
        
        // Add objects to panel
        //panelA.add(buttonA);
        //panelA.add(buttonB);
        //panelA.add(buttonC);
        //panelA.add(labelA);
        
        // Add panel to window
        window.add(panelA);
        
        
        init(); // Call initialize method
    }
    
    
    // Method - initialize all GUI Objects  *************** INIT() **********
    private void init(){
        // Set JFrame window properties
        window.setSize(1200,800); // size in terms of pixels
        window.setLocationRelativeTo(null); // center window
        // window.setLocation(200,300); // set window with coordinates
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // other options
        window.setLayout(new BorderLayout()); // Overrides default layout
        panelA.setBackground(Color.MAGENTA);
        panelB.setBackground(Color.BLACK);
        panelC.setBackground(Color.BLUE);
        panelD.setBackground(Color.RED);
        panelE.setBackground(Color.YELLOW);
        
        // Adding panels to window
        window.add(panelA,BorderLayout.NORTH);
        window.add(panelB,BorderLayout.WEST);
        window.add(panelC,BorderLayout.EAST);
        window.add(panelD,BorderLayout.SOUTH);
        window.add(panelE,BorderLayout.CENTER);
        
        // adding the button objects to the panels
        panelB.add(buttonA);
        panelD.add(buttonB);
        panelE.add(labelA);
        panelA.add(buttonC);
        panelC.add(buttonD);
        // set edit jbutton properties
        buttonA.setText("banana"); // edit existing text
        buttonA.setFont(new Font("Comic Sans",Font.ITALIC,30));
        buttonB.setText("Graphics Design is my passion");
        buttonB.setBackground(Color.CYAN);
        buttonB.setForeground(Color.WHITE);
        buttonB.setFont(new Font("Comic Sans", Font.PLAIN, 40));
        buttonC.setText("Graphics design is the best");
        buttonC.setBackground(Color.RED);
        buttonD.setText("orange you glad");
        buttonD.setBackground(Color.PINK);
        
        // Add the menu bar to the window
        window.setJMenuBar(menuBar);
        
        window.setVisible(true); // Turn window on 
    }

}
