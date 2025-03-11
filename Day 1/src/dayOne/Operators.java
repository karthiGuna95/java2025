package dayOne;

public class Operators {
	public static void main(String[]args) {
		int a = 8;
		int b = 6;
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(c+" "+d+" " +e+" "+f+" "+g);
		System.out.println("Addition = "+c);
		System.out.println("Subraction ="+d);
		System.out.println("Multiplication ="+e);
		System.out.println("Division ="+f);
		boolean aMax = a>b;
		boolean bMax = b>a;
		System.out.print(bMax+"\n "+aMax);
		
		float a1 = 10.3f;
		float b1 = 4.7f;
		float c1 = a1+b1;
		float d1 = a1-b1;
		float e1 = a1*b1;
		float f1 = a1/b1;
		float g1 = a1%b1;
		System.out.println(c1+" "+d1+" "+e1+" "+f1+" "+g1);
		System.out.println("Addition ="+c1);
		System.out.println("Subraction ="+d1);
		System.out.println("Multiplication ="+e1);
		System.out.println("Division ="+f1);
		System.out.println("Percentage ="+g1);
		boolean a1Max = a1>b1;
		boolean b1Max = b1>a1;
		System.out.println(a1Max+"\n"+b1Max);		
	}
}
