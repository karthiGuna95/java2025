package NullPoniterException;

public class nullpoint {
	public static void main(String[] args) {
		String a = null;
		try {
			int aaa=Integer.parseInt(a);
		}
		catch(NullPointerException np) {
			System.out.println(np);
			System.out.println(np.getMessage());
			np.printStackTrace();
		}
		finally {
			System.out.println("nga");
		}
	}

}
