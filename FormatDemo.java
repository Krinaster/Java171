
import java.text.DecimalFormat;


public class FormatDemo {
	
	private static final double PI = 3.1415926653589793238;
	private static final double TUITION_PER_HOUR = 118;
	public static void main(String [] args) {
		
		// f in printf meaning flags
		// and speciifcally in java there is the DecimalFormat class
		
		DecimalFormat defFormat = new DecimalFormat();
		DecimalFormat myFormat  = new DecimalFormat("#.000000");
		DecimalFormat moneyFormat = new DecimalFormat("$#,###.00");
		DecimalFormat percentFormat = new DecimalFormat("#.0%");
		
		// Printing without formatting
		System.out.println("Pi = " + PI);
	
		// Printing with default DecimalFormat
		System.out.println("Pi = " + defFormat.format(PI));
		
		// Printing with our format to six decimal precision
		System.out.println("Pi = " + myFormat.format(PI));
		
		//Print tutition through the money formatter and default
		System.out.println("Cost = " + TUITION_PER_HOUR + ".");
		System.out.println("Cost = " + moneyFormat.format(TUITION_PER_HOUR) + ".");
		System.out.println("Cost = " + 
			moneyFormat.format(TUITION_PER_HOUR * 18000.33) + ".");
			
			// Run a percentage through a decimal formatter
			System.out.println("Percent Increase = " + 
				percentFormat.format((1.09 - .88)/.88));
			System.out.println("Percent Increase = " +
				(1.09 - .88)/.88 * 100 + "%.");
		
	
	}
}