
package reservations;


public class Reservations {
    
    public static final int NUM_ROWS = 25;
    public static final int NUM_COLOUMNS = 6;
    
    public static void main(String[] args) {
       
    int seats[][] = new int[NUM_ROWS][NUM_COLOUMNS];
    
    
    // This finds the coloumn that you want to have as the aisle, and turns all the values into 1's
      for(int i =0; i<seats.length; i++)
        seats[i][3] = 1;
        
    print(seats);
    } // End of main
    
    public static void print(int m[][]){
    
    for(int i =0; i<m.length; i++){
        for(int j=0; j<m[i].length; j++){
            System.out.print(m[i][j]);}
        System.out.println("");
        }
    } // End of print method
    
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
