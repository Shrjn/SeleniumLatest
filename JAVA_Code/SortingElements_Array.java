package Array_codes;

import java.util.Arrays;

public class SortingElements_Array {
    public static void main(String[] args) {
        int arr[] = {98,56,4,35, 6, 10, 4, 60,22,1100};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr)); // Print all values in array[5,6,1,4,2]
        Arrays.sort(arr); // Sort items in array
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr)); // Print all values in array[5,6,1,4,2]

    }
}

