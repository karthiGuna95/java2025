package task;

public class PrintMiddleChar {
	public static void main(String[] args) {
		String a = "PULSAR";
		if(a.length() % 2 == 0) {
			int len = a.length()/2;
			int l1=len-1;
		//	int l2=len-2;
			System.out.println(a.charAt(len)+a.charAt(l1));
		}
		else {
			int len1=a.length()/2;
			System.out.println(a.charAt(len1));
		}
	}

}
