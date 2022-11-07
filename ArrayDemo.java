
package arraydemo;

import java.util.Random;


public class ArrayDemo {

    private static int ROW_SIZE = 6;
    
    public static void main(String[] args) {
       
        // This array can store a total of 6 numbers
        // Arrays store the address for where we store all of our numbers
        // int[] name = new int[number]; this syntax stores a certain length of an array
        int[] lottoNum = new int[7];
        
        // int[] storage = {1,3243,23412,543253,6}; this syntax stores predefined numbers, 
        // and its length is defined by the amount numbers in it
        
       
        // Cycle through and print elemeents of the array with for loop
        // First array
        for(int i =0; i < lottoNum.length; i++)
            System.out.print(lottoNum[i] + " ");
        
        System.out.println("");
        // Second array
        double[] grade = new double[13];
        for(int i=0; i<grade.length;i++)
            System.out.print(grade[i]+ " ");
        
        // Third array
        System.out.println("");
        boolean[] bingoCard = new boolean[24];
        for(int i=0; i<bingoCard.length; i++)
            System.out.print(bingoCard[i] + " ");
        
        // Fourth array
        System.out.println("");
        char[] boggle = new char[ROW_SIZE*ROW_SIZE];
        for(int i=0; i<boggle.length; i++)
            System.out.print(boggle[i] + " ");
        
        System.out.println("");
        shakeAndSetBoggleGame(boggle);
         for(int i=0; i<boggle.length; i++){
            System.out.print(boggle[i] + " ");
            if((i+1)%ROW_SIZE == 0)
                System.out.println();
         }
    }
    
    // To pass an array through a method, you have to use an array as a parameter
    // Array made to randomize 
    public static void shakeAndSetBoggleGame(char[] board){
        Random rand = new Random();
        for(int i=0; i<board.length; i++){
            //board[i] = (char)(rand.nextInt(26) + 'A');
            
            int roll = rand.nextInt(100);
            if(roll < 45) {
                switch(rand.nextInt(8)){
                    case 0: board[i] = 'A'; break;
                    case 1: board[i] = 'E'; break;
                    case 2: board[i] = 'I'; break;
                    case 3: board[i] = 'O'; break;
                    case 4: board[i] = 'S'; break;
                    case 5: board[i] = 'T'; break;
                    case 6: board[i]  ='R'; break;
                    default: board [i] = 'D';
                }
            }
            else if(roll < 79){
                 switch(rand.nextInt(6)){
                    case 0: board[i] = 'B'; break;
                    case 1: board[i] = 'C'; break;
                    case 2: board[i] = 'H'; break;
                    case 3: board[i] = 'L'; break;
                    case 4: board[i] = 'M'; break;
                    default: board [i] = 'N';
                }
            }
            else if (roll < 94) {
                 switch(rand.nextInt(6)){
                    case 0: board[i] = 'F'; break;
                    case 1: board[i] = 'G'; break;
                    case 2: board[i] = 'K'; break;
                    case 3: board[i] = 'P'; break;
                    case 4: board[i] = 'U'; break;
                    default: board [i] = 'Y';
                }
            }
            else {
                  switch(rand.nextInt(6)){
                    case 0: board[i] = 'J'; break;
                    case 1: board[i] = 'X'; break;
                    case 2: board[i] = 'Q'; break;
                    case 3: board[i] = 'V'; break;
                    case 4: board[i] = 'W'; break;
                    default: board [i] = 'Z';
            }
        }
    }

}
}
