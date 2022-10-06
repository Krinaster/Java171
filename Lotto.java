
import java.util.Scanner;

public class Lotto {

	// Constant Variable defining
	static final int DEFAULT_MONTH = 5;
	static final double DEFAULT_WAGE = 12.50;
	static final int DEFAULT_DAY = 10;
	static final char DEFAULT_KEY = 'm';
	static final String DEFAULT_PHRASE = "Lord of the Rings is the best"; 

	public static void main(String [] args) {

	// Variable defining
	Scanner keyboard = new Scanner(System.in);
	int enteredMonth, enteredDay, enteredAngle;
	double enteredWage;
	String enteredPhrase;
	char enteredKey;
	
	
	System.out.println("Welcome to this random number generator for Lottery Tickets.");
	
	
	// Month calculations for Number 1 in Lottery Ticket
	System.out.print("Please enter your favorite month (1-12): ");
	enteredMonth = keyboard.nextInt();
	if(enteredMonth < 1 || enteredMonth > 12)
		enteredMonth = DEFAULT_MONTH;
	
	// Day of Birth
	System.out.print("Please enter the day your were born: ");
	enteredDay = keyboard.nextInt();
	if(enteredDay < 1|| enteredDay > 31)
		enteredDay = DEFAULT_DAY;
	
	// Wage
	System.out.print("Please enter desired wage from your job or current wage: ");
	enteredWage = keyboard.nextDouble();
	if(enteredWage < 0 )
		enteredWage = DEFAULT_WAGE;
	
	// used to eat leftover scanner data for next line to work
	keyboard.nextLine();
	// Favorite Phrase
	System.out.print("Please enter your favorite phrase or a phrase you live by: ");
	enteredPhrase = keyboard.nextLine();
	// Need to default phrase for when phrase is wrong
	
	// Angle you like
	System.out.print("Please enter an angle (in degrees) you like: ");
	enteredAngle = keyboard.nextInt();
	
	// Key on keyboard
	System.out.print("Please enter a random key on the keyboard: ");
	enteredKey = keyboard.next().charAt(0);
	
	
	// Calculations for the inputted values, then printing lottery ticket
	enteredMonth = ((enteredMonth * 198) % 70) + 1;
	enteredDay = (int)(Math.pow(enteredDay, 4) % 70 +1);
	int Wage = (int)(enteredWage * 100) % 70 + 1;
	int Phrase =(int)((Math.pow(enteredPhrase.length(), 3) % 70) + 1);
	enteredAngle = (int)(Math.abs(Math.sin((enteredAngle * 180)/Math.PI)) * 69) + 1;
	int Key = (int)enteredKey % 69 + 1;


	// If else statement checking if any values are equal and giving error 
	// if values are equal
	if(enteredMonth == enteredDay || enteredMonth == Wage || enteredMonth == Phrase || enteredMonth == enteredAngle || enteredMonth == Key ||
	 enteredDay == Wage || enteredDay == Phrase || enteredDay == enteredAngle || enteredDay == Key || 
	  Wage == Phrase || Wage == enteredAngle || Wage == Key || Phrase == enteredAngle || Phrase == Key || enteredAngle == Key)
	  System.out.println("There was an error generating your lottery ticket. Please reenter the program");
	 
	 else{
		System.out.print("\nAnd your lottery ticket numbers is: "
		+ enteredMonth + "-" + enteredDay + "-" + Wage + "-" +
		Phrase + "-" + enteredAngle + " and the powerball is: " + Key);
	 }
	// Cleanup code and take out all system.out.print that show values of variable
	// Finish documenting code
	// Do extra credit that just checks that none of the values are the saem
	// Make sure everything has a default value to go to 
	// and remove imports that are not needed
	
	
	
	

	}
}


// JTextField questionField = new JTextField(5);
	
	// JPanel questionPanel = new JPanel();
	
	// questionPanel.setLayout(new BoxLayOut(questoinPanel, BoxLayout.PAGE_AXIS));
	
	// questionPanel.add(new JLabel("Please enter the rquested values below"));
	
	// questionPanel.add(Box.createVerticalStrut(desiredvalue));
	
						// This is field created in JTextField
	// questionPanel.add(questionField);
	
	// To get input from panel, do whateverfield.getText()
	
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
