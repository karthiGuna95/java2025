package forLoop;

public class Palindrome {
	public static void main(String[] args) {
		String name = "civic";
		String rev = "";
		for(int i = name.length()-1 ; i >= 0 ; i--) {
			rev = rev + name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
