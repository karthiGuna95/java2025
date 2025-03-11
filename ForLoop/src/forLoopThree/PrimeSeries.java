package forLoopThree;

public class PrimeSeries {
	public static void main(String[] args ) {
		for(int i=100 ; i <= 200 ; i++) {
			boolean isPrime = true;
			for(int j=2 ; j < i ; j++) {
				if(i % j == 0) {
				isPrime = false;	
				}
			}
			if(isPrime) {
				System.out.println(i+" Prime Number");
			}
//			else {
//				System.out.println(i+" Not Prime Number");
//				}
//			}
		}
	}
}

