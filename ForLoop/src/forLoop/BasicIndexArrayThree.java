package forLoop;

public class BasicIndexArrayThree {
	public static void main(String[] args) {
		String word = "onesoft";
		for(int i = 0 ; i < word.length() ; i++) {
			System.out.println(word.substring(0, i));
		}
	}

}
