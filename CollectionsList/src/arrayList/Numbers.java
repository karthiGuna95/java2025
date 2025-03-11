package arrayList;

import java.util.ArrayList;

public class Numbers {
	public static void main(String[] args) {
		ArrayList<Integer>num = new ArrayList<>();
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		System.out.println(num.get(0));
		System.out.println(num.get(2));
		num.set(1,15);
		num.remove(3);
		System.out.println();
// using for loop:		
		for(int i=0 ; i<num.size() ;i++) {
			System.out.println(num.get(i));
		}
		System.out.println("*");

//using enhanced loop:
		for(Integer x : num) {
			System.out.println(x);
		}
		System.out.println("*");

		
//using enhanced loop print even number:
		
		for(Integer x : num) {
			if(x % 2 == 0) {
				System.out.println(x);
			}
		}
		System.out.println("*");

//using enhanced loop to get max value:	
		int max = num.get(0);
		for(Integer x : num) {
			if(x > max) {
				max=x;
			}
		}
		System.out.println(max);
		System.out.println("*");
		
		
// Using forEach loop:
		num.forEach(b->System.out.println(b));
		System.out.println("*");

		
// using forEach loop even number:
		num.forEach(b-> {if(b % 2 == 0) {System.out.println(b);}});
		System.out.println("*");

// find prime no:
		for(int i=2 ; i<num.size(); i++) {
			if(num.get(i) % i == 0) {
				
			}
			
		}
	}
}
		



