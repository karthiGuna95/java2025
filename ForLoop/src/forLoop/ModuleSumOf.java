package forLoop;

public class ModuleSumOf {
	public static void main(String[] args) {
		int num = 9;
		int newnum = num/2;
		int total = 0;
		for(int i = 1 ; i <= newnum ; i++) {
			total = total+i;
		}
		System.out.println(total);
	}

}
