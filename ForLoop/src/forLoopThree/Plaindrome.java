package forLoopThree;

public class Plaindrome {
	public static void main(String[] args ) {
		int num = 959;
		int temp = num;
		int reversed = 0;
		while(num > 0) {
			int a = num % 10;
			reversed = (reversed*10) + a;
			num = num/10;
		}
		if(temp == reversed) {
		System.out.println(temp+"is Palindrome");
		}
		else {
			System.out.println(temp+"is Not Palindrome");
		}
	}
}

