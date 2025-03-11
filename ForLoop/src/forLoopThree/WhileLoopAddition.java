package forLoopThree;

public class WhileLoopAddition {
	public static void main(String[] args ) {
	int num = 124;
	int total = 0;
	while(num > 0) {
		int a = num % 10;
		total = total + a;
		num = num/10;
	}
	System.out.println(total);
	}
}

