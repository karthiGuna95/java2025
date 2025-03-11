package functions;

public class UseFunctionNames {
	public static void main(String[] args) {
		FunctionNames fn = new FunctionNames();
// void type with Parameter:
		fn.firstName("karthi");
	
// void type without Parameters:
		fn.secondName();
//	}
//}

//	public static void main(String[] args) {


// return type with Parameters:
		String name = fn.getname("Keerthe");
		System.out.println(name);
			//	or
	//	System.out.println(fn.getname("Keerthe"));

		
// return type without Parameters:
		String name1 = fn.getName1();
		System.out.println(name1);

		}
}


