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
		int sundayCounter = 0;
	 	while ((year != 2000) == true) {
	 		System.out.print(dayOfMonth + "/" + month + "/" + year);
			 if (dayOfWeek == 1 && dayOfMonth == 1) {sundayCounter++;}
			 if(dayOfWeek == 1) {System.out.print(" Sunday");}
			 System.out.println();
	 		 advance();
	 		if (year == 2000) {break;}
        }
		System.out.println("During the 20th century, " + sundayCounter + " Sundays fell on the first day of the month");
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && dayOfMonth == 31) {
			month++;
			dayOfMonth = 1;
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && dayOfMonth == 30) {
			month++;
			dayOfMonth = 1;
		} else if (month == 12 && dayOfMonth == 31) {
			month = 1;
			dayOfMonth = 1;
			year++;
		} else if (!isLeapYear(year) && month == 2 && dayOfMonth == 28) {
			month++;
			dayOfMonth = 1;
		} else if (isLeapYear(year) && month == 2 && dayOfMonth == 29) {
			month++;
			dayOfMonth = 1;
		} else {
			dayOfMonth++;}
		dayOfWeek = (dayOfWeek % 7) + 1;  
		
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
				case 0: days = 31;
				break;
				case 1: days = 29;
				break;
				case 2: days = 31;
				break;
				case 3: days = 30;
				break;
				case 4: days = 31;
				break;
				case 5: days = 30;
				break;
				case 6: days = 31;
				break;
				case 7: days = 31;
				break;
				case 8: days = 30;
				break;
				case 9: days = 31;
				break;
				case 10: days = 30;
				break;
				case 11: days = 31;
				break;
			}
		}
		else {
			switch(month){
				case 0: days = 31;
				break;
				case 1: days = 28;
				break;
				case 2: days = 31;
				break;
				case 3: days = 30;
				break;
				case 4: days = 31;
				break;
				case 5: days = 30;
				break;
				case 6: days = 31;
				break;
				case 7: days = 31;
				break;
				case 8: days = 30;
				break;
				case 9: days = 31;
				break;
				case 10: days = 30;
				break;
				case 11: days = 31;
				break;
			}
		}		
		return days;
	}
}