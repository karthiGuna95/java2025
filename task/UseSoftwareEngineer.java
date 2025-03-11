package task;

public class UseSoftwareEngineer {
	public static void main(String[] args) {
		SoftwareEngineer s = new SoftwareEngineer("Karthi", 25, true, 1.5f, 30000, "Associate", "Civil", "BE");

		System.out.println(s);
	}
}

class Employee {
	private String name;
	private int age;
	private boolean isMale;

	public Employee(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String toString() {
		return "Name: " + name + ", Age: " + age + ", isMale: " + isMale;
	}

	public void Name(String name) {
		this.name = name;
	}

	public String Name() {
		return name;
	}

	public void Age(int age) {
		this.age = age;
	}

	public int Age() {
		return age;
	}

	public void IsMale(boolean isMale) {
		this.isMale = isMale;
	}

	public boolean IsMale() {
		return isMale;
	}
}

class Engineer extends Employee {
	private float experience;
	private int salary;
	private String role;

	public Engineer(String name, int age, boolean isMale, float experience, int salary, String role) {
		super(name, age, isMale);
		this.experience = experience;
		this.salary = salary;
		this.role = role;
	}

	public String toString() {
		return super.toString() + ", Experience: " + experience + ", Salary: " + salary + ", Role: " + role;
	}

	public void Experience(float experience) {
		this.experience = experience;
	}

	public float Experience() {
		return experience;
	}

	public void Salary(int salary) {
		this.salary = salary;
	}

	public int Salary() {
		return salary;
	}

	public void Role(String role) {
		this.role = role;
	}

	public String Role() {
		return role;
	}
}

class SoftwareEngineer extends Engineer {
	private String department;
	private String qualification;

	public SoftwareEngineer(String name, int age, boolean isMale, float experience, int salary, String role,
			String department, String qualification) {
		super(name, age, isMale, experience, salary, role);
		this.department = department;
		this.qualification = qualification;
	}

	public void Department(String department) {
		this.department = department;
	}

	public String Department() {
		return department;
	}

	public void Qualification(String qualification) {
		this.qualification = qualification;
	}

	public String Qualification() {
		return qualification;
	}

	public String toString() {
		return super.toString() + ", Dept: " + department + ", Qualification: " + qualification;
	}
}
