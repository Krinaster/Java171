import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gpa {
	
	public static void main(String [] args) {
	
		Scanner keyboard = new Scanner(System.in);
		String grade1, grade2, grade3, grade4;
		int creditHours1, creditHours2, creditHours3, creditHours4;
		
		// Class 1
		System.out.print("What is your grade in Class 1? ");
		grade1 = keyboard.nextLine();
		System.out.print("How many credit hours is Class 1? ");
		creditHours1 = keyboard.nextInt();
		
		// Class 2
		System.out.println("What is your grade in Class 2? ");
		grade2 = keyboard.nextLine();
		System.out.print("How many credit hours is Class 2? ");
		creditHours2 = keyboard.nextInt();
		
		// Class 3
		System.out.println("What is your grade in Class 3? ");
		grade3 = keyboard.nextLine();
		System.out.print("How many credit hours is Class 3? ");
		creditHours3 = keyboard.nextInt();
		
		// Class 4
		System.out.println("What is your grade in Class 4? ");
		grade4 = keyboard.nextLine();
		System.out.print("How many credit hours is Class 4? ");
		creditHours4 = keyboard.nextInt();
		
		
	    
		// gradeValue = (int)('F' - grade.charAt(0)- 1);
		// System.out.println(gradeValue);
	
	
	
	
	
	
	}
}


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