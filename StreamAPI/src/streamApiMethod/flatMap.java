package streamApiMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap {
	public static void main(String[] args) {
		List<Integer> num1 = Arrays.asList(10,20,30);
		List<Integer> num2 = Arrays.asList(40,50,60);
		List<List<Integer>> num3 = Arrays.asList(num1,num2);
		System.out.println(num3);
		
		List<Integer> nums = num3.stream().flatMap(f->f.stream()).collect(Collectors.toList());
		System.out.println(nums);
		
		
	}
}
