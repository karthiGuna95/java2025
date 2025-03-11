package StringIndexOutOfBoundException;

public class name {
	public static void main(String[] args) {
		String name = "Karthik";
		try {
			char ch = name.charAt(9);
			System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException sp) {
			System.out.println(sp);
			System.out.println(sp.getMessage());
			//sp.printStackTrace();
		}
		finally {
			System.out.println("dfhhnhd");
		}
	}

}
