package taskJava8;

public class MyCal {
	public void getEven(int a[]) {
		for(int num : a) {
			if(num % 2 == 0) {
				System.out.println(num+" ");
			}
		}
	}
	
	public void getOdd(int []a) {
		for(int num : a) {
			if(num % 2 != 0) {
				System.out.println(num+" ");
			}
		}
	}
	
	public void getMax(int []a) {
		int max = a[2];
		for(int num : a) {
			if(num>max) {
				max = num;
			}
		}
		System.out.println("MaxValue:"+max);
	}
	
	public void getMin(int []a) {
		int min = a[1];
		for(int num : a) {
			if(num<min) {
				min=num;
			}
		}
		System.out.println("MinValue:"+min);
	}
	
	public void getTotal(int []a) {
		int total =0;
		for(int num : a) {
			total=total+num;
		}
		System.out.println("TOTAL:"+total);
	}
}
