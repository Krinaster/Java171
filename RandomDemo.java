	
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

public class RandomDemo {
		
	public static void main(String [] args) {
			
		Scanner keyboard = new Scanner(System.in);
		String data;
		int score = 0, sum = 0, numberOfScores = 0;
		Random rand = new Random();
		
		PrintWriter toFile = null;
		// Try and catch is exactly as it sounds
		// It tries something, and if doesnt work
		// the catch activates and does something 
		
		// We are splitting the defining and initializing of the value to counteract the scope 
		
		try {
			toFile = new PrintWriter("scores.txt");
		}
		// Have to make an object to reference which is e
		catch(FileNotFoundException e){
			System.out.println("Error creating file - exiting.");
			System.exit(0);
		}
		
		// Extract from user some valid grade: A, B, C, D, F, W, I.
	/*	System.out.print("Enter in the grade for class 1: ");
		data = keyboard.next();
		data = data.toUpperCase();
		
		//Prompt again for invalid letter grade
		while(data.length() != 1 || !data.equals("A") && !data.equals("B") 
			&& !data.equals("C") &&!data.equals("D") &&  !data.equals("F") 
			&& !data.equals("W") &&!data.equals("I")) {
				
				System.out.print("Enter a valid letter grade: ");
				data = keyboard.next();
				data = data.toUpperCase();
				
			}
			
			System.out.println("Entry Sucess!");
			
			// Prompt for a series of grades and compute the average
			// System.out.print("Enter the first grade: ");
			// score = keyboard.nextInt();
			while(score != -1) {
				++numberOfScores;
				sum += score;
				System.out.print("Enter the first grade(-1 to quit): ");
				score = keyboard.nextInt();
				
			}
			if(numberOfScores > 0)
			System.out.println("Average of " + numberOfScores + " grades is " +
				(double)sum/numberOfScores + ".");
		*/		
			// Print to screen 1000 random test scores 0-100
			for(int i=1; i <= 10000; i++)
				toFile.print(rand.nextInt(101) + " ");
			// Closes the buffer space so it writes the buffer space values
			toFile.close();
			System.out.println("File successfully written to");
	}
}