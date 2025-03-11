package dayThree;

public class ComaSeperator {
	public static void main(String[]args) {
		
//		String[] a = args[0].split(",");
//		int num1 = Integer.parseInt(a[0]);
//		int num2 = Integer.parseInt(a[1]);
//		int num3 = Integer.parseInt(a[2]);
//		int total = num1+num2+num3;
//		
//		System.out.println(total);
		
		String[] a = args[0].split(",");
		String Name = a[0];
		int age = Integer.parseInt(a[1]);
		boolean isMale = Boolean.parseBoolean(a[2]);
		
		
		System.out.println("Name = "+Name +", Age = "+age +", isMale = "+true);

		


	}

}
