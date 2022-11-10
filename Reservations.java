
package reservations;

import java.util.Scanner;


public class Reservations {
    
    public static final int ROW_SIZE = 10;
    public static final int LEFT_COL_SIZE = 3;
    public static final int RIGHT_COL_SIZE = 5;
    public static final char OPEN_SEAT = 'O';
    public static final char SEAT_TAKEN = 'X';
    
    public static void main(String[] args) {
    
    // General plan of attack currently:
    // find out how to make row and column headers
    // make the isValid method
    // the displayMenu method
    // put into doWhile loop
    // and just generally look at the program specifications to figure out everything else
    // and refer to flowchart at bottom
    
    // I have the +1 and the +2 respectively to make room for a row and 2 columns for the header and then the aisle
    String[][] seats = new String[ROW_SIZE+1][LEFT_COL_SIZE + RIGHT_COL_SIZE+2];
   
    displayMenu(seats);
    // Initializes the entire array to open seats and then for loops after make the display menu
    //for(int i =0; i<seats.length; i++)
    //    for(int j=0; j<seats[i].length; j++)
    //        seats[i][j] = "" + OPEN_SEAT;
    
    //For loop to make heading for rows
    //for(int i=1; i<seats.length; i++)
    //    seats[i][0] ="" + (char)((int)'@'+i);
    
    // For loop to make heading for coloumns
    // for(int i=0; i<LEFT_COL_SIZE+1; i++)
    //    seats[0][i] = "" + i;
   // For loop to make the right column headers whilst skipping the aisle and numbering consecutively
   // for(int i=LEFT_COL_SIZE+1; i<LEFT_COL_SIZE+ RIGHT_COL_SIZE + 1; i++)
    //    seats[0][i+1] = "" + i;
   
    // For loop to make aisle 
    //for(int i =0; i<seats.length; i++)
    //    seats[i][LEFT_COL_SIZE+1] = "|";
    
   
    } // End of main
    
    public static void print(String m[][]){
        for(int i =0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");}
            System.out.println("");
        }
    
    } // End of print method
   
    public static void displayMenu(String seats[][]){
        Scanner keyboard = new Scanner(System.in);
        String seatTry = null;
        do{
            System.out.println("Welcome to our AirLine Seat Reservations");
            // Initializes the entire array to open seats and then for loops after make the display menu
            for (String[] seat : seats) 
                for (int j = 0; j < seat.length; j++) 
                    seat[j] = "" + OPEN_SEAT;
    
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
          
            print(seats);
            
            System.out.println("Please enter the row number and "
                    + "seat number you desire (Enter -1 to quit): ");
            // Stores whatever the person inputs as seat number
            seatTry = keyboard.nextLine();
            // Now I gotta figure out how to split the string into 2 parts based on the input,
            // and tell them to retry if a given input is not acceptable
            // maybe can use the valid seat choice method to do that and check seat availability
            // although that would not tell you the problem
            
        }
    while(!seatTry.equals("-1"));
    
    } // End of displayMenu method
    
} // End of class

/* General flow chart
What should be in main
Create 2D array + seat choice + initialize
returns a seat
validate the seat
and quit out if given an instruction
DisplayMenu
display table
Figure out how to add headers and
Cycle through 2D array + print current configuration
Prompt for seat choice + and store it
Check if seat is valid using the isValid method created
isValid
Quit? if yes quits out
Is length !=2, if true move on, if false give error and return false
Is coloumn# valid? if valid go next if not give error and return false
Is row# valid? no give error message 
if all conditions are met, return true
*/
