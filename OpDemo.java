
// All classes in Java Lang are already imported

// Scanner class we are importing
import java.util.Scanner;

public class OpDemo {
	
	public static void main(String [] args) {
		
		int x = 5, y = 8, z = 10;
	
	// Arithmteic Operators
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("y / x = " + (y / x));
		System.out.println("z / y = " + (z / y));
		System.out.println("y % x = " + (z % x));
		System.out.println("z % y = " + (z % y));
	
	// Compound assignment operators
		x += y; // x = x + y = 5 + 8 = 13
		z -= y; // z = z-y = 10 -8 = 2
		y *= y; // y = y * y = 8 * 8 = 64
		x %= z; // x = x % z = 13 % 2 = 2
		System.out.println("x, y, z have values " + x + ", " + y + ", " + z);
	
	// Post/pre Increment/Decrement operators
		System.out.println("Post increment x: " + x++);
		System.out.println("Pre Increment x: " + ++x);
		y = ++x + z--;
		z--;
		x = y-- * --z;
		System.out.println("x, y, z have values " + x + ", " + y + ", " + z);
		z = ++x + ++y;
		x += y++ + z++;
		System.out.println("x, y, z have values " + x + ", " + y + ", " + z);
	
	// Relational OPerators
		System.out.println("x < y ? " + (x < y));
		System.out.println("y < x ? " + (y < x));
		System.out.println("z > z ? " + (z > z));
		System.out.println("z <= y ? " + (x <= y));
		System.out.println("x == z ? " + (x == z));
		System.out.println("x != y ? " + (x != y));
		System.out.println("x != z ? " + (x != z));
		
		// Logical operators ! && ||
		System.out.println( ( x!= y) && (z >= x) && (x < y) );
		System.out.println( (y >  x) || (z < x) || (x != z) );
		System.out.println( (y <  x) || (z == x) && (x > z) ); // && and is done before || the or
		System.out.println( !(x > y) );
		
		x = 5;
		y = x*2; 
		z = y-8;
		System.out.println("x, y, z have values " + x + ", " + y + ", " + z);
		
		// ^ is NOT a power like calculator, If you want to use a power,
		// Use the methods in the Math Class
		System.out.println("x^2 = " + x*x);
		System.out.println("x^5 = " + Math.pow(x, 5));
		System.out.println("Hypotenuse with legs x,y " + Math.hypot(x, y));
		
		// Gathering input: Use Scanner class
		Scanner keyboard = new Scanner(System.in);
		int day = 0;
		System.out.print("What is the day today? ");
		// Wanting to store the next integer as the variable day and having to call the class keyboard
		day = keyboard.nextInt();
		System.out.print("Day entered: " +day);
		
		
		
		
	}
}