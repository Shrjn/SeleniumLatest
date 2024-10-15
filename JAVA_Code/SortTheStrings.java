package CodesForInterview;

import java.util.Arrays;

public class SortTheStrings {
    public static void main(String[] args) {
        String a[] = {"Shruti","Aman","Anish","Mayank","Devisha","Sayyam"};
        System.out.println(Arrays.toString(a)); // Print all values in array[5,6,1,4,2]
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}

