package taskStreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class removeOneCharacter {
	public static void main(String[] args) {
		String a = "Karthi";
		char toRemove='K';
		String name = a.chars()		//Convert String to IntStream
				.mapToObj(m->(char)m)		//convert int to char object
				.filter(f->f != toRemove)		//removing the character using filter
				.map(String::valueOf)		//mapping the string value
				.collect(Collectors.joining());		//join to form a new String
		
		System.out.println(name);
	}
/*
	String result = input.chars()  // Convert String to IntStream
            .filter(c -> c != charToRemove) // Filter out the character
            .mapToObj(String::valueOf) // Convert each character to a String
            .collect(Collectors.joining()); // Join to form a new string

    System.out.println(result); // Output: "heo"
}*/
}
