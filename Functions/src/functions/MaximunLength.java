package functions;

public class MaximunLength {

	public String maxlength(String[] words) {
		String max = words[0];
		for(int i=0 ; i<words.length ; i++) {
			if(words[i].length()>max.length()) {
				max = words[i];
			}
		}
		return max;
		
	}
//	public int maxlength(int [] vals) {
//		int max = vals[0];
//		for(int i=0 ; i<vals.length ; i++) {
//			if(vals[i]>max) {
//				max=vals[i];
//			}
//		}
//		return max;
//	}

}
