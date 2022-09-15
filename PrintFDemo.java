import java.text.DecimalFormat;

public class PrintFDemo {

	public static void main(String [] args) {
		
		double hourlyWage = 20.50;
		System.out.println(hourlyWage);
		System.out.printf("Hourly wage is $%.2f\n", hourlyWage);
		
		// Using multiple flags within the printf (which is % then letter)
		// Each flag must have a corresponding value, so the first $% corresponds with first hourlywage
		// Second $% correspoonds with the 1.5 * hourlyWage
		System.out.printf("Hourly wage is $%.2f with overtime of $%.2f.\n", 
			hourlyWage, 1.5 * hourlyWage);
		
		// Using printf to display tables
		String time1 = "9:00 - 9:50";
		String time2 = "10:00 - 10:50";
		String time3 = "12:00 - 12:50";
		String time4 = "1:00 - 2:25";
		
		String class1 = "Java I", class2 = "Calculus I",
			class3 = "College Algebra", class4 = "Calculus II",
			room1 = "BCMC-2183", room2 = "BCMC-2103",
			room3 = "BCMC-1002", room4 = "BCMC-1360";
		
		// %- aligns with left instead of right, %number indicates number of spaces for each string, 
		// and %s indicates a string
		System.out.printf("\n%-17s%-18S%-12s\n%-17s%-18S%-12s\n%-17s%-18S%-12s\n%-17s%-18S%-12s\n", time1, class1, room1, time2, class2, room2, time3, class3, room3, time4, class4, room4);
	
	
		// Cafeteria prices tables   items flush on left prices flush on right
		String item1 = "Apple", item2 = "Slice of Pizza x4", 
			item3 = "Bag of Chips", item4 = "Large Drink";
		double price1 = .75, price2 = 20, price3 = 1.25, price4 = 3.5;
		
		System.out.printf("\n%-25S$%10.2f\n", item1, price1);
		System.out.printf("%-25S$%10.2f\n", item2, price2);
		System.out.printf("%-25S$%10.2f\n", item3, price3);
		System.out.printf("%-25S$%10.2f\n", item4, price4);
		
		// Suppose didn't like the spacing between $ and the amount...
		
		DecimalFormat moneyFormat = new DecimalFormat("$#,##0.00");
		
		// Using decimalformat
		
		System.out.printf("\n%-25S%10s\n", item1, moneyFormat.format(price1));
		System.out.printf("%-25S%10s\n", item2, moneyFormat.format(price2));
		System.out.printf("%-25S%10s\n", item3, moneyFormat.format(price3));
		System.out.printf("%-25S%10s\n", item4, moneyFormat.format(price4));
		
			
	}
	
}