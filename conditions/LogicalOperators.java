package conditions;

public class LogicalOperators {
	public static void main (String[] args) {
		String a = "fly";
		if (a.contains("a")|| a.contains("e") ||a.contains("i")||a.contains("o")||a.contains("u")) {
			System.out.println("Vowels Exist");
		}
		else {
			System.out.println("Not Exist");

		}
	}


}
