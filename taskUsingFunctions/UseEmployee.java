package taskUsingFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee emp1= new Employee("Karthi",28,50000);
		Employee emp2= new Employee("Geetha",32,30000);
		Employee emp3= new Employee("GobiKrishna",23,25000);
		Employee emp4= new Employee("Keerthe",20,45000);
		
		List<Employee> empDetail = Arrays.asList(emp1,emp2,emp3,emp4);
		
		EmployeeAge empAge = new EmployeeAge();
		System.out.println("Age Between 25 to 35:");
		System.out.println(empAge.findAge(empDetail,25,35));
		
		EmployeeName empName = new EmployeeName();
		System.out.println("Maximum length of name object:");
		System.out.println(empName.maxLength(empDetail));
		
		LeastThreeAge ages = new LeastThreeAge();
		System.out.println("Least 3 min age details:");
		System.out.println(ages.minAge(empDetail));
	}

}
class EmployeeName {
	public Employee maxLength(List<Employee> empDetail){
		return empDetail.stream().max(Comparator.comparingInt(c -> c.getName().length())).get();
	}
}
class EmployeeAge {
	public List<Employee> findAge(List<Employee> empDetail ,int minAge , int maxAge){
		return  empDetail.stream()
				.filter(f->f.getAge()>minAge && f.getAge()<maxAge).collect(Collectors.toList());
	}
}
class LeastThreeAge {
	public List<Employee> minAge(List<Employee> empDetail) {
		return empDetail.stream().sorted(Comparator.comparingInt(Employee::getAge)).limit(3).collect(Collectors.toList());
	}
}

class Employee {
	private String name;
	private int age;
	private int salary;
	
	public String toString() {
		return "EmployeeName=" + name + ", age=" + age + ", salary=" + salary;
	}
	
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.salary = salary;
		this.age=age;
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