package reviewStudy;

public class SecondLargest {
	public static void main(String[] args) {
		int[] nums = {52,63,74,85,96};
		int max = nums[0];
		int sec = max;
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i] > max) {
				sec = max;
				max = nums[i];
			}
			if(nums[i] > sec && nums[i] != max) {
				sec = nums[i];
			}
		}
		System.out.println(sec);
	}

}
