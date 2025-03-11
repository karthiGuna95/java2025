package functions;

public class RemoveTheVowels {

	public static void main(String[] args) {
		String a="Karthik";
		 String name = remove(a);
		 System.out.println(name);
		

	}
	public static String remove(String a) {
		char b[]=a.toCharArray();
		String result = "";
		for(int i=0;i<b.length;i++) {
			char ch = a.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
				result = result+ch;
			}
		}
		return result;
	}

}
