package taskStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMax {
	public static void main(String[] args) {
		List<Integer>nums = Arrays.asList(10,20,30,40,50);
		int secMax = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Max is:"+secMax);
		
	}
}
