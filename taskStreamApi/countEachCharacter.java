package taskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countEachCharacter {
	public static void main(String[] args) {
		String a = "cricket";
		Map<Character,Long> c = a.chars()
								.mapToObj(m->(char)m)
								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(c);
		
		Long ch=a.chars()
				.mapToObj(cc->(char)cc)
				.collect(Collectors.counting());
		
		System.out.println(ch);

	}

}

