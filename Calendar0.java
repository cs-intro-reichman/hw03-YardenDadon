/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap;
		if (isLeapYear(year) == true) {commonOrLeap = "leap";}
		else {commonOrLeap = "common";}

		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int i = 0; i < 12; i++){
			int monthValue = i + 1;
			System.out.println("Month " + monthValue + " has " + nDaysInMonth(i, year) + " days");
		}
	}
	public static boolean isLeapYear(int year) {
		boolean leapTruthFalse;
	    if (year % 4 == 0){ leapTruthFalse = true;}
		else {leapTruthFalse = false;}
		return leapTruthFalse;
	}
	public static int nDaysInMonth(int month, int year) {
		//use switch cases, and call isLeapYear
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