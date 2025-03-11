package ArrayIndexOutOfBoundException;

public class numbers {
	public static void main(String[] args) {
		int arr[]= {10,20};
		try {
			int a=arr[5];
			System.out.println(a);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("good");
		}
	}

}
