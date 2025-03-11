package forLoopTwo;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		int [] nums = {24,6,80,92,71,62};
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] % 2 == 0) {
				
				System.out.println(nums[i]+" even");
			}
			else {
				System.out.println(nums[i]+" odd");
			}
		}
	}

}
