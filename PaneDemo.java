// Name         : Caden Boldenow
// Creation Date: 8/29/2022
// Last Modified: 8/29/2022
// Description  : Introduction to the JOptionPane

// Look up Java [Version] api and it lists all classes and packages for syntax
// Then too get the syntax or object necessary do import [package] 
// In this case, the package imported to support class JOptionPane
// Order of package is object component, container, jcomponent, then package
// Scroll down on specific java api page in order to get specific syntax
// and specific functions examples and how to do them


import javax.swing.JOptionPane; 

// Importing the class font to change the font in JOptionPane
import java.awt.Font;

import javax.swing.UIManager;

public class PaneDemo {

	public static void main(String[] args) {
	
			// Java object creation is Object -> ClashType
			// in this case name -> your name = new -> dynamic location
			// Object(parameters) this is the constructor calling
			
			Font myFont = newFont("GOUDY STOUT", Font.PLAIN, 20);
			UIManager.put("OptionPane.messageFont", myFont);
			// Have to reference the class that we are calling showMessageDialog from
			// without JOptionPane it calls for it inside our file, which we did not create
			// nor have
			// This creates several seperate message boxes
			
			/* JOptionPane.showMessageDialog(null, "Here is my first window.");
			JOptionPane.showMessageDialog(null, "Leviathan.");
			JOptionPane.showMessageDialog(null, "Karthis.");
			JOptionPane.showMessageDialog(null, "Lord of the RINGS");
			*/
			
			// Create a single JOption Pane
			// Have to use escape sequences in order to make new lines
			// Have to reference the messageType plane.message aswell
			
			JOptionPane.showMessageDialog(null, "Here is my first window." +
			 "\nThis is my second line of text." +
			"\nLooks fairly simple, yes?", 
			"My First JOptionPane", JOptionPane.QUESTION_MESSAGE);
			
			
			
	
	}

}