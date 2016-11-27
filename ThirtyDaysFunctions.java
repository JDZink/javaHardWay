import static java.lang.System.out;
import java.util.Scanner;

/**
* Contains functions that make it easier to work with months.
*/
public class ThirtyDaysFunctions {
	public static void main( String[] args ) {
		Scanner kb = new Scanner(System.in); 
		
		System.out.print( "Which month? (1-12) " );
		int month = kb.nextInt();
		
		System.out.println(monthDays(month) + " days hath " + monthName(month));
	}
	
	/**
	*Returns the name for the a given month number (1-12)
	*
	*@author Graham Mitchell
	*@param month	the month number (1-12)
	*@return		the English name of the month, or "error" if out of range
	*/
	public static String monthName( int month ) { 
		String monthName = "error";
	
		switch(month) {
			case 1: monthName = "January";
					break;
			case 2: monthName = "February";
					break;
			case 3: monthName = "March";
					break;					
			case 4: monthName = "April";
					break;
			case 5: monthName = "May";
					break;
			case 6: monthName = "June";
					break;
			case 7: monthName = "July";
					break;
			case 8: monthName = "August";
					break;
			case 9: monthName = "September";
					break;
			case 10: monthName = "October";
					break;
			case 11: monthName = "November";
					break;
			case 12: monthName = "December";
					break;
			default: monthName = "error";
		}
		return monthName;
	}
	/**
	*Returns the number of days in a given month
	*
	*@author Graham Mitchell
	*@param month	the month number (1-12)
	*@return		the number of days in the month, or 31 if out of range
	*/
	public static int monthDays(int month) {
		int days;
		/* 	Thirty days hath September
      			April, June and November
			All the rest have thirty-one
  				Except the second month alone.... */
		switch(month) {
			case 9:
			case 4:
			case 6:
			case 11: days = 30;
					break;
			case 2: days = 28;
					break;
			default: days = 31;
		}
		return days;
	}
	
}

	
			
		