package forLoopThree;

public class PrintThePairsOfAddedValue {
	public static void main(String[] args) {
		int[] nums = {2,3,4,5,6,7,8};
		int count = 0; //(find the count and pairs of two added value):

		for(int i=0 ; i<nums.length ; i++) {
		//	boolean isDigit = true;
			for(int j=i+1 ; j<nums.length ; j++) {
				if(nums[i]+nums[j] == 10) {
					
			//		isDigit = false;
					count++;
				System.out.println(nums[i]+","+nums[j]);
				}
			}
		}
		System.out.println(count);

	}
}

