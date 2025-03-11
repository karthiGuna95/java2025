package forLoop;

public class SingleOutput {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0 ; i <= 25 ; i++) {
			count = count + 1;
		} 
		System.out.println(count);
		
		int total = 0;
		for (int i = 1 ; i <= 5 ; i++) {
			total = total + i;
		}
		System.out.println(total);
		
		int fact = 1;
		for(int i = 1 ; i <= 5 ; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
