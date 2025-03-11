package taskStreamApi;

import java.util.Arrays;

public class findStringLength {
	public static void main(String[] args) {
		String names[]= {"Jeeva","Thiru","Dinesh"};
		Long length=Arrays.stream(names).count();
		System.out.println(length);
	}

}
