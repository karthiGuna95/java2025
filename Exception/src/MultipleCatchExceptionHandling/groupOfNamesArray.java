package MultipleCatchExceptionHandling;

public class groupOfNamesArray {
	public static void main(String[] args) {
		
	String []names = {"Karthi","Gobi","Geetha"};
	try {
		//String name1=names[4];
		System.out.println(names[2]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.println(e.getMessage());
		//e.printStackTrace();
		}

	catch(StringIndexOutOfBoundsException sp) {
//		System.out.println(sp);
//		System.out.println(sp.getMessage());
//		sp.printStackTrace();
		}
	
	catch(NullPointerException np) {
//		System.out.println(np);
//		System.out.println(np.getMessage());
//		np.printStackTrace();
		}
	finally {
		System.out.println("good");
		}		
	}

}
