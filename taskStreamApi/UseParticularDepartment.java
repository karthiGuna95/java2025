package taskStreamApi;

import java.util.ArrayList;
import java.util.List;

public class UseParticularDepartment {
	public static void main(String[] args) {
		ParticularDepartment emp1= new ParticularDepartment("Karthi","mech");
		ParticularDepartment emp2= new ParticularDepartment("Jeeva","civil");
		ParticularDepartment emp3= new ParticularDepartment("Manoj","mech");
		ParticularDepartment emp4= new ParticularDepartment("jeeva","It");
		ParticularDepartment emp5= new ParticularDepartment("Poovarasan","civil");
		
		ArrayList<ParticularDepartment> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		Long count = emp.stream().filter(f->f.getDepartment().equals("mech")).count();
		System.out.println("Mech depart:"+count);
	}

}
class ParticularDepartment {
	private String name;
	private String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ParticularDepartment(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public String toString() {
		return "Name=" + name + ", department=" + department;
	}
	
	
	
}
