package taskStreamApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class totalCountAndRepeatedCount {
	public static void main(String[] args) {
		String a="Capgemini";
		long count=a.chars().mapToObj(c->(char)c).count();
		System.out.println("Total Count: "+count);
		
		Map<Object, Long> count1=a.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(gb->gb.charValue(),Collectors.counting()));
		System.out.println(count1);
		
		Map<Object, Object> repeatedChars = count1.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Repeated Characters: " + repeatedChars);
		
	}

}
