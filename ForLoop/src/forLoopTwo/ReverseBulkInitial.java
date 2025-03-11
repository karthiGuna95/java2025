package forLoopTwo;

public class ReverseBulkInitial {
	public static void main(String[] args) {
		
		int[] nums = {24,6,80,92,71,62};
		
		for(int i = nums.length-1 ; i >= 0 ; i--) {
			
			System.out.println(nums[i]);
		}
	}

}
