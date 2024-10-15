package CodesForInterview;

public class SwapNumbers {

    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;
        System.out.println("Before Swap");
        System.out.println("a="+a);
        System.out.println("b="+b);


        int temp = a;// temp = 5
        a = b; // a = 7
        b = temp;  // b = 5
        System.out.println("After Swap");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
