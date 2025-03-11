package oopsMultipleLevelInheritance;

public class UseEngineer {
	public static void main(String[] args) {
		Engineer e=new Engineer();
		e.name="Karthi";
		e.age=25;
		e.isMale=true;
		e.experience=1.5f;
		e.salary=30000;
		e.role="Associate";
		e.department="Civil";
		e.qualification="BE";
		
		System.out.println("Name: "+e.name+", Age: "+e.age+", isMale: "+e.isMale+", Experience: "+e.experience+", Salary: "+e.salary+", Role: "+e.role+", Dept: "+e.department+", Qualification: "+e.qualification);
	}

}
	class	Human {
	String name;
	int age;
	boolean isMale;
	}
	class Employee extends Human {
		float experience;
		int salary;
		String role;
	}
	class Engineer extends Employee {
		String department;
		String qualification;
	}

