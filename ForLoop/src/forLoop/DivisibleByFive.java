package forLoop;

public class DivisibleByFive {
	public static void main(String[] args) {
		int num = 40;
		int count = 0;
		for(int i =1 ; i <= num ; i++) {
			if(i % 5 == 0) {
			count = count + 1;
			}
		}
		System.out.println(count);
		}
	}

