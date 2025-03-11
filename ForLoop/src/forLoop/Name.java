package forLoop;

public class Name {
	public static void main(String[] args) {
		String a = "Rolex watch";
		for (int i = 0 ; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		for (int i = a.length()-1 ; i < a.length() ; i--) {
			System.out.println(a.charAt(i));
		}
	}

}
