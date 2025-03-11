package functions;

public class FindUpperCaseAndLowerCase {
	public static void main(String[] args) {
		String a="Geetha";
		String b="Reshrishi";
		System.out.println("Before Converting: "+a);
		System.out.println("Before Converting: "+b);
		System.out.println();
		convertUpperLower(a,b);

	}

	public static void convertUpperLower(String a, String b) {
		String concate=a.toLowerCase().concat(b.toUpperCase());
		String rev1="";
		for(int i=concate.length()-1;i>=0;i--) {
			  rev1=rev1+concate.charAt(i);
		}
		System.out.println("After Converting: "+rev1);
		
	}

		
}
