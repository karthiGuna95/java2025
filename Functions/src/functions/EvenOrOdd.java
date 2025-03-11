package functions;

public class EvenOrOdd {
	public void evenorodd(int[] nums) {
		for(int i=0 ; i<nums.length ;i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i]+"even number");
			}
			else {
				System.out.println(nums[i]+"odd number");

			}
		}
	}

}
