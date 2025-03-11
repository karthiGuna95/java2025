package taskStreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseEmployeeDetails {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Karthi",30,40000);
		Employee emp2 = new Employee("Gobi",25,30000);
		Employee emp3 = new Employee("Geetha",32,50000);
		Employee emp4 = new Employee("Keerthe",35,23000);
		Employee emp5 = new Employee("Prem",28,25000);
		Employee emp6 = new Employee("Prithivi",28,10000);
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		emp.add(emp6);
		
		String em = emp.stream()
				.filter(f->f.getSalary()>=25000)
				.sorted(Comparator.comparing(Employee::getAge).reversed())
				.sorted(Comparator.comparing(Employee::getName).reversed())
				.map(m->m.getName()+","+m.getAge())
				.findFirst().get();
		System.out.println(em);
				
				
	}

}
class Employee {
	private String name;
	private int age;
	private int salary;
	
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String toString() {
		return "EmployeeName=" + name + ", age=" + age + ", salary=" + salary;
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
	
	
}