package taskStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class commonElement {
    public static void main(String[] args) {
        int []a = {1, 5, 6, 8, 9};
        int []b = {6, 9, 3, 4};
   //     int []c = Arrays.add(a+b);
        ArrayList<Integer> num = new ArrayList<>();
        Integer[] aObj = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Integer[] bObj = Arrays.stream(b).boxed().toArray(Integer[]::new);

        // Create an ArrayList and add elements
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, aObj);
        Collections.addAll(list, bObj);
        Set<Integer> common = list.stream()
        							.collect(Collectors.toSet());

        System.out.println(common);
    }

}
