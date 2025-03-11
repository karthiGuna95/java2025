package taskUsingFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumofInteger {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,5,4,8,9);
		Sum sum = new Sum();
		System.out.println(sum.summingInteger(num));
	}

}
class Sum {
	public int summingInteger (List<Integer> num ){
		int nums = num.stream().collect(Collectors.summingInt(s->s));
		return nums;
	}
}