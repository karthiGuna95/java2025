package forLoopTwo;

public class StartsWithCase {
	public static void main(String[] args) {
		String[] num = {"success","super","great"};
		
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i].startsWith("s")){
				
				System.out.println(num[i]);
			}
		}
	}

}
