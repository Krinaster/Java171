import java.util.Scanner;

public class DoWhileDemo {
	
	public static void main(String[]args) {
		
		// Do while loops
		// Variable controlled loops
		// Post test loops (will always execute at least once)
		// syntax: do{
		// 		body
		// 		}
		// while(condition(s)); semicolon is important
		
		String choice = null;
		Scanner keyboard = new Scanner(System.in);
		
		
		
		do {
			System.out.println("\n\n\tA) Encrypt a file");
			System.out.println("\tB) Decrypt a file");
			System.out.println("\tC) View a file");
			System.out.println("\tD) Set a new cipher");
			System.out.println("\tE) Quit this program");
			
			
			System.out.println("\nEnter selection: ");
			choice = keyboard.next();
			
			switch(choice.toUpperCase()){
			case "A": System.out.println("Enter the file to encrypt: "); break;
			case "B": System.out.println("Enter the file to decrypt: "); break;
			case "C": System.out.println("Which file would you like to view?"); break;
			case "D": System.out.println("Enter the new cipher code: "); break;
			case "E": break;
			default : System.out.println("Invalid selection.");
			}
		} while(!choice.equals("E"));
			
	}

}
