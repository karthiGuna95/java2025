package taskStreamApi;

public class findTheLettersCount {
	public static void main(String[] args) {
		String a="I am coding";
		long lettercount = a.chars().filter(Character::isLetter).count();
		System.out.println(lettercount);

	}

}
