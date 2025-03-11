package reviewStudy;

public class AmstrongNumber {
	public static void main(String[] args) {
	String s = "452";
	int num = Integer.parseInt(s);
	int temp = num;
	int arm = 0;
//	using for loop:			// using While loop:
	for(; num>0 ;) {	// while(num > 0) {
		int a = num % 10;
		arm = arm + (a*a*a);
		num = num/10;
	}
	if(temp == arm) {
		System.out.println(temp+" is Amstrong");
		}
	else {
		System.out.println(temp+" is not Amstrong");
	}
	}
}
