package dayTwo;

public class Array {
	public static void main(String[]args) {
		String[] names = {"Karthi","raghu","Prithivi"};
		System.out.println(names);
		System.out.println(names[0]);
		System.out.println(names[2]);
		System.out.println(names.length);
		System.out.println(names.length-1);
		System.out.println(names[1].toUpperCase());
		System.out.println(names[names.length-1].charAt(names[names.length-1].length()-1));
		
		String name ="Rajaram";
		char[] chars = name.toCharArray();
		System.out.println(chars[0]);
		System.out.println(chars[chars.length-1]);
		
		String a = "Prithivi";
		String[] split = a.split("i");
		System.out.println(split[0]);
		System.out.println(split[split.length-2]);
	}
}
