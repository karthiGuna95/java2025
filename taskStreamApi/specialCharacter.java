package taskStreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class specialCharacter {
	public static void main(String[] args) {
		String a = "!123#";
		List<Character> ch = a.chars()
				.mapToObj(c -> (char) c)
				.filter(c -> !Character.isLetterOrDigit(c))
				.collect(Collectors.toList());
		
		System.out.println(ch);
	}
}