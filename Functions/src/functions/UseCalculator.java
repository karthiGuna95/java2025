package functions;

public class UseCalculator {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
	// void with parameter:
		cal.addition(10,20);
		
	// void without parameter:
		cal.subraction();
		
	// return type with parameter:
		System.out.println(cal.multiplication(10,22));
		
	// return type without parameter:
		System.out.println(cal.division());
		
	//return type with 2 parameter:
		System.out.println(cal.getmax(100,54));
		
	// return type with 4 parameters:	
		System.out.println(cal.getmax1(24,55,18,96));
		
	//return type with 4 parameter to getSum:
		int[] nums = {10,54,84,64,24};
		System.out.println(cal.getsum(nums));
		
	//void type with parameter:Even or Odd;
		int[] nums1 = {24,54,87,2,5,99};
		cal.evenorodd(nums1);
	}

}
