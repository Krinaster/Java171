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

/* PROGRAM #3
LOTTO NUMBERS: 1-69 6#'s _ _ _ _ _ _ PowerBall # _
PowerBall# is 69/hourlywage cast as (int)(69/wage)
First number # (favorite month x 13) % 69 + 1
Second number # day of birth squared % 69 + 1 (Done using power function in math class)
Third number # (HS graduation or GED year / 2) % 69 + 1
Fourth Number # favorite phrase or movie title, take the length of the string and % 69 + 1 favMovie = "" then favMovie.length
Fifth number# Give an angle in degrees, and calculate |sinΘ| * 68 + 1 ( Math.als(Math.sin(radian value)) and convert to radians with math.pi
going to have to cast with (int)(calculation)
Sixth number# key on keyboard, and (take ascii value + 3/4 * 5) % 69 + 1
If statements are going to be used to make invalid numbers
Invalid 
month = DEFAULTMONTH
if month is outside month range, set month to a default value
do this for all that require forced number ranges
default day
year
wage 
month */
