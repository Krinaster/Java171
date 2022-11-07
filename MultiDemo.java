
package multidemo;

import java.awt.Color;
import java.util.Random;

public class MultiDemo {

    public static final int MAX_GUESS = 12;
    public static final int MAX_HOLES = 5;
    
    public static void main(String[] args) {
        Color[] wheel = new Color[100];
        Random rand = new Random();
        
        // Create each color for each object
        for(int i = 0; i<wheel.length; i++)
            wheel[i] = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
        
        for(int i =0; i<wheel.length;i++)
            System.out.print(wheel[i]);
    
        // Create a 2D array mastermindBoard of Colors
        Color[][] mastermindBoard = new Color[MAX_GUESS][MAX_HOLES];
        
        // To cycle through a 2D array, use a nested for loop
        for(int i=0; i<mastermindBoard.length;i++){
            for(int j=0; j<mastermindBoard[i].length;j++)
                mastermindBoard[i][j] = new Color(rand.nextInt(255),
                                                  rand.nextInt(255),
                                                  rand.nextInt(255));
        }
        for(int i=0; i<mastermindBoard.length;i++){
            for(int j=0; j<mastermindBoard[i].length;j++)
                System.out.println(mastermindBoard[i][j]);
            System.out.println();
        }
    
        // Create a 2D array of grades for students in a class
        // Way to create for 13 students with 29 grades
        double[][] grade = new double[13][29];
        for(int i=0; i<grade.length;i++){
            for(int j=0; j<grade[i].length;j++)
                System.out.print(grade[i][j] + " ");        
        System.out.println();
    } // End of for loop
        
        // Create a 3D boolean array pertaining to wheter a spot on 3D
        // chess board is currently occupied
        // We are making the board 8x8x4 it is 8*8*4=256 boolean
        boolean[][][] chessBoard = new boolean[8][8][4];
        for(int i=0; i<chessBoard.length;i++)
            for(int j=0; j<chessBoard[i].length;j++)
                for(int k=0; k<chessBoard[i][j].length;k++)
                    System.out.print(chessBoard[i][j][k]);
    
    } // End of main
        
    
} // End of class
