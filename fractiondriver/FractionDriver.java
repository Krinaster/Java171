
package fractiondriver;

import java.util.Random;
import java.util.Scanner;


public class FractionDriver {

    private static final int QUESTIONS = 10;
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        Fraction left = null,right = null, correct = null;
        String answer = null;
        int numCorrect = 0;
        
        for(int i = 1; i<=QUESTIONS; i++){
            left = new Fraction(rand.nextInt(21) - 10, rand.nextInt(10)+1);
            right = new Fraction(rand.nextInt(21)- 10, rand.nextInt(10)+1);
            
            if(right.getNumerator() == 0)
                right.setNumerator(rand.nextInt(10)+1);
            
            switch(rand.nextInt(4)){
                case 0: correct = left.add(right); 
                    System.out.println("Question " + i + ": " + left + " + " + right + " = ");
                    break;
                case 1: correct = left.subtract(right); 
                    System.out.println("Question " + i + ": " + left + " - " + right + " = ");
                    break;
                case 2: correct = left.multiply(right);
                    System.out.println("Question " + i + ": " + left + " x " + right + " = ");
                    break;
                default: correct = left.divide(right);
                    System.out.println("Question " + i + ": " + left + " / " + right + " = ");
                    break;
            }
        
            answer = keyboard.next();
            try{
                if(correct.equals(convert(answer))){
                    numCorrect++;
                    System.out.println("Nicely done!");
            }
            else
                System.out.println("Incorrect. Correct answer is " + correct);
            }
            catch(NumberFormatException e){
                System.out.println("That's not even a fraction.");
                System.out.println(" Incorrect. Correct answer is " + correct);
                }
        }
        System.out.println("Answered " + numCorrect + " of " + QUESTIONS + ", or a " + (numCorrect)/QUESTIONS * 100);
        
        
        Fraction f1 = new Fraction(), f2 = new Fraction(3),
                f3 = new Fraction(2,3), f4 = new Fraction(-5,-4),
                f5 = new Fraction(81, 48), f6 = new Fraction(2,3),
                f7 = new Fraction(1,1);
        
       /* System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);
        System.out.println("f6 = " + f6);
        System.out.println("f7 = " + f7);
        System.out.println("f1 = f6? " + f1.equals(f6));
        System.out.println("f3 = f6? " + f3.equals(f6));
        
        System.out.println(f5.reciprocal());
        System.out.println(f3.reciprocal());
        
        // Test Arithmetic
        System.out.println("f2 + f3 = " + f2.add(f3));
        System.out.println("f4 + f5 = " + f4.add(f5));
        System.out.println("f2 * f3 = " + f2.multiply(f3));
        System.out.println("f4 * f5 = " + f4.multiply(f5));
        System.out.println("f2 - f3 = " + f2.subtract(f3));
        System.out.println("f4 - f5 = " + f4.subtract(f5));
        System.out.println("f2 / f3 = " + f2.divide(f3));
        System.out.println("f4 / f5 = " + f4.divide(f5)); */
    } // End of main
    
    public static Fraction convert(String o){
        int index = o.indexOf("/");
        int num =0, den =0;
        
        try{
            if(index == -1){
                den = 1;
                num = Integer.parseInt(o);
            }
            else{
                num = Integer.parseInt(o.substring(0, index));
                den = Integer.parseInt(o.substring(index+1, o.length()));
            }
        }
        catch(NumberFormatException e){
            throw e;
        }
            
        
    return new Fraction(num, den);
    }
    
}
