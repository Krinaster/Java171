import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Gpa {
	
	public static void main(String [] args) {
	
		Scanner keyboard = new Scanner(System.in);
		String grade1, grade2, grade3, grade4, name, numberOfClasses;
		int creditHours1, creditHours2, creditHours3, creditHours4;
		int gradeValue1, gradeValue2, gradeValue3, gradeValue4;
		DecimalFormat gpa = new DecimalFormat("#.00000");
		
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
		
		// JOptionPane
		name = JOptionPane.showInputDialog(null, "Hello, what is your name? ");
		numberOfClasses = JOptionPane.showInputDialog(null, "Hello " + name + ", how many classes are you taking? ");
		grade1 = JOptionPane.showInputDialog(null, "Okay " + name + ", what is your grade for your first class? ");
		creditHours1 = Integer.parseInt(JOptionPane.showInputDialog(null, "How many credit hours is your first class? "));
		// Look at loops to make a switch statement that calculates grade
		// If cant figure it out, just do normal method with JOptionPane
	
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
	
