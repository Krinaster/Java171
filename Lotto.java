import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.util.Scanner;

public class Lotto {

	static final int DEFAULT_MONTH = 5;
	static final int DEFAULT_YEAR = 2005;
	static final int DEFAULT_DAY = 10;
	static final double DEFAULT_WAGE = 12.50;
	static final String DEFAULT_PHRASE = "Lord of the Rings is the best"; 

	public static void main(String [] args) {

	Scanner keyboard = new Scanner(System.in);
	int enteredMonth;
	
	System.out.println("Welcome to this random number generator for Lottery Tickets.");
	System.out.print("Please enter your favorite month: ");
	enteredMonth = keyboard.nextInt();
	System.out.print(enteredMonth);
	// Cool idea, have them type in month and convert to number to do calculations
	// Like not string length but month number
	
	
	// JTextField questionField = new JTextField(5);
	
	// JPanel questionPanel = new JPanel();
	
	// questionPanel.setLayout(new BoxLayOut(questoinPanel, BoxLayout.PAGE_AXIS));
	
	// questionPanel.add(new JLabel("Please enter the rquested values below"));
	
	// questionPanel.add(Box.createVerticalStrut(desiredvalue));
	
						// This is field created in JTextField
	// questionPanel.add(questionField);
	
	// To get input from panel, do whateverfield.getText()
	
	

	}
}