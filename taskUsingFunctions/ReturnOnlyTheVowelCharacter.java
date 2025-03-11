package taskUsingFunctions;

import java.util.List;
import java.util.stream.Collectors;

public class ReturnOnlyTheVowelCharacter {
	public static void main(String[] args) {
		String name = "Karthi";
		ReturnTheVowels vowels = new ReturnTheVowels();		//creating an object
		System.out.println("VOWELS: "+vowels.getVowels(name));		//print using methodname
	} 
}
		
class ReturnTheVowels {
	public String getVowels(String name) {
			return name.chars()			 // Convert String to IntStream
					.mapToObj(o->(char)o)		// Convert IntStream to Character
					.filter(c -> (char)c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||c=='a'|| c=='e' || c=='i' || c=='o'||c=='u')	//check the vowels is present or not
					.map(String::valueOf)		//Convert Character to String
					.collect(Collectors.joining(","));		// Join filtered vowels into a single string
		}
		
	}

