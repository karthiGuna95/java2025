package taskStreamApi;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findTheDuplicateCharacter {
	public static void main(String[] args) {
        String a = "Nishanthi";
        
		Set<Character> duplicate = new HashSet<>();
		
		List<Character> DuplicateValue = a.chars()
										.mapToObj(c->Character.toUpperCase((char)c))		//
										.filter(f->!duplicate.add(f))		// Checks if the character is already present in the Set
										.collect(Collectors.toList());
		
		System.out.println("Duplicate characters: "+DuplicateValue);
    }

}
