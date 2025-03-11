package oopsPolymorphismMethodOverLoading;

public class UseCal {
	public static void main(String[] args) {
		Cal c=new Cal();
		System.out.println(c.getSum(10,20));
		System.out.println(c.getSum(11,12,13));
	}

}
	class Cal {
		public int getSum(int a,int b) {
			return a+b;
		}
		public int getSum(int a,int b,int c ) {
			return a+b+c;
		}

	}
