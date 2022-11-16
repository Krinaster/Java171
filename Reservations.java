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
   
    } // End of main
    
    public static void print(String m[][]){
        for(int i =0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.printf("%-4s", m[i][j]);}
            System.out.println("");
        }
    
    } // End of print method
   
    public static void displayMenu(String seats[][]){
        Scanner keyboard = new Scanner(System.in);
        String seatTry = null;
        String[] STRING_SPLITTER = new String[2];
        boolean exit = false;
        Random rand = new Random();
        
        System.out.println("Welcome to our AirLine Seat Reservations");
            System.out.println();
            // Initializes the entire array to open seats and then for loops after make the display menu
            for (String[] seat : seats) 
                for (int j = 0; j < seat.length; j++) 
                    seat[j] = "" + OPEN_SEAT;
            // Randomizes seat arrangement
           // for(int i =0; i<seats.length; i++)
            //    for(int j=0; j<seats[i].length; j++){
            //        int k = rand.nextInt(100)+1;
            //        if(k% 2 == 0)
            //            seats[i][j] = "" + SEAT_TAKEN;
            //        else
            //            seats[i][j] = "" + OPEN_SEAT;
            //    }
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
            
            for(int i= 0; i<STRING_SPLITTER.length; i++)
                System.out.println(STRING_SPLITTER[i]);
            
            
            // Troubleshooting print statements to check STRING_SPLITTER
            //System.out.println(STRING_SPLITTER[0].charAt(0)-64);
            //System.out.println(Integer.parseInt(STRING_SPLITTER[1])+1);
            //System.out.println(seats[STRING_SPLITTER[0].charAt(0)-64][Integer.parseInt(STRING_SPLITTER[1])+1]);
            
            if(isValid(STRING_SPLITTER, seats) == false)
                System.out.println("Invalid seat, please enter a valid seat");
            else
                seats[convertRow(STRING_SPLITTER)][convertColumn(STRING_SPLITTER)] = "" + SEAT_TAKEN;
            // Redisplay table with updated prompts
            
        }
    while(!exit == true);
    
    } // End of displayMenu method
    // Need to figure out if else statement to add 1 to the index when past the aisle
    // When figuring out whether the seat is takne or not
    public static boolean isValid(String[] o, String[][] m){
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
    
    public static int convertRow(String[] o){
        return o[0].charAt(0) - 64;
    }
    
    public static int convertColumn(String[] o){
        int a = 0;
        if(Integer.parseInt(o[1]) >= LEFT_COL_SIZE + 1)
            a = Integer.parseInt(o[1]) + 1;
        else
            a = Integer.parseInt(o[1]);
        return a;
    }

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
