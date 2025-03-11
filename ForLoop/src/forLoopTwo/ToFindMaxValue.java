package forLoopTwo;

public class ToFindMaxValue {
	public static void main(String[] args) {
		int[] nums = {52,12,54,72,5,89};
		int max = nums[0];
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] > max) {
			max = nums[i];
		}
	}
		System.out.println(max);
	}
}
		
