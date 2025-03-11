package forLoopThree;

public class ArmstrongNumbers {
	public static void main(String[] args ) {
		int num = 153;
		int temp = num;
		int arm = 0;
		while(num > 0) {
			int a = num % 10;
			arm = arm+(a*a*a);
			num = num/10;
		}
		if(temp == arm) {
		System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
}
