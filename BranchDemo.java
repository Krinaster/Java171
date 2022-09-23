import java.util.Scanner;

public class BranchDemo {
	
	public static void main(String [] args) {
	
	Scanner keyboard = new Scanner(System.in);
	int creditHours = 0, gradeValue = 0;
	String grade; 
	
	System.out.print("How many credit hours is the first class worth? ");
	creditHours = keyboard.nextInt();
	// Check to verify hours are between 0 < hours <= 5
	if(creditHours <= 0 || creditHours > 5) {
		System.out.println("Invalid number of hours.....exiting.");
		System.exit(0);
	}
	
	// Check for letter grade: A, B, C, D and F otherwise
	System.out.print("What grade was earned in first class? ");
	grade = keyboard.next();
	
	if(grade.charAt(0) == 'A' || grade.charAt(0) == 'B' || 
		grade.charAt(0) == 'C' || grade.charAt(0) == 'D'){
		
			// Can be integer or character calculation, so you type cast 
			// Which is the (int)(calculation)
			gradeValue = (int)('F' - grade.charAt(0) - 1);
		}
	// Else if doesnt have to be in braces, like inbedded in the if
	else if(grade.charAt(0) == 'a' || grade.charAt(0) == 'b' || 
		grade.charAt(0) == 'c' || grade.charAt(0) == 'd')
			gradeValue = (int)('f' - grade.charAt(0) - 1);
	
	else 
		gradeValue = 0;
	
	System.out.println("Quality points for that class: " + gradeValue * creditHours);
	
	// Example of extended-if statements checking each letter grade
	// To see if objects are equal, must use equal method
	// Could type: if(grade.charAt(0) == 'A' || grade.charAt(0) == 'a')
	// We are going to compare string types, and cant use normal comparison 
	// methods because it is an abstract data type
	if(grade.equals("A") || grade.equals("a"))
		gradeValue = 4;
	else if(grade.equals("B") || grade.equals("b"))
		gradeValue = 3;
	else if(grade.equals("C") || grade.equals("c"))
		gradeValue = 2;
	else if(grade.equals("D") || grade.equals("d"))
		gradeValue = 1;
	else if(grade.equals("F") || grade.equals("f"))
		gradeValue = 0;
	else if(grade.equals("W") || grade.equals("w")){
		System.out.println("Withdrawals are not included in GPA calculations.");
		gradeValue = 0;
		}
	else if(grade.equals("I") || grade.equals("i")) {
		System.out.println("Finish the class to include in the GPA calculatin");
		gradeValue = 0;
		}
	else {
		System.out.println("Invalid grade entered - not using in calculation");
		gradeValue = 0;
	}
	System.out.println("Quality points for that class: " + gradeValue * creditHours);
	
	// Else if are branching paths off the if, and the else is a catch all
	// for everything else 
	// If and if else statements dont require braces if it is a single instruction
	// More than one instruction requires braces
	
	// Switch Statements 
	// Switch(container.) {
	// case "A":instructions
	// case "a":
	// default case
	
	// Repeat gradeValue assigment this time using a switch statements
	switch(grade) {
			case "A":
			case "a": gradeValue = 4; break; // Or, case "a" -> gradeValue = 4;
			case "B":
			case "b": gradeValue = 3; break;
			case "C":
			case "c": gradeValue = 2; break;
			case "D":
			case "d": gradeValue = 1; break;
			case "F":
			case "f":
			case "W":
			case "w":
			case "I":
			case "i":
			default: gradeValue = 0;
			// Switch statements work by finding the case it is, and if it is true
			// it follows the instructions after the colon
			// However it keeps dropping down regardless of the instruction after the colon
			// If you do not have a break statement that breaks the drop down system
		}
		System.out.println("Quality points for that class: " + gradeValue * creditHours);
		
		gradeValue = 0;
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
			case "W":
			case "w":
			case "I":
			case "i":
			// This switch statement works by the switch statement starting at where the case is true
			// Then dropping down from the true statement to the rest  of the instructions
			// so if the case is A, it starts at A and goes to a then to B then b and so on
			// providing a clean and easy way to do this 
			}
			System.out.println("Quality points for that class: " + gradeValue * creditHours);
			
			String evenOdd;
			if(creditHours % 2 == 0)
				evenOdd = "even";
			else
				evenOdd = "odd";
			System.out.println(creditHours + " Credit hours is " + evenOdd + ".");
			
			// Using the conditional operator (condition)?true:false
			evenOdd = (creditHours%2 == 0)? "even" : "odd";
			System.out.println(creditHours + " Credit hours is " + evenOdd + ".");
			
	}
	
}