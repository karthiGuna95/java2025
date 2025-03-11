package taskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sumOfEvenNumbers {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,11,12,13,14,15);
		Integer evenNum= nums.stream().filter(f->f % 2 == 0).collect(Collectors.summingInt(s->s));
		System.out.println(evenNum);
	}

}
