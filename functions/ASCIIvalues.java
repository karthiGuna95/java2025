package functions;

public class ASCIIvalues {
	public static void main(String[] args) {
		String a="Geetha";
		Ascii(a);

	}
	public static void Ascii(String a) {
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			int c=b[i];
			System.out.println(b[i]+" Ascii value is:"+c);
		}
		
		
	}
//	public static int getAsciiValue(char ch) {
//	    return (int) ch;
//	}

}
