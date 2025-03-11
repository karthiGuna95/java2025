package forLoopTwo;

public class PrintOnlyOdd {
	public static void main(String[] args) {
		
		int[] nums = {41,5,87,92,71,62};
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(i % 2 == 0) {
				continue;
			}
		System.out.println(nums[i]);
		}
	}
}
