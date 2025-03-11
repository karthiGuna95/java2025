package forLoop;

public class Character {
	public static void main(String[] args) {
		String s = "watch";
		for(int i = 0 ; i < s.length() ; i++) {
			if(i % 2 == 0) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
