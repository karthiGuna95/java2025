package forLoopThree;

public class NestedLoopName {
	public static void main(String[] args) {
		String name = "banana";
		char[] a = name.toCharArray();
		for(int i= 0 ; i < a.length ; i++) {
			int count = 0;
			for(int j=i+1 ; j < a.length ; j++) {
				if(a[i] == a[j]) {
				count++;
				a[j] = '$';
				}
			}
			if(a[i] != '$' && count > 0) {
				System.out.println(a[i]+"="+count);
			}
		}
	}

}
