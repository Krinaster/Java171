// Caden Boldenow
// 11/11/22
// 11/17/22
// Program displays an airlines airplane seating chart and 
// can ask for user input to reserve a seat if not taken
// and prompt again if seat is taken

package reservations;

import java.util.Random;
import java.util.Scanner;


public class Reservations {
    
    public static final int ROW_SIZE = 10;
    public static final int LEFT_COL_SIZE = 4;
    public static final int RIGHT_COL_SIZE = 3;
    public static final char OPEN_SEAT = 'O';
    public static final char SEAT_TAKEN = 'X';
     
    public static void main(String[] args) {
    
    // Make javadoc comments and comment everything on what it does
        
    // I have the +1 and the +2 respectively to make room for a row and 2 columns for the header and then the aisle
    String[][] seats = new String[ROW_SIZE+1][LEFT_COL_SIZE + RIGHT_COL_SIZE+2];
    displayMenu(seats);
   
    } // End of main
    
    /**
     * Basic print method for a 2D array that takes a 2D array and runs through a for loop with outputting it in table format with printf
     * @param m, a 2D String array
     */
    public static void print(String m[][]){
        for(int i =0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.printf("%-4s", m[i][j]);}
            System.out.println("");
        }
    
    } // End of print method
   
    /**
     * Not so basic program that displays an airplane seating chart, takes input from user and 
     * converts that input into a 2D matrix that sees if the point is valid, and if valid
     * marks the seat for reservation, and if not valid states that the seat is not valid
     * @param seats, a 2D String array
     */
    public static void displayMenu(String seats[][]) {
        Scanner keyboard = new Scanner(System.in);
        String seatTry = null;
        String[] STRING_SPLITTER = new String[2];
        boolean exit = false;
        Random rand = new Random();
        
        System.out.println("Welcome to our AirLine Seat Reservations");
            System.out.println();
            // Initializes the entire array to open seats and then for loops after make the display menu
            System.out.println("Would like to book a: ");
            System.out.println(" A) Empty Flight \n B) Randomly Filled Flight");
   
            for (String[] seat : seats) 
                for (int j = 0; j < seat.length; j++) 
                    seat[j] = "" + OPEN_SEAT;
            
            // Randomizes seat arrangement
            if(keyboard.next().equals("B")){
            for(int i =0; i<seats.length; i++)
                for(int j=0; j<seats[i].length; j++){
                    int k = rand.nextInt(100)+1;
                        if(k% 2 == 0)
                        seats[i][j] = "" + SEAT_TAKEN;
                     else
                        seats[i][j] = "" + OPEN_SEAT;
              }
            }
            //For loop to make heading for rows
            for(int i=1; i<seats.length; i++)
                seats[i][0] ="" + (char)((int)'@'+i);
    
            // For loop to make heading for coloumns
            for(int i=0; i<LEFT_COL_SIZE+1; i++)
                seats[0][i] = "" + i;
            // For loop to make the right column headers whilst skipping the aisle and numbering consecutively
            for(int i=LEFT_COL_SIZE+1; i<LEFT_COL_SIZE+ RIGHT_COL_SIZE + 1; i++)
                seats[0][i+1] = "" + i;
   
            // For loop to make aisle
            for (String[] seat : seats)
                seat[LEFT_COL_SIZE+1] = "|";
            
            
            // Makes top left corner a blank
            seats[0][0] = "";
            
            System.out.println("\n\nOur Airplane Seating Chart: \n");
        do{
            print(seats);
            
            System.out.println();
            // Should turn this into a menu prompt that then leads to a switch statement with all the options
            System.out.println("Please enter the row number and "
                    + "seat number you desire (Enter -1 to quit): ");
            // Stores whatever the person inputs as seat number
            seatTry = keyboard.next();
            if(seatTry.equals("-1"))
                exit = true;
     
            // Not going to lie, looked this one up
            STRING_SPLITTER = seatTry.split("(?<=\\D)(?=\\d)");
            
            
            if(exit != true){
                if(Integer.parseInt(STRING_SPLITTER[1]) < LEFT_COL_SIZE + RIGHT_COL_SIZE + 1){
                    if(isValid(STRING_SPLITTER, seats) == false)
                        System.out.println("Invalid seat, please enter a valid seat");
                    else{
                        seats[convertRow(STRING_SPLITTER)][convertColumn(STRING_SPLITTER)] = "" + SEAT_TAKEN;
                        System.out.println("\n\nThank you for making a reservation!");
                        System.out.println("You can either reserve another seat, or you can quit with input of -1");
                    }
                }
                else
                   System.out.println("Invalid Seat, please pick a valid seat");
                System.out.println();
            }
        } // Loops back around if exit is not true
    while(!exit == true);
    
    } // End of displayMenu method
  
    /**
     * A method that takes the user input and checks if the seat is valid by seeing if the input
     * is greater than two, and if the seat is not the column header or row header
     * @param o, A 1D String array with user input
     * @param m, A 2D string array with which we are checking user input validity
     * @return a boolean determining validity of seat selection
     */
    public static boolean isValid(String[] o, String[][] m) {
        boolean valid;
        //Checks if the input is length two for the seat number and letter
        if(o.length != 2)
            valid = false;
        //Checks if the input is equal to the first coloumn, and if so returns valse
        else if(Integer.parseInt(o[1]) == 0)
            valid = false;
        // Makes sure the first value of the input is corresponding row letter
        else if(o[0].charAt(0) < 65)
            valid = false;
        // Checks if the seat is taken, and if so returns false
        else
            valid = !m[convertRow(o)][convertColumn(o)].equals("" + SEAT_TAKEN);
        return valid;
    }
    
    /**
     * Converts user input into the row number for the 2D seating reservation chart
     * @param o, a 1D string array that splits characters and numbers 
     * @return the row number needed for seating reservation chart
     */
    public static int convertRow(String[] o){
        return o[0].charAt(0) - 64;
    }
    
    /**
     * Basic method that converts the user input into a column number
     * and checks if the column is to the right of the aisle, and if so
     * the column is offset by 1
     * @param o, a 1D string array that splits characters and numbers
     * @return the column number needed for seating reservation chart
     */
    public static int convertColumn(String[] o){
        int a = 0;
        if(Integer.parseInt(o[1]) >= LEFT_COL_SIZE + 1)
            a = Integer.parseInt(o[1]) + 1;
        else
            a = Integer.parseInt(o[1]);
        return a;
    }

} // End of class

