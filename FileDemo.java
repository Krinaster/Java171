import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileDemo {
	
	public static void main(String []args) {
			
		// How to scan a file
		// Does not store memory for the file
		// Scanner fromFile = new Scanner(newFile("file name"));
		// Stores memory for the file 
		// File fName = newFile("file name");
		// Scanner fromFile = new Scanner(fName);
		
		int max = -1, min = 1000, sum = 0, count = 0, curScore = 0;
		
		Scanner fromFile = null;
		try {
			// If you are reading from a while in a different location
			// You have to have the location path and have to double backslash
			// Because one backslash is an escape sequence, and then reference file
			fromFile = new Scanner(new File("C:\\Data\\Junk\\ScannerScores.txt"));
		}
		
		catch(FileNotFoundException e) {
			System.out.println("File not found. Program exiting.");
			System.exit(0);
		}
		
		// OR 
		// File fName = new File("scores.txt");
		// Scanner fromFile = new Scanner(fName);
		
		while(fromFile.hasNextInt()) {
			curScore = fromFile.nextInt();
			if(curScore > max)
				max = curScore;
			if(curScore < min)
				min = curScore;
			sum += curScore;
			count++;
			
		}
		
		System.out.println("Read in " + count + " scores. Max is " + 
			max + ", min is " + min + 
			", with an average of " + (double)sum/count);
		
		PrintWriter toFile = null;
		try{
			toFile = new PrintWriter("C:\\Instsupport\\swisdata.bat");
		}
		
		catch(FileNotFoundException e){
			
		}
		// Doesnt work
		toFile.println("bwa hwahhahahwha");
		
	}

}
