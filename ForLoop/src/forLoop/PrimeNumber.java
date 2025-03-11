package forLoop;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 5;
		boolean b = true;
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				b = false;
			}
		}
		if(b == true ) {
			System.out.print("Prime Number");
		}
		else {
			System.out.print("Not Prime Number");
		}
	}

}
