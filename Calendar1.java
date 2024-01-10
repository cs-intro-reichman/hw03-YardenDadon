/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
		int sundayCounter = 0;
	 	while (year != 2000) {
	 		if (dayOfWeek == 1){
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
				if (dayOfMonth == 1) {
					sundayCounter++;
				}
			}else {
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}
			advance();		
		}
		System.out.println("During the 20th century, " + sundayCounter + " Sundays fell on the first day of the month");
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		dayOfMonth++;
		dayOfWeek++;
		if (dayOfMonth > nDaysInMonth(month, year)){
			dayOfMonth = 1; 
			month++;
		}
		if (month > 12){
			month = 1; 
			year++;
		}
		if (dayOfWeek > 7){
			dayOfWeek = 1;
		}
	}
	private static boolean isLeapYear(int year) {
		boolean leapTruthFalse;
	    if (year % 4 == 0){ leapTruthFalse = true;}
		else {leapTruthFalse = false;}
		return leapTruthFalse;
	}
	private static int nDaysInMonth(int month, int year) {
		int days = 0;
		if (isLeapYear(year) == true){
			switch(month){
				case 1: days = 31;
				break;
				case 2: days = 29;
				break;
				case 3: days = 31;
				break;
				case 4: days = 30;
				break;
				case 5: days = 31;
				break;
				case 6: days = 30;
				break;
				case 7: days = 31;
				break;
				case 8: days = 31;
				break;
				case 9: days = 30;
				break;
				case 10: days = 31;
				break;
				case 11: days = 30;
				break;
				case 12: days = 31;
				break;
			}
		}
		else {
			switch(month){
				case 1: days = 31;
				break;
				case 2: days = 28;
				break;
				case 3: days = 31;
				break;
				case 4: days = 30;
				break;
				case 5: days = 31;
				break;
				case 6: days = 30;
				break;
				case 7: days = 31;
				break;
				case 8: days = 31;
				break;
				case 9: days = 30;
				break;
				case 10: days = 31;
				break;
				case 11: days = 30;
				break;
				case 12: days = 31;
				break;
			}
		}		
		return days;
	}
}