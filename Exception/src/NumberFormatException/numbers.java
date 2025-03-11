package NumberFormatException;


public class numbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a/b);
		int c=0;
	try {
		int d=b/c;
	}
	catch(ArithmeticException ae) {
		//System.out.println(ae);
		System.out.println(ae.getMessage());
		//ae.printStackTrace();
	}
	finally {
		System.out.println("a");
	}
	}

}
