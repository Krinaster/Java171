// Author		 : Caden Boldenow
// Date Created  : 9/31/22
// Last Modified : 10/6/22
// Description	 : Program collects user info to generate random loterry ticket

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
	
	
	System.out.println("Welcome to this random number generator " + 
	"for Lottery Tickets.");
	
	
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
	System.out.print("Please enter desired wage from your job or" +
	" current wage: ");
	enteredWage = keyboard.nextDouble();
	if(enteredWage < 0 )
		enteredWage = DEFAULT_WAGE;
	
	// used to eat leftover scanner data for next line to work
	keyboard.nextLine();
	// Favorite Phrase
	System.out.print("Please enter your favorite phrase or a " +
	"phrase you live by: ");
	enteredPhrase = keyboard.nextLine();
	if(enteredPhrase.length() < 1)
		enteredPhrase = DEFAULT_PHRASE;
	
	// Angle you like
	System.out.print("Please enter an angle (in degrees) you like: ");
	enteredAngle = keyboard.nextInt();
	
	// Key on keyboard
	System.out.print("Please enter a random key on the keyboard: ");
	enteredKey = keyboard.next().charAt(0);
	
	
	// Calculations for the inputted values, then printing lottery ticket
	// Redefined Wage, Phrase, and Key into int after gathering them as double
	// string, and char
	enteredMonth = ((enteredMonth * 198) % 70) + 1;
	enteredDay = (int)(Math.pow(enteredDay, 4) % 70 +1);
	int Wage = (int)(enteredWage * 100) % 70 + 1; 
	int Phrase =(int)((Math.pow(enteredPhrase.length(), 3) % 70) + 1);
	enteredAngle = (int)(Math.abs(Math.sin((enteredAngle * 180)/Math.PI)) * 69)
		+ 1;
	int Key = (int)enteredKey % 69 + 1;


	// If else statement checking if any values are equal and giving error 
	// if values are equal
	if(enteredMonth == enteredDay || enteredMonth == Wage || 
		enteredMonth == Phrase || enteredMonth == enteredAngle || 
		enteredMonth == Key || enteredDay == Wage || enteredDay == Phrase || 
		enteredDay == enteredAngle || enteredDay == Key || 
	    Wage == Phrase || Wage == enteredAngle || Wage == Key || 
		Phrase == enteredAngle || Phrase == Key || enteredAngle == Key)
			System.out.println("There was an error generating your lottery " + 
			"ticket. Please reenter the program");
	 
	 else{
		System.out.print("\nAnd your lottery ticket numbers is: "
		+ enteredMonth + "-" + enteredDay + "-" + Wage + "-" +
		Phrase + "-" + enteredAngle + " and the powerball is: " + Key);
	 }
	
	}
}

