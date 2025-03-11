package taskStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class thirdMax {
	public static void main(String[] args) {
		List<Integer>nums = Arrays.asList(10,20,30,40,50);
		int thirdMax = nums.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println("Second Max is:"+thirdMax);
		
	}


}
