package forLoopTwo;

public class IndividualInitialization {
	public static void main(String[] args) {
		int [] nums = new int[5];
		nums[0] = 45;
		nums[1] = 92;
		nums[2] = 39;
		nums[3] = 65;
		nums[4] = 87;
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
		
//		forreverse print in same input
		
//		for(int i = nums.length-1 ; i >= 0 ; i--) {
//			System.out.println(nums[i]);
//
//		}
	}
}
