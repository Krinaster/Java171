
public class ForLoopDemo {
	
	private static final int MAX = 24;
	
	public static void main(String [] args) {
	
	// Print all the even numbers from 0-500
	for(int i = 0; i<= 500; i+=2)
		System.out.print(i + " ");
	System.out.println();
	
	// Different approach to print all even numbers from 0-500
	// for(int i = 0; i<=500; i++)
	//	if(i%2 == 0)
	//		System.out.print(i + " ");
	
	// Print ALL the ASCII characters from 0-255
	for(int i = 0; i<255; i++)
		System.out.println(i + " " + (char)i);
	
	// Print a multiplication table
//	for(int i=1; i<=100; i++){
//		for(int j=1; j<=100; j++)
//			System.out.printf("%5d", i*j);
//	System.out.println();
//	}
	
	// 3 Different types of loops
	// for loops use fixed repititions and are pre test loops
	// while loops are variable controlled and are pre test loops
	// do while loops are variable controlled too and are post test loops
	// for and while loops may never execute, but do while loops execute at least once
	
	// Infinite Loop
	int i = 1;
	for(;;) System.out.println(i++);
	
	
	
	}
}

