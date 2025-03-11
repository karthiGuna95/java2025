package ArithmaticException;

public class name {
	public static void main(String[] args) {
		String word = "Karthi53";
		try {
			int a=Integer.parseInt(word);
		}
		catch(NumberFormatException na) {
			System.out.println(na);
			System.out.println(na.getMessage());
			na.printStackTrace();
		}
		finally {
			System.out.println("na");
		}
	}

}
