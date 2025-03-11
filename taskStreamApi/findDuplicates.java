package taskStreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicates {
	public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 10, 25, 30);
        
	        Set<Integer> numb = new HashSet<>();
	        Set<Integer> duplicates = nums.stream()
	                                      .filter(n -> !numb.add(n))	// Checks if the number is already present in the Set
	                                      .collect(Collectors.toSet());		//join to form 

	        System.out.println("Duplicate values: " + duplicates);
	        
	        
	        //Remove duplicate
	        List<Integer>rmo=nums.stream()
	        						.distinct()	//used to remove repeated values
	        						.collect(Collectors.toList());
	        
	        System.out.println("Removed Duplicate values: " + rmo);
	    }
	}

