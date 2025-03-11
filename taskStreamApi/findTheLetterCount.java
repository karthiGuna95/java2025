package taskStreamApi;

import java.util.stream.Collectors;

public class findTheLetterCount {
	public static void main(String[] args) {
		String a = "I am coding";
		
		long count = a.chars()
				.filter(Character::isLetter)
				.count();
		System.out.println(count);
	}

}
