package CustomException;

public class UseAgeException extends Exception {
	public static void main(String[] args)throws AgeException {
		int age = 12;
		try {
			if(age>=18) {
				System.out.println("Eligible to Vote");
			}
			else {
				throw new AgeException("Not Eligible ToVote");
			}
		}
		catch(AgeException ae) {
			System.out.println(ae);
			System.out.println(ae.getMessage());
		}
	}

}

class AgeException extends Exception {
	public AgeException(String name) {
		super(name);
	}

}