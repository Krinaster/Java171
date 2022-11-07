

package morewitharrays;

import java.util.Random;


public class MoreWithArrays {

    public static final int SIZE = 250;
    
    public static void main(String[] args) {
   

 
    int[] score = new int[SIZE];
    
    populateArray(score);
        System.out.println("");
    print(score);
    System.out.println();
    System.out.println("Max in the array: " + findMax(score));
    System.out.println("Min in the array: " + findMin(score));
    System.out.println("Average of the array: " + findAvg(score));
    printDistributionTable(score);
    // Normally methods use a copy of the variable 
    // and the clearArray would not work for integers or anything else
    // but arrays are special and they point to the address 
    // and the copy of the array is the address
    // and so the method changes the array in the main aswell
    clearArray(score);
    print(score);
    } // End of main
    
    public static int findMax(int[] a){
        int max = a[0];
        for(int i=1; i<a.length; i++)
            if(a[i] > max)
                max = a[i];
        return max;
    }
    
    public static void print(int[] a){
        for(int i=0; i <a.length;i++)
            System.out.print(a[i] + " ");
    }
    
    public static int findMin(int[] a ){
        int min = a[0];
        for(int i=1; i<a.length; i++)
            if(a[i] < min)
                min = a[i];
        return min;
    }
    
       public static double findAvg(int[] a ){
        int sum = a[0];
        for(int i=1; i<a.length; i++)
            sum += a[i];
        return (double)sum/a.length;
    }
       
    public static void clearArray(int[] a){
        for(int i=0; i < a.length; i++)
            a[i] = 0;
    }

    // Populate an array of size 250 with randomly distributed test scores
    // according to the distribution: 12% - A's 20% - B's 45% - C's 
    // 18% - D's, and the remaining 5% - F's
    public static void populateArray(int[] score){
       
        Random rand = new Random();
        int distValue = 0;   
        for(int i = 0; i<score.length; i++){
        distValue = rand.nextInt(100);
        if(distValue < 12)
            score[i] = rand.nextInt(10) + 90;
        else if(distValue < 32)
            score[i] = rand.nextInt(10) + 80;
        else if(distValue < 77)
            score[i] = rand.nextInt(10) + 70;
        else if(distValue < 95)
            score[i] = rand.nextInt(10) + 60;
        else
            score[i] = rand.nextInt(60);
        } // end of for loop
        
    }

    public static void printDistributionTable(int[] a) {
        int[] count = new int[5];
        for(int i = 0; i<a.length; i++)
            if(a[i] >= 90) count[0]++;
            else if(a[i] >= 80) count[1]++;
            else if(a[i] >= 70) count[2]++;
            else if(a[i] >= 60) count[3]++;
            else                count[4]++;
        
        System.out.println("A: " + count[0]);
        System.out.println("B: " + count[1]);
        System.out.println("C: " + count[2]);
        System.out.println("D: " + count[3]);
        System.out.println("F: " + count[4]);

    }

} // end of class
