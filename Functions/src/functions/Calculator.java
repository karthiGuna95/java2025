package functions;

public class Calculator {
	// void with parameter:
	public void addition(int a,int b) {
		System.out.println(a+b);
		}
	// void without parameter:
	public void subraction() {
		System.out.println(25-15);
		}
	// return type with parameter:
	public int multiplication(int a, int b) {
		return a*b;
		}
	// return type without parameter:
	public int division() {
		return(18/2);
		}
		
	//return type with 2 parameter:
	public int getmax(int e,int f) {
		if(e>f) {
			return e;
			}
		else {
			return f;
			}
		}
		
	// return type with 4 parameters:	
	public int getmax1(int a,int b,int c,int d) {
		if(a>b && b>c && c>d ) {
			return a;
		}
		else if(b>a && b>c && c>d ) {
			return b;
		}
		else if(c>a && c>b && c>d ) {
			return c;
		}
		else  {
				return d;
			}
		
		}
		
		//return type with 4 parameter to getsum:
	public int getsum(int[] a ) {
		int total=0;
		for(int i=0 ; i<a.length ;i++) {
			total=total+a[i];
		}
		return total;
		}
		
	//void type with parameter:	Even or Odd;
	public void evenorodd(int[] nums) {
		for(int i=0 ; i<nums.length ;i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i]+" even number");
			}
			else {
				System.out.println(nums[i]+" odd number");
				}
		}
	}

}
	

