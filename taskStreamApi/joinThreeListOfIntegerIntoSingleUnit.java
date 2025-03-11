package taskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joinThreeListOfIntegerIntoSingleUnit {
	public static void main(String[] args) {
			List<Integer>num1=Arrays.asList(1,2,3,4,5,6);
			List<Integer>num2=Arrays.asList(7,8,9,10,11);
			List<Integer>num3=Arrays.asList(12,13,14,15);
			
			List<List<Integer>>num=Arrays.asList(num1,num2,num3);
			
			List<Integer>join=num.stream().flatMap(x->x.stream()).collect(Collectors.toList());
			
			System.out.println(join);
			System.out.println(num);
	}

}
