package reviewStudy;

public class PrimeNumber {
	public static void main(String[] args ) {
//		String[] s = {"1,100"};
		int value1 = 1;
		int value2 = 100;
		int count = 0;
		for(int i=value1 ; i <=value2 ; i++) {
			boolean isPrime = true;
			for(int j=2 ; j<i ; j++) {
				if(i % j == 0) {
					isPrime=false;
				}
			}
			if(isPrime && i != 1) {
				count++;
				System.out.println(i+" "+count);
			}
		}
		
	}

}
