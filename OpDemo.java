
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
	}
}