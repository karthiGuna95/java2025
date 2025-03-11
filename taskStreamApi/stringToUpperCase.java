package taskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringToUpperCase {
	public static void main(String[] args) {
		        List<String> words = Arrays.asList("aaa", "xxx", "abd", "heg", "ikl");

		        List<String> upperCase = words.stream()
		            .map(String::toUpperCase)
		            .collect(Collectors.toList());

		        System.out.println(upperCase);
	}
	

}
