package taskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class countingStream {
	public static void main(String[] args) {
		List<String>name=Arrays.asList("jeeva","manoj","karthi","poovu");
		long count = name.stream().collect(Collectors.counting());
		System.out.println(count);
		long count1 = name.stream().count();
		System.out.println(count1);

	}

}
