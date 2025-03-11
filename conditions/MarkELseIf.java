package conditions;

public class MarkELseIf {
	public static void main (String[] args) {
		int m = 99;
		if (m <= 100 && m >= 90) {
		System.out.println("A");
	}
		else if (m <90 && m >= 80) {
			System.out.println("B");
		}
		else if (m < 80 && m>=60) {
			System.out.println("C");
		}
		else if(m<60 && m>=35) {
			System.out.println("D");
		}
		else if(m<35 && m>=0) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid");

		}
	}

}
