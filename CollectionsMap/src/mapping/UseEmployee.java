package mapping;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Karthi",25,40000,true,2.5f);
		Employee e2 = new Employee("Gobi",20,50000,true,1.5f);
		Employee e3 = new Employee("geetha",28,30000,false,2.8f);
		Employee e4 = new Employee("Keerthe",30,20000,false,6.5f);
		Employee e5 = new Employee("Lakshmi",50,60000,false,5.5f);
		
//		HashMap<Object, Object> man = new HashMap<>();
//		man.put(25,"Karthi");
//		man.put(20,"Gobi");
//		man.put(28,"Geetha");
//		man.put(30,"Keerthe");
//		man.put(50,"Lakshmi");
		
		HashMap<Integer, Employee> man1 = new HashMap<>();
		man1.put(e1.getAge(),e1);
		man1.put(e2.getAge(),e2);
		man1.put(e3.getAge(),e3);
		man1.put(e4.getAge(),e4);
		man1.put(e5.getAge(),e5);
		System.out.println(man1);
		System.out.println("*");
		
// using forEach loop:
		man1.forEach((x,y)->System.out.println(x+" "+y));
		System.out.println("*");
		
// using forEach loop to get the values of name:
		man1.values().forEach(x->System.out.println(x.getName()));
		System.out.println("*");

// using forEach loop to modify the values using keySet();
		man1.keySet().forEach(x->System.out.println(x+" "+man1.get(x)));
		System.out.println("*");

//using Enhanced for loop:
		for(Integer a : man1.keySet()) {
			System.out.println(a+" "+man1.get(a));
		}
		System.out.println("*");

//using Enhanced Forloop:
		for(Employee b : man1.values()) {
			System.out.println(b.getIsMale());
		}
		System.out.println("*");
// using enhanced for loop find the max salary:
		Employee max = e1;
		for(Employee b : man1.values()) {
			if(b.getSalary()>max.getSalary()) {
				max=b;
			}
		}
		System.out.println(max);
		System.out.println("*");
		
// using enhanced for loop: to get the values name using keySet :
		Employee maxi = e1;
		for(Integer b : man1.keySet()) {
			if(man1.get(b).getExperience()>max.getExperience()) {
				max=man1.get(b);
			}
		//	System.out.println(b+" "+man1.keySet());
		}
		System.out.println(max);
		System.out.println("*");
		
// using enhanced for loop modify the value using if experience > 4 give 10% increment in salary: 
		for(Employee c : man1.values()) {
			if(c.getExperience() > 4) {
				c.setSalary(c.getSalary()+c.getSalary()*10/100);
			}
		}
		System.out.println(man1);
		System.out.println("*");
		
// using forEach loop modify the value using if experience > 4 give 10% increment in salary: 
		man1.values().forEach(d-> {
			if(d.getExperience() > 4) {
				d.setSalary(d.getSalary()+d.getSalary()*10/100);
			}
			System.out.println(d);
		});
		System.out.println("*");
		
// 	using enhanced for loop get the value name using keyset method if age >30: 
		for(Integer c : man1.keySet()) {
			if(man1.get(c).getAge() > 30) {
				System.out.println(man1.get(c).getName());
			}
		}
		System.out.println("*");
		
//using enhanced for loop print the values male name using values():
		for(Employee c : man1.values()) {
			if(c.getIsMale() == true) {
				System.out.println(c);
			}
		}
		System.out.println("*");
		
//using enhanced for loop print the values male name using values():
		//for(Boolean b : man1.keySet()) {
		//	if(man1.getIsMale()==true) {
		//}
// using  forEach loop print the values male name using values():
		man1.values().forEach(c->{
			if(c.getIsMale() == true) {
				System.out.println(c.getName());
			}
		});

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

