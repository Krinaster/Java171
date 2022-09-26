//Nesting: one control structure inside another

import java.util.Scanner;

public class LeapYear { 

	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int year = 0;
		String isIsNot; 
		
		// Prompt and determine if year entered is leap year.
		System.out.print("Enter a year: ");
		year = keyboard.nextInt();
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 ==0) 
					isIsNot = " is ";
				else
					isIsNot = " is not ";
			}
			else 
				isIsNot = " is ";
		}
		else 
			isIsNot = " is not ";
			
		System.out.println(year + isIsNot + "a leap year.");
			
		// An alternative
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			isIsNot = " is ";
		else
			isIsNot = " is not ";
		System.out.println(year + isIsNot + "a leap year.");


	}
}