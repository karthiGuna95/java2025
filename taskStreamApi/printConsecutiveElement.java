package taskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printConsecutiveElement {
	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer>cons=nums.stream()
				.filter(x->x != 4 && x != 8 && x != 10)
				.collect(Collectors.toList());
		
		System.out.println(cons);

	}

}
