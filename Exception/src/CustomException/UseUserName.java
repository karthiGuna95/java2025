package CustomException;

import java.util.Scanner;

public class UseUserName {
	//using Scanner:
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) throws UserNameException{
		System.out.println("Enter the User name:");
		String username = s.nextLine();
		System.out.println("plz enter the Password: ");
		String password = s.nextLine();
		try {
			if(username.equals("password") && password.equals("Kafrtv12")) {
				System.out.println("Connected");
			}
			else {
				throw new UserNameException("Invalid Username or Invalid Password");
			}
		}
		catch(StringIndexOutOfBoundsException aa) {
			System.out.println(aa);
			System.out.println(aa.getMessage());
		}
	}

}
class UserNameException extends Exception {
	public UserNameException(String msg) {
		super(msg);
		
	}
}