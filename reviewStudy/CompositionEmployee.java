package reviewStudy;

public class CompositionEmployee {
	public static void main(String[] args) {
		Employee em = new Employee();
		em.company="TITAN";
		em.year=2012;
		em.certified=true;
		
		Engineer e = new Engineer();
		e.name="KRISHNA";
		e.age=20;
		e.isMale=true;
		e.employee=em;
		
		System.out.println(e.name+e.age+e.isMale+e.employee.company+e.employee.year+e.employee.certified);
	}
	
}
class Employee {
	String company;
	int year;
	boolean certified;
	
}
class Engineer {
	String name;
	int age;
	boolean isMale;
	Employee employee;
}
