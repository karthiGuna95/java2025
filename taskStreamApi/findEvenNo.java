package taskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findEvenNo {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,20,30,07,9);
		List<Integer> even = li.stream().filter(f->f %2 == 0).collect(Collectors.toList());
		System.out.println(even);
	}

}
