
package matrixdemo;

import java.math.BigInteger;
import java.util.Random;


public class MatrixDemo {

    public static final int ROW_SIZE = 4;
    public static final int COL_SIZE = 5;
    
    public static void main(String[] args) {
       
        // Create two matrices - one of integers and one of BigIntegers
        //              matA                matB
        int[][] matA = new int[ROW_SIZE][COL_SIZE];
        BigInteger[][] matB = new BigInteger[ROW_SIZE][COL_SIZE];
        
        print(matA);
        print(matB);
    
        populate(matA);
        populate(matB);
        
        print(matA);
        print(matB);
        
        System.out.println("Row dimension of integer matrix: " + rowDim(matA));
        System.out.println("Row dimension of BigInteger matrix: " + rowDim(matB));
        
        System.out.println("Coloumn dimension of integer matrix: " + rowDim(matA));
        System.out.println("Coloumn dimension of BigInteger matrix: " + rowDim(matB));
    
        int[][] matAT = transpose(matA);
        BigInteger[][] matBT = transpose(matB);
        
        print(matAT);
        print(matBT);
    } // End of main
   
    // Populate with random 2-digit integers
    public static void populate(int[][] m){
        Random rand = new Random();
        for(int i=0; i<m.length; i++)
            for(int j=0; j<m[i].length; j++)
                m[i][j] = rand.nextInt(90) + 10;
    }
    
    public static void populate(BigInteger[][] m){
        Random rand = new Random();
        StringBuilder string = new StringBuilder();
        int size = rand.nextInt(6) + 20;
        
        for(int i=0; i<m.length; i++)
            for(int j=0; j<m[i].length; j++){
                string.append(rand.nextInt(9) + 1);
                for(int k=1; k<size; k++)
                    string = string.append(rand.nextInt(10));
                m[i][j] = new BigInteger(string.toString());
                string.setLength(0);
            }
    }
    
    public static void print(int[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
    
    public static void print(BigInteger[][] m){
         for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++)
                System.out.print(m[i][j]+ " ");
            System.out.println();
         }
    }
    
    // Cycle through each row to determine max size in case of jagged array
    public static int rowDim(int[][] m ){
        int max = m[0].length;
        for(int i=0; i<m.length; i++)
            if(m[i].length > max)
                max = m[i].length;
        return max;
    }

    public static int rowDim(BigInteger[][]m){
        int max = m[0].length;
        for(int i=0; i<m.length; i++)
            if(m[i].length > max)
                max = m[i].length;
        return max;
    }
    
    public static int colDim(BigInteger[][] m){
        int count = 0;
        for(int i=0; i<m.length; i++)
            if(m[i] != null)
                count++;
        return count;
    }
    
    public static int colDim(int[][] m){
     int count = 0;
        for(int i=0; i<m.length; i++)
            if(m[i] != null)
                count++;
        return count;
   }

    public static int[][] transpose(int[][] m){
        int[][] transpose = new int[m[0].length][m.length]; //m.length is rows and m[0].length is coloumns
        // and to transpose you just swap the rows and coloumns where the first array dimension would be m.length
        //now it is m[0].length
        
        for(int i=0; i<transpose.length;i++)
            for(int j=0; j<transpose[0].length;j++)
                transpose[i][j] = m[j][i];
        return transpose;
    }

    public static BigInteger[][] transpose(BigInteger[][] m){
        BigInteger[][] transpose = new BigInteger[m[0].length][m.length];
        
        for(int i=0; i<transpose.length; i++)
            for(int j=0; j<transpose[0].length;j++)
                transpose[i][j] = new BigInteger(m[j][i].toString());
                
        
        return transpose;
    }

} // End of Class
