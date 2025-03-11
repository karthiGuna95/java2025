package functions;

public class ValidMailId {
	public static void main(String[] args) {
		String mail="gunakarthi4@gmail.com";
		email(mail);
	}
	public static void email(String mail) {
		if(mail.equals("gunakarthi4@gmail.com"))
			System.out.println("Valid Email Id");
		else
			System.out.println("Invalid Email Id");
	}

}
