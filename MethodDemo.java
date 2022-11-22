/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoddemo;

import java.math.BigInteger;
import java.util.Scanner;


public class MethodDemo {

   
    public static void main(String[] args) {
     
        String choice = null;
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        
        
        do{
            System.out.println("\tA) Compute powers of n from 1-10");
            System.out.println("\tB) Sum of all the integers from 1-n");
            System.out.println("\tC) Product of all the integers from 1-n");
            System.out.println("\tR) Reverse a line of numbers");
            System.out.println("\tX) Exit the program");
            System.out.print("\n\n Enter choice: ");
            
            choice = keyboard.next().toUpperCase();
        
            switch(choice){
                case "A": System.out.print("\nEnter n: ");
                    value = keyboard.nextInt();
                    displayPowers(value,10); break;
                case "B": System.out.print("\nEnter n: "); 
                    value = keyboard.nextInt(); 
                    System.out.println("Sum from 1..." + value + " = " + computeSum(value)); break;
                case "C": System.out.print("\nEnter n: "); 
                     value = keyboard.nextInt();
                     System.out.println("Product from 1..." + value + " = " + factorial(value)); break;
                case "R": System.out.print("Enter n: "); 
                    value = keyboard.nextInt();
                    System.out.println(value+ " reveresed is " + backwards(value)); 
                    break;
                case "X": break;
                default : System.out.println("Invalid selection. Re-enter...");
           
            }
        
        }
        while(!choice.equals("X"));
        
    } // end of main
       // Creating our own method
    // This has the two declarations of a base, and the power you are going to
    // Value runs through the for loop because it is value going through the method as base
    // and highest power is in the displayPowers(value, 10) the ten is the highest power

    /**
     * Shows the power of the passed base from 1 to the highest power passed
     * @param base the base of the number used
     * @param highestPower the highest power you are putting the base to
     */
    public static void displayPowers(int base, int highestPower){
        for(int i=1; i<=highestPower; i++)
            System.out.println(base + "^" + i + " = " + (int)Math.pow(base, i));
        
    }
     
    /**
     * Used to compute the sum all numbers from 1 to max
     * @param max the max of the range to add
     * @return return integer that is all numbers from 1 to max added
     */
    public static int computeSum(int max){
        int sum = 0;
        for(int i=1; i<=max;i++)
            sum+= i;
        return sum;
         }
    
    
    private static BigInteger factorial(int num){
        BigInteger product = BigInteger.ONE;
        for(int i=2; i <= num; i++)
           product = product.multiply(new BigInteger(""+i)); // Because it is an abstract type we must use .multiply method
        // and to multiply the biginteger product we must convert into biginteger which requires converting into string
        return product;
    }
    // This is a javadoc commet
    // Used to notate methods made for public use
    // Since if you publish this you are making it to the public
    // And should be like the parameters and arguments on the java api website
    /**
     * Will reverse the number passed
     * @param number any integer to be reversed
     * @return the StringBuilder represented the reversed integer
     * @see StringBuilder
     * @since 
     */
    public static StringBuilder backwards(int number){
       StringBuilder rev = new StringBuilder("" + number);
       return rev.reverse();
    
        //OR
        // return new StringBuilder("" + array.reverse());
    
    }
}
   

