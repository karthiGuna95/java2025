package task;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        // Read the input values from args[0] and args[1]
        String[] input1 = args[0].split(","); // Split the first input by comma
        String[] input2 = args[1].split(","); // Split the second input by comma

        // Convert the string arrays to integer arrays
        int[] arr1 = new int[input1.length];
        int[] arr2 = new int[input2.length];

        for (int i = 0; i < input1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        for (int i = 0; i < input2.length; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        // Check if the two arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}