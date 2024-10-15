package Array_codes;

public class FindRepetition_Array {

    public static void main(String[] args) {
        int a[]= {1,2,2,3,2,3,4,2,2};
        int num = 2;
        int count = 0;
        for (int value : a)
        {
            if(value == num)
            {
                count++;
            }
        }
        System.out.println("Number of times number repeated in array: " +count);
    }
}
