// Primitive Datatype variable creation
// Datatype vraiable = some value;
// Variable names: be descripitive, uppercase per word, start withlowercase letter or underscore, 
// must be combination of letters, digits, and underscore

public class VarDemo {
	
	public static final double PI = 3.141592635897932823;
	
	public static void main(String [] args) {
		
		// Create intgeres with appropriate initial value
		byte numberOfStudents = 14;
		System.out.println(numberOfStudents);
	
		short cityPopulation = 23140;
		System.out.println(cityPopulation);
		
		int studentsOnCampus = 55000; // ** Default integer literal
		System.out.println(studentsOnCampus);
		
		long moreThanInteger = 3000000000L; //number followed by L means "long"
		System.out.println(moreThanInteger);
		
		// Create floating-point numbers with initial vales
		float hourlyWage = 20.50F; // number followed by F means "float"
		double circumference = 925.44; // * Default floating-point literal
		
		// Create a character with an initial values
		char myGrade = 'A'; // Single quotes are chars, double quotes are strings
		
		// Create a boolean with a initial vaules
		boolean isRaining = false;
		
		hourlyWage = 19.85F;
		
		// Output appropriate strings with values of these variables
		System.out.println("The number of Java Students is " + numberOfStudents + ".");
		System.out.println("Double the students in Java would be " + (numberOfStudents+numberOfStudents) + ".");
		System.out.println("Population of O'Fallon is " + cityPopulation +".");
		System.out.println("We wish the student population would reach " + studentsOnCampus + ".");
		System.out.println( "Longer than an integer: " + moreThanInteger + ".");
		System.out.println("Pizza Hut is offering $" + hourlyWage + " per hour.");
		System.out.println("Circumference of this classroom is " + circumference + " feet.");
		System.out.println("Eveyone currently has a grade of " + myGrade + " in Java.");
		System.out.println("Status of raining currently: " + isRaining + ".");
	}
}