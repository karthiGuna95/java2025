package forLoopThree;

public class ReversedString {
	public static void main(String[] args) {
		
        String s = "i,am,a,developer";
        
        String[] t = s.split(",");
        
        for(int i=0 ; i<t.length ;i++) {
        	String rev = "";
        	
        	for(int j=t[i].length()-1 ; j>=0 ; j--) {
        		
        		rev = rev+ t[i].charAt(j);
        	}
        	System.out.println(rev+" ");
        }
    }
}


