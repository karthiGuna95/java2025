package taskStreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class frequency {
	public static void main(String[] args) {
		List<Integer>num=Arrays.asList(2,3,4,2,5,6,3,2,5,7,1);
		int count= Collections.frequency(num, 4);
		System.out.println(count);

		//Counts the number of times a specific element appears in a collection-------------->
		//Finding the occurrence of an element in a list.------------------>

	}
	

}
