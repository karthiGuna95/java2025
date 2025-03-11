package dayThree;

public class UseEmployee {
	public static void main (String[]args){
		String[] employee1 = args[0].split(",");
		
		Employee emp1 = new Employee();
		emp1.name = employee1[0];
		emp1.age = Integer.parseInt(employee1[1]);
//		emp1.isMale = Boolean.parseBoolean(employee1[2]);
		
		System.out.println("Name =" +emp1.name +", Age =" +emp1.age);
		
		String[] employee2 = args[1].split(",");
		
		Employee emp2 = new Employee();
		emp2.name = employee2[0];
		emp2.age = Integer.parseInt(employee2[1]);
//		emp2.isMale = Boolean.parseBoolean(employee2[2]);
		
		System.out.println(emp2.name +","+emp2.age);

	}
	

}

class Employee {
	String name;
	int age;
	boolean isMale;
}
