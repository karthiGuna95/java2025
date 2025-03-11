package forLoopThree;

public class SecondLargest {
 	public static void main(String[] args) {
 		int[] nums = {10,20,30,40,50};
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
