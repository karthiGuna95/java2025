package functions;

public class isLeapYearOrNot {
	public static void main(String[] args) {
		int year = 2026;
		System.out.println("Is Leap Year: " + isLeapYear(2026));

	}
	
	public static boolean isLeapYear(int year) {
	    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

}
