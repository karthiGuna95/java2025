package linkedList;

import java.util.LinkedList;

public class PrintAllTheInteger {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		System.out.println(num);
		System.out.println("*");
		
// using for loop:
		for(int i=0 ; i<num.size() ; i++) {
			System.out.println(num.get(i));
		}
		System.out.println("*");

// using Enhanced for loop :
		for(Integer n : num) {
			System.out.println(n);
		}
		System.out.println("*");

// using forEach loop:
		num.forEach(n -> {
			System.out.println(n);
		});
	}

}
