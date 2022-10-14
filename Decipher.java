// Author		 : Caden Boldenow 
// Date created  : 10/13/22
// Last modified : 10/14/22
// Description   : This reads an encrypted file to decrypt 

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Decipher {

	final static String PLAIN_TXT = "decrypted.txt";
	final static String ENCRYPTED_TXT = "ciphertext.txt";
	
	public static void main(String [] args){
		
		Scanner fromFile = null;
		PrintWriter toFile = null;
		char letterValue = 0;
		int	undoFormula = 0;
		StringBuilder message = new StringBuilder();
		
		try{
			fromFile = new Scanner(new File(ENCRYPTED_TXT));
			toFile = new PrintWriter(PLAIN_TXT);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found. Program exiting...");
			System.exit(0);
		}
		
		while(fromFile.hasNextInt()){
			undoFormula = fromFile.nextInt();
			letterValue = (char)((((((undoFormula * 3) + 171) / 567891) - 9) / 2) + 8);
			System.out.print(letterValue);
			message = message.append(letterValue);
		}
		System.out.println();
		System.out.print(message);
		toFile.print(message);
		toFile.flush();
	}

}

// Basic flow chart for this code is to first
// Create printwriter to read encrypted and make sure the file exists
// create file for the plain txt and nothing else
// Then figure out how to undo the encryption 
// Use stringbuilder and append to connect the strings
// then finally use printwriter to print the infromation to plain txt
// and console
		
