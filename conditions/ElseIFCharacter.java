package conditions;

public class ElseIFCharacter {
	public static void main(String[] args) {
		String a = "Sersy";
		char b = a.charAt(0);
		
		if (b == 'N') {
			System.out.println("North");
		}
		else if (b == 'S') {
			System.out.println("South");
		}
		else if (b == 'E') {
			System.out.println("East");
		}
		else if (b == 'W') {
			System.out.println("West");
		}
		else {
			System.out.println("Invalid");
		}
			
			
		}
	}

