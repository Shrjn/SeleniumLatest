package CodesForInterview;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayReverse {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 67, 90, 345, 6, 700};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}



