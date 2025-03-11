package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToArrayList {
	public static void main(String[] args) {
		Integer [] arr = {1, 2, 3, 4};

        // Trying to convert int[] to List<Integer> (This will cause an issue)
        List<Integer> list =new ArrayList<>();
        	System.out.println(list);

        System.out.println(list);
	}

}
