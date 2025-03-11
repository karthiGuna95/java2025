package taskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sumAllValuesAndPrintInFloat {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10,11,12,13);
		Integer sum =num.stream().collect(Collectors.summingInt(x->x.intValue()));
		float f = sum.floatValue();
		System.out.println(f);

	}

}
