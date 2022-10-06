import java.util.Scanner;

public class WhileDemo {
	
	public static void main(String [] args) {
		
		int value = 0;
		Scanner keyboard = new Scanner(System.in);
		
		// Syntax: while(condition(s)) {
		// 				instruction(s)
		//		}
		
		// Prompt and store a number between [10,20]
	/*	System.out.print("Enter a value between 10-20: ");
		value = keyboard.nextInt();
		while(value < 10 || value > 20){
			System.out.print("Incorrect value. Must be between [10,20]: ");
			value = keyboard.nextInt();
		}
		System.out.println("Entry success!");
		*/
		// Not assume integers are entered... recover using the while loop
		System.out.print("Enter a value between 10-20: ");
		
		// This version will NOT recover from "character errors"
		// Invalid number is entered.
		// If letter is inputteed on the second while loops, the program breaks
		
		/*while(!keyboard.hasNextInt()){
			System.out.println("Enter a numerical value from [10,20]: ");
			keyboard.nextLine();
		}
		value = keyboard.nextInt();
		while(value < 10 || value > 20){
			System.out.print("Incorrect value. Must be between [10,20]: ");
			value = keyboard.nextInt();
		}
		*/
		// Repeats while loop while repeat = true
		boolean repeat = true;
		while(repeat) {
			if(!keyboard.hasNextInt()){
				keyboard.nextLine();
				System.out.println("Should be a numerical value from [10,20]: ");
				repeat = true;
			}
			else{
				value = keyboard.nextInt();
				if(value < 10 || value > 20){
					System.out.print("Must be between [10,20]: ");
					repeat = true;
				}
				else
					repeat = false;
			}
		}
		System.out.println("Entry success!");
		
		}
	
	}
