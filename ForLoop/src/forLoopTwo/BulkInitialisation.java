package forLoopTwo;

public class BulkInitialisation {
	public static void main(String[] args) {
		int [] nums = {24,6,80,92,71,62};
	
		for(int i = 0 ; i < nums.length ; i++) {
			
		System.out.println(nums[i]);
		}
		
//		enchanced forLoop
		
		for(int a : nums) {
			System.out.println(a);

		}
	}
}
