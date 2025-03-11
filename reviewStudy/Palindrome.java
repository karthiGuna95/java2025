package reviewStudy;

public class Palindrome {
	public static void main(String[] args) {
	// using for loop 3: given data in int	
		
		String s = "256";
		int num=Integer.parseInt(s);
		int temp = num;
		int rev = 0;
		
	//using forloop:			//using while loop:	
		for(; num > 0 ;) {		//while(num > 0) {
			int a = num % 10;
			rev = (rev*10) + a;
			num = num/10;
		}
		if(temp == rev) {
			System.out.println(temp+" is Palindrome");
		}
		else {
			System.out.println(temp+" is not Palindrome");
		}
		
	// using for loop 1 : data given in String 	
		String a = "resh";
		String revs = "";
		for(int i=a.length()-1 ; i>=0 ; i--) {
			revs= revs+a.charAt(i);
		}
		if(a == revs) {
		System.out.println(revs+" is Plaindrome");
	}
		else {
			System.out.println(revs+" is not Plaindrome");

		}
	}

}
