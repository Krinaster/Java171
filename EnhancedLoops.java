
package enhancedloops;

import java.awt.Color;
import java.util.Random;


public class EnhancedLoops {

    private static final int SIZE = 20;
    
    public static void main(String[] args) {
        
        Random rand= new Random();
        
        // Create three arrays: integers, booleans, and Colors
        int[] value = new int[SIZE];
        boolean[] choice = new boolean[SIZE+SIZE];
        Color[] color = new Color[SIZE*100000];
        
        // Initialize to random values
        for(int i=0; i<value.length; i++)
            value[i] = rand.nextInt(100) + 1;
        for(int i=0; i<choice.length; i++)
            choice[i] = rand.nextInt(100) %2 == 0;
        for(int i=0; i<color.length; i++)
            color[i] = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    
        // Use enhanced for loop to displayed contents. for(type var : array)
        for(int i : value)
            System.out.print(i + " ");
        System.out.println();
        for(boolean b: choice)
            System.out.print(b + " ");
        System.out.println();
        for(Color c: color)
           System.out.print(c + " ");
        System.out.println();
        // CANNOT use an enhanced for loop to change contents of a variable
        for(int i : value)
            i=-1;
        for(int i : value)
            System.out.print(i + " ");
        
        // Count the number of true values in boolean array:
        System.out.println();
        int count = 0;
        for(boolean b : choice)
            if(b== true)
                count++;
        System.out.println("# of trues: " + count);
    
        // Count the number of values in integer array from 40-60
        count = 0;
        for(int i =0; i<value.length; i++)
            if(value[i] >= 40 && value[i] <= 60)
                count++;
        System.out.println("# between [40,60] is " + count);
        
        // OR written as an enhanced for loop:
        count = 0;
        for(int fortysixty: value)
            if(fortysixty >= 40 && fortysixty <= 60)
                count++;
        System.out.println("# between [40,60] is " + count);
        
        // Use an enhanced for loop to see if the Color is GREEN
        count = 0;
        for(Color cheese: color)
            if(cheese.equals(Color.GREEN))
                count++;
        System.out.println("Number of greens: " + count);
            
    }
    
}
