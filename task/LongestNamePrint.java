package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestNamePrint {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Karthi","Manoj","Poovarasan","Jeeva");
		 int maxLength = names.stream()
                 .mapToInt(String::length) // Convert Stream<String> to IntStream
                 .max()                    // Find the max length
                 .orElse(0);
		 // Find the name(s) with the maximum length
	        Optional<String> longestName = names.stream()
	                                            .filter(name -> name.length() == maxLength) // Filter names with max length
	                                            .findFirst(); // Get the first longest name (can be modified for multiple)

	        // Print the result
	        longestName.ifPresent(name -> System.out.println("Longest Name: " + name));
	        
	        
		List<String> longestNames = names.stream()
                .filter(name -> name.length() == maxLength)
                .collect(Collectors.toList());

System.out.println("Longest Names: " + longestNames);
	}

}
