package taskStreamApi;

import java.util.Arrays;
import java.util.List;

public class parallel {
	public static void main(String[] args) {
		List<String>name=Arrays.asList("jeeva","thiru","dinesh");
		
		name.parallelStream().forEach(x->System.out.println(x));

	}

}
