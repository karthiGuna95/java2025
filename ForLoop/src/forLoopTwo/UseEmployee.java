package forLoopTwo;

public class UseEmployee {
	public static void main(String[] args) {
		
	Employee employee1 = new Employee();
	employee1.name = "karthi";
	employee1.age = 30;
	employee1.gender = "male";
	employee1.salary = 400000;
	employee1.phone = 987123987123l;
	
	Employee employee2 = new Employee();
	employee2.name = "gobi";
	employee2.age = 25;
	employee2.gender = "male";
	employee2.salary = 300000;
	employee2.phone = 987123456123l;
	
	Employee employee3 = new Employee();
	employee3.name = "keerthi";
	employee3.age = 37;
	employee3.gender = "female";
	employee3.salary = 450000;
	employee3.phone = 987456987123l;
	
	Employee employee4 = new Employee();
	employee4.name = "geetha";
	employee4.age = 30;
	employee4.gender = "female";
	employee4.salary = 500000;
	employee4.phone = 987123987456l;
	
	Employee employee5 = new Employee();
	employee5.name = "guna";
	employee5.age = 55;
	employee5.gender = "male";
	employee5.salary = 600000;
	employee5.phone = 987123987456l;
	
	Employee[] emps = {employee1,employee2,employee3,employee4,employee5};
	for(int i = 0 ; i < emps.length ; i++) {
		System.out.println(emps[i].name+" "+emps[i].age+" "+emps[i].gender+" "+emps[i].salary+" "+emps[i].phone);
	}
	
	for(int i = 0 ; i < emps.length ; i++) {
		if(emps[i].age > 35) {
			System.out.println(emps[i].name+" "+emps[i].age+" "+emps[i].gender+" "+emps[i].salary+" "+emps[i].phone);
		}
		}
	
	for(int i = 0 ; i < emps.length ; i++) {
		if(emps[i].gender == "female" && emps[i].salary > 300000) {
			System.out.println(emps[i].name+" "+emps[i].age+" "+emps[i].gender+" "+emps[i].salary+" "+emps[i].phone);
		}
	}
	
		int count = 0;
	for(int i = 0 ; i < emps.length ; i++) {
		if(emps[i].gender == "male") {
			count = count + 1;
		}
	}
			System.out.println(count);
			
	Employee max =	emps[0];
	for(int i = 0 ; i < emps.length ; i++) {
		if(emps[i].salary > max.salary) {
			max = emps[i];
		}
	}
	System.out.println(max.name+" "+max.age+" "+max.gender+" "+max.salary+" "+max.phone);
	
	for(int i = 0 ; i < emps.length ; i++) {
		if(emps[i].age < max.age) {
			max = emps[i];
		}
	}
	System.out.println(max.name+" "+max.age);
	
//	enhanced forloop;
	
	for(Employee a : emps) {
		System.out.println(a.name+" "+a.age+" "+a.gender+" "+a.salary+" "+a.phone);
		}
	}
}

