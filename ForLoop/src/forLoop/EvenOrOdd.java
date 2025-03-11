package forLoop;

public class EvenOrOdd {
	public static void main(String[] args) {
		for (int a = 150 ; a <= 250; a++ ) {
			if(a % 2 == 0) {
				System.out.println(a+" even");
			}
		else {
				System.out.println(a+" odd");
			}
		}
	}
}
