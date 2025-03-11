package functions;

public class AnagramOfAPalindrome {
	public static boolean isAnagramOfPalindrome(String str) {
	    int[] count = new int[256];
	    for (char c : str.toCharArray()) {
	        count[c]++;
	    }
	    int oddCount = 0;
	    for (int c : count) {
	        if (c % 2 != 0) oddCount++;
	    }
	    return oddCount <= 1;
	}
}
