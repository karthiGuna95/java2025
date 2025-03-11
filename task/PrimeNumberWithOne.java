package task;

public class PrimeNumberWithOne {
	public static void main(String [] args) {
		int num = 7;
//		int count = 0;
		boolean b= true;
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
//				count = count+1;
				
				b = false;
			}
		}
		if(b == true) {
			System.out.println("not prime");
			
		}
		else {
			System.out.println("prime");
		}
		
	}

}
