package mapping;

import java.util.HashMap;
import java.util.Map.Entry;

public class First {
	public static void main(String[] args) {
		HashMap<Integer,String> lms = new HashMap<>();
		lms.put(1594,"Karthi");
		lms.put(1595,"Pradeep");
		lms.put(1600,"Jeevan");
		lms.put(708,"Logesh");
		lms.put(1599,"Manoj");

/*		System.out.println(lms);
		System.out.println("*");
		
//using get method Remove the name Jeevan:
		lms.remove(1600);
		System.out.println(lms);
		System.out.println("*");

//using get method get the 1594 name:
		System.out.println(lms.get(1594));
		System.out.println("*");

//using get method modify the value using put :
		lms.put(1600,"Manoj");
		System.out.println(lms);
		System.out.println("*");

// using forEach loop 
		lms.forEach((x,y)-> System.out.println(x+" "+y));
		System.out.println("*");

// using forEach loop: get the values:
		lms.values().forEach(a->System.out.println(a));
		System.out.println("*");

// using foreach loop : get the keys and values using keyset():
		lms.keySet().forEach(b-> System.out.println(b+" "+lms.get(b)));
		System.out.println("*");
// using forEach loop syso modification:
		lms.keySet().forEach(b-> System.out.println(b+" "+lms.values()));
		System.out.println("*"); 

//Using Enhanced for loop: print the keys and values:
		for(String c : lms.values()) {
			System.out.println(c);
		}
		System.out.println("*"); */
		
			for(Integer i : lms.keySet()) {
				System.out.println(i+" "+lms.get(i));
		}
			System.out.println("*");

//using two values in one Enhanced for loop:
			for(Entry<Integer, String> lg : lms.entrySet()) {
				System.out.println(lg);
			}
			
	}

}
