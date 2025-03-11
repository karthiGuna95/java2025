package oopsSingleLevelInheritance;

public class UseTeacher {
	public static void main(String[] args) {
		Human h = new Human();
		h.name="Keerthe";
		h.age=32;
		h.isMale=false;
		
		System.out.println("Name: "+h.name+", Age: "+h.age+", isMale: "+h.isMale);
		
		Teacher t = new Teacher();
		t.name="Geetha";
		t.age=25;
		t.isMale=false;
		t.salary=25000;
		t.qualification="BE";
		t.department="Mechanical";
		
		System.out.println("Name: "+t.name+", Age: "+t.age+", isMale: "+t.isMale+", Salary: "+
							t.salary+", Qualification: "+t.qualification+", Dept: "+t.department);
	}

}
	class Human {
	String name;
	int age;
	boolean isMale;
	}
	class Teacher extends Human {
	int salary;
	String qualification;
	String department;
	}
