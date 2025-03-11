package forLoop;

public class PrintAllCharacter {
	public static void main(String[] args) {
		String a = "LanGuagE#123@";
		for(int i = 0 ; i < a.length() ; i++) {
			if(a.charAt(i) > 'A' && a.charAt(i) < 'Z') {
				System.out.println(a.charAt(i)+"-UC");
			}
			else if (a.charAt(i) > 'a' && a.charAt(i) < 'z') {
				System.out.println(a.charAt(i)+"-LC");
			}
			else if(a.charAt(i) > '!' && a.charAt(i) < '*') {
				System.out.println(a.charAt(i)+"-SC");
			}
			else if (a.charAt(i) > '0' && a.charAt(i) < '9') {
				System.out.println(a.charAt(i)+"-num");
			}
			else {
				System.out.println(a.charAt(i)+"-Sym");
			}
		}
	}

}