package taskStreamApi;

import java.util.Arrays;
import java.util.List;

public class removeDuplicate {
	public static void main(String[] args) {
		int []nums = {2,2,4,4,6,6,2,7,1,3,9};
		int []duplicate=Arrays.stream(nums)
					.distinct().toArray();
			System.out.println(Arrays.toString(duplicate));
		}	

}
