package oopsQuestionPaper;

public class UseEmployee {
	public static void main(String[] args) {
		Address add = new Address(12,"LuffyStreet","TNagar","Chennai","TamilNadu",601235);
//		add.doorNo=55;
//		add.streetName="Zoro Street";
//		add.townName="Karapakkam";
//		add.district="Kanchipuram";
//		add.state="TamilNadu";
//		add.pincode=600119;
		
		Employee emp = new Employee(250,"Rishi","Civil",20,40000,"HR",add);
//		emp.id=123;
//		emp.name="Resh";
//		emp.dept="Mech";
//		emp.age=25;
//		emp.salary=45000;
//		emp.role="Manager";
//		emp.address=add;
		
//		emp.showMessage();
//		emp.showEmployee();
		
//		System.out.println(emp.id+","+emp.name+","+emp.dept+","+emp.age+","+emp.salary+","
//							+emp.role+","+emp.address.doorNo+","+emp.address.townName+","+emp.address.district);
		System.out.println(emp);
//		System.out.println(emp.getId()+","+emp.getName()+","+emp.address.doorNo());

	}
}
	class Address {
		private int doorNo;
		private String streetName;
		private String townName;
		private String district;
		private String state;
		private int pincode;
		
		public Address(int doorNo,String streetName,String townName,String district,String state,int pincode) {
			this.doorNo=doorNo;
			this.streetName=streetName;
			this.townName=townName;
			this.district=district;
			this.state=state;
			this.pincode=pincode;
		}
		public String toString() {
			return doorNo+streetName+townName+district+state+pincode;
		}
		public void setDoorNo(int doorNo) {
			this.doorNo=doorNo;
		}
		public int getDoorNo() {
			return doorNo;
		}
		public void setStreetName(String streetName) {
			this.streetName=streetName;
		}
		public String getStreetName() {
			return streetName;
		}
		public void setTownName(String townName) {
			this.townName=townName;
		}
		public String getTownName() {
			return streetName;
		}
		public void setDistrict(String district) {
			this.district=district;
		}
		public String getDistrict() {
			return district;
		}
		public void setState(String state) {
			this.state=state;
		}
		public String getState() {
			return state;
		}
		public void setPincode(int pincode) {
			this.pincode=pincode;
		}
		public int getPincode() {
			return pincode;
		}

	}
	class Employee {
		private int id;
		private String name;
		private String dept;
		private int age;
		private int salary;
		private String role;
		private Address address;
//	public void showMessage() {
//		System.out.println("Employee Program");
//	}
//	public void showEmployee() {
//		System.out.println(id+name+dept+age+salary+role+address);
//	}
	
	public Employee(int id,String name,String dept,int age,int salary,String role,Address address) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.age=age;
		this.salary=salary;
		this.role=role;
		this.address=address;
	}
	public String toString() {
		return id+name+dept+age+salary+role+address;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole() {
		return role;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	public Address getAddress() {
		return address;
	}

}
	

		
