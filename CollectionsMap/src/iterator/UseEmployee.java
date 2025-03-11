package iterator;

import java.util.HashMap;
import java.util.Iterator;


public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Karthi",25,40000,true,2.5f);
		Employee e2 = new Employee("Gobi",20,50000,true,1.5f);
		Employee e3 = new Employee("geetha",28,30000,false,2.8f);
		Employee e4 = new Employee("Keerthe",30,20000,false,6.5f);
		Employee e5 = new Employee("Lakshmi",50,60000,false,5.5f);
		
		HashMap<Integer,Employee> emp = new HashMap<>();
		emp.put(e1.getAge(),e1);
		emp.put(e2.getAge(),e2);
		emp.put(e3.getAge(),e3);
		emp.put(e4.getAge(),e4);
		emp.put(e5.getAge(),e5);
		Iterator<Employee> emp1 = emp.values().iterator();
		while(emp1.hasNext()){
			if(emp1.next().getAge() >= 30) {
				emp1.remove();
			}
		}
		System.out.println(emp);
		System.out.println("*");
		
// using Keyset():368	
		Iterator<Integer> emp2 = emp.keySet().iterator();
		while(emp2.hasNext()){
			if(emp.get(emp2.next()).getAge() >= 30) {
				emp2.remove();
			}
		}
		System.out.println(emp);

	}

}
class Employee {
	private String name;
	private int age;
	private int salary;
	private boolean isMale;
	private float experience;
	
	public Employee(String name, int age, int salary, boolean isMale, float experience) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isMale = isMale;
		this.experience = experience;
	}
	
	public String toString() {
		return "EmployeeName=" + name + ", age=" + age + ", salary=" + salary + ", isMale=" + isMale + ", experience="
				+ experience;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public boolean getIsMale() {
		return isMale;
	}
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
}


//	Concurrent Modification Exception :
/*
import java.util.*;

class UseEmployee  {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get an iterator for the list
        Iterator<String> iterator = names.iterator();

        // Traverse the list using the iterator
        System.out.println("Names in the list:");
        while (iterator.hasNext()) {
        	//names.add("jeeva");
        	names.remove("Alice");
            System.out.println(iterator.next());  // Print each name
        }
    }
}
*/
