package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;



public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Karthi",25,40000,true,2.5f);
		Employee e2 = new Employee("Gobi",20,50000,true,1.5f);
		Employee e3 = new Employee("geetha",28,30000,false,2.8f);
		Employee e4 = new Employee("Keerthe",30,20000,false,3.5f);
		Employee e5 = new Employee("Lakshmi",50,60000,false,5.5f);
		
		LinkedList<Employee>emp = new LinkedList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		System.out.println(emp);
		System.out.println("*");
		
		//using for loop:	
				for(int i=0 ; i < emp.size() ; i++) {
				System.out.println(emp.get(i));
				}
				System.out.println("*");
			//using Enhanced loop:	
				for(Employee x : emp) {
					System.out.println(x);
				}
				System.out.println("*");
			// using forEach:	
				emp.forEach(b->System.out.println(b));
				System.out.println("*");

			// using enhanced loop:if age greater than 30:
				for(Employee x : emp) {
					if(x.getAge() > 30) {
						System.out.println(x);
					}
				}
				System.out.println("*");

			//using forEach loop:if age greater than 25:
				emp.forEach(b->{if(b.getAge()>25) {System.out.println(b);}});
				System.out.println("*");

				
				//using forEach loop:if age greater than 25:print only name:
				emp.forEach(b->{if(b.getAge()>25) {System.out.println(b.getName());}});
				System.out.println("*");

				//using enhanced loop:print male employee:
				for(Employee x : emp) {
					if(x.getIsMale()==true) {
						System.out.println(x);
					}
				}
				System.out.println("*");

			//using enhanced loop:print female employee:
				emp.forEach(b->{
					if(b.getIsMale()==false) {
						System.out.println(b);
					}
				}); 
				System.out.println("*");
			//using forloop if salary >2000 discount 100; salary > 4000 discount 200:
				for(int i=0 ; i<emp.size() ; i++) {
					if(emp.get(i).getSalary()>30000) {
						emp.get(i).setSalary(emp.get(i).getSalary()-100);
						System.out.println(emp.get(i));
					}
					else if (emp.get(i).getSalary()<=30000){
						emp.get(i).setSalary(emp.get(i).getSalary()+100);
						System.out.println(emp.get(i));
					}
				}
				System.out.println("*");
		// using for loop :print max name length :
				Employee max = emp.get(0);
				for(int i=0 ;i<emp.size() ; i++) {
					if(emp.get(i).getName().length()>max.getName().length()) {
						max=emp.get(i);
					}
				}
				System.out.println(max);
				System.out.println("*");

		// using for loop Create another array list and store name startswith 'k':
				ArrayList<Employee> e = new ArrayList<>();
				for(int i=0 ; i<emp.size();i++) {
					if(emp.get(i).getName().startsWith("K")) {
						e.add(emp.get(i));
					}
				}
				System.out.println(e);
				System.out.println("*");

			//using enhanced loop:if experience is >2 print salary to increment 10:
				for(Employee x : emp) {
					if(x.getExperience()>2) {
						x.setSalary(x.getSalary()+x.getSalary()*10/100);
						System.out.println(x);
					}
				}
				System.out.println("*");
				System.out.println(emp);
				System.out.println("*");

			// using enhanced loop:print max salary:	
				int max1 = emp.get(0).getSalary();
				for(Employee x : emp) {
					if(x.getSalary() > max1) {
						max1 = x.getSalary();
					}
				}
					System.out.println(max1);
					System.out.println("*");
		 //using enhanced loop : print max salary using object:
					Employee maxi = emp.get(0);
					for(Employee x : emp) {
						if(x.getSalary()>maxi.getSalary()) {
							maxi=x;
						}
					}
					System.out.println(maxi);
					System.out.println("*");

			// using Another array create for male employee only:
					ArrayList<Employee>male = new ArrayList<>();
					emp.forEach(b->{
						if(b.getIsMale()==true) {
							male.add(b);
						}
					});
					System.out.println(male);
					System.out.println("*");
					
			//using forEach store all the salary in Another array:
					ArrayList<Integer> salry = new ArrayList<>();
					emp.forEach(s -> salry.add(s.getSalary()));
					System.out.println(salry);
	}

}
class Employee {
	private String name;
	private int age;
	private int salary;
	private boolean isMale;
	private float experience;
	
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
	public Employee(String name, int age, int salary, boolean isMale, float experience) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isMale = isMale;
		this.experience = experience;
	}
	public String toString() {
		return "Employee name=" + name + ", age=" + age + ", salary=" + salary + ", isMale=" + isMale + ", experience="+ experience;
	}
	
	
}