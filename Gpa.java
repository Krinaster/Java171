// Author 		 : Caden Boldenow
// Date Created  : 9/20/22
// Last Modified : 9/26/22
// Description   : Program collects grade and credit hours to caluculate gpa

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.UIManager;
import java.awt.Color;

public class Gpa {
	
	public static void main(String [] args) {
	
		// Variable defining
		Scanner keyboard = new Scanner(System.in);
		String grade1, grade2, grade3, grade4, name, enteringCode;
		int creditHours1, creditHours2, creditHours3, creditHours4;
		int gradeValue1, gradeValue2, gradeValue3, gradeValue4;
		DecimalFormat gpa = new DecimalFormat("#.00000");
		
		
		System.out.println("Hello, welcome to a GPA calculator.");
		System.out.print("If you want command prompt, please enter C");
		System.out.println("\nIf you want to use JOptionPane, please enter J");
		enteringCode = keyboard.nextLine();
		// Quick switch from command prompt to JOptionPane
		if(enteringCode.equals("C")){
		System.out.println("Please only use A, B, C, and D for letter grades");
		// Command Prompt
		// Class 1
		System.out.print("What is your letter grade in Class 1? ");
		grade1 = keyboard.next();
		System.out.print("How many credit hours is Class 1? ");
		creditHours1 = keyboard.nextInt();
		
		// Class 2
		System.out.print("What is your letter grade in Class 2? ");
		grade2 = keyboard.next();
		System.out.print("How many credit hours is Class 2? ");
		creditHours2 = keyboard.nextInt();
		
		// Class 3
		System.out.print("What is your letter grade in Class 3? ");
		grade3 = keyboard.next();
		System.out.print("How many credit hours is Class 3? ");
		creditHours3 = keyboard.nextInt();
		
		// Class 4
		System.out.print("What is your letter grade in Class 4? ");
		grade4 = keyboard.next();
		System.out.print("How many credit hours is Class 4? ");
		creditHours4 = keyboard.nextInt();
		
		// Making grade letters into numbers
		gradeValue1 = (int)('F' - grade1.charAt(0)- 1);
		gradeValue2 = (int)('F' - grade2.charAt(0)- 1);
		gradeValue3 = (int)('F' - grade3.charAt(0)- 1);
		gradeValue4 = (int)('F' - grade4.charAt(0)- 1);
		
		// Final Quality Points Value
		double finalQualityGrade = (gradeValue1 * creditHours1) + 
		(gradeValue2 * creditHours2) + (gradeValue3 * creditHours3) + 
		(gradeValue4 * creditHours4);
		
		// Printing GPA after dividing quality points by total credit hours
		System.out.println("Your GPA is: " + gpa.format(finalQualityGrade / 
		(creditHours1 + creditHours2 + creditHours3 + creditHours4)));
		}
		
		// JOptionPane
		// Teaching myself loops for this
		   else if(enteringCode.equals("J")){
	
		// Variable defining for JOptionPane
		int numberOfClasses, qualityPoints = 0, gradeValue = 0, 
		creditHours = 0;
		double totalCreditHours = 0, totalQualityPoints = 0;
		String grade = "";
		
		// Some Preliminary Questions for loop
		name = JOptionPane.showInputDialog(null, "Hello, what is your name? ",
			"GPA Calculator", JOptionPane.PLAIN_MESSAGE);
		numberOfClasses = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"Hello " + name + ", how many classes are you taking? ",
			"GPA Calculator", JOptionPane.INFORMATION_MESSAGE));
		
		for(int i = 0; i < numberOfClasses; i++){
			grade = JOptionPane.showInputDialog(null, "Okay " + name + 
			", what is your grade for one of your classes?", "GPA Calculator",
			JOptionPane.INFORMATION_MESSAGE);
			
			// Switch statement used to convert grade letters to values
			switch(grade) {
				case "A":
				case "a": gradeValue++;
				case "B":
				case "b": gradeValue++;
				case "C":
				case "c": gradeValue++;
				case "D":
				case "d": gradeValue++;
				case "F": 
				case "f":
				
			}
			
			creditHours = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"How many credit hours is this class?", "GPA Calculator", 
				JOptionPane.INFORMATION_MESSAGE));
			// Looping creditHours and grade question and store the values
			totalCreditHours += creditHours; // Storing total credithours
			qualityPoints = gradeValue * creditHours;
			totalQualityPoints += qualityPoints; // Storing total quality 
			// Then reinintializing values for loop
			qualityPoints = 0;
			gradeValue = 0;
			
		}
	
		// JOptionPane Final Calculation
		JOptionPane.showMessageDialog(null, "GPA: " + 
			gpa.format(totalQualityPoints/totalCreditHours), "GPA Calculator", 
			JOptionPane.INFORMATION_MESSAGE);
		   }
		// Catch all for if you dont go to command prompt or JOptionPane
		else
		   System.out.println("Please enter a valid letter");
	}
}

// Need to do:
// allow command prompt input of A and a 
// JOptionPane setup

// ASCII table values
// A = 65
// B = 66
// C = 67
// D = 68
// E = 69
// F = 70

// Flow chart
// Print scanner
// Prompt/store grade
// Prompt/store credit hours
// Prompt store grade 2
// Prompt/store credit hours 2
//Prompt/store grade 3
// Prompt/store credits hours 3
// Prompt/store grade 4
// Prompt/store credit hours 4
// Assign grade values 4 times
// grade value * credit hours 4 times
// can store value or just divide it by total credit hours
// then output final value

	// gradeValue = (int)('F' - grade.charAt(0)- 1);
		// System.out.println(gradeValue);
	

