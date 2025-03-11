package taskStreamApi;

import java.util.Arrays;
import java.util.List;

public class intSortingProgram {
	public static void main(String[] args) {
		int []num= {10,11,9,1,0};
		int []sor = Arrays.stream(num).sorted().toArray();
		System.out.println(Arrays.toString(sor));
	}

}
