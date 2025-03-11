package oopsSinglePrivateKeyword;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t=new Teacher("Ajith",25,true,35000,"BE","Mech");
		System.out.println(t);
	}
}
	class Human {
		private String name;
		private int age;
		private boolean isMale;
		
	public Human(String name,int age,boolean isMale) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	public String toString() {
		return "Name: "+name+", Age: "+age+", IsMale: "+isMale;
	}
	public void Name(String name) {
		this.name=name;
	}
	public String Name() {
		return name;
	}
	public void Age(int age) {
		this.age=age;
	}
	public int age() {
		return age;
	}
	public void IsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean IsMale() {
		return isMale;
	}
	}
	
	class Teacher extends Human {
		private int salary;
		private String qualification;
		private String department;
	
	public Teacher(String name,int age,boolean isMale,int salary,String qualification,String department) {
		super(name,age,isMale);
		this.salary=salary;
		this.qualification=qualification;
		this.department=department;
	}
	public String toString() {
		return super.toString()+" Salary:"+salary+", Qualification: "+qualification+", Dept: "+department;
	}
	public void Salary(int salary) {
		this.salary=salary;
	}
	public int Salary() {
		return salary;
	}
	public void Qualification(String qualification) {
		this.qualification=qualification;
	}
	public String Qualification() {
		return qualification;
	}
	public void Department(String department) {
		this.department=department;
	}
	public String Department() {
		return department;
	}
	}
	
