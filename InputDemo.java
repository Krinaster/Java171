import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class InputDemo {
	
	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	DecimalFormat money = new DecimalFormat("$#,###.00");
	String name, className, data;
	int numberOfClasses = 0;
	double moneySpent = 0;
	boolean wasEnjoyable = false;
	
	
	// Read in the users first name
	/*
	System.out.print("Enter your first name: ");
	name = keyboard.next();
	
	// Read in and ignore the carriage return
	keyboard.nextLine();
	
	// Read in the class name
	System.out.print("Hello " + name + ", what class are you attending? ");
	className = keyboard.nextLine();
	System.out.println(className + " seems like an interesting class!");
	
	// Read in number of classes
	System.out.print("How many other classes are you taking? ");
	numberOfClasses = keyboard.nextInt() + 1; // Java class + the 4 other classes I am taking
	System.out.println("Very neat. " + numberOfClasses + " sounds fun.");
	
	// Read in boolean and floating-point number (float/double)
	System.out.print("Had an enjoyable weekend? ");
	wasEnjoyable = keyboard.nextBoolean();
	System.out.print("So, how much did you spend this weekend? ");
	moneySpent = keyboard.nextDouble();
	System.out.println(money.format(moneySpent) + " is long gone.");
	*/
	
	// Read information from JOptionPane
	name = JOptionPane.showInputDialog(null, "What is your first name?", "Enter name here");
	className = JOptionPane.showInputDialog(null, "Hello " + name + 
		", what class are you attending? ");
	data = JOptionPane.showInputDialog(null, className + " sounds hard." +
		" How many other clases are you taking? ");
	numberOfClasses = Integer.parseInt(data);
	
	//Optionally
	//This passes the string to become an integer in one step instead of making new variable 
	//and storing it with the value that is the converted string
	/* numberOfClasses = Integer.parseInt(JOptionPane.showInputDialog(null, className + " sounds hard." +
		" How many other clases are you taking? "));
		*/
	
	moneySpent = Double.parseDouble(JOptionPane.showInputDialog(null, " How much did you spend? "));
	// This JOptionPane just displays that infact it read the information and reading it back 
	JOptionPane.showMessageDialog(null, "Classes: " + (numberOfClasses + 1) + " Spent: " + money.format(moneySpent));
	}
}