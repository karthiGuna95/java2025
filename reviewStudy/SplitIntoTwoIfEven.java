package reviewStudy;

public class SplitIntoTwoIfEven {
	    public static void main(String[] args) {

	        String s = "gobi";
	        if (s.length() % 2 == 0) {
	            int mid = s.length() / 2;
	            System.out.println( s.substring(0, mid)+"-"+s.substring(mid));
	        } 
	        else {
	            int mid = s.length() / 2;
	            System.out.println(s.substring(0, mid)+"-"+s.charAt(mid)+"-"+s.substring(mid + 1));
	        }

	    }
	}


