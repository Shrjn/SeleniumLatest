package CodesForInterview;

public class SwapNumber_withoutthirdvariable {

    public static void main(String a[])
    {
        int x = 5;
        int y = 9;

        x = x +y;
        y=x-y;
        x=x-y;

        System.out.println(x);
        System.out.println(y);


        /*
        int x = 90;
        int y = 7;
        x = x + y; // 97
        y = x - y; // 90
        x = x - y; //  7
      //  System.out.println("After swapping:"
            //    + " x = " + x + ", y = " + y);
        System.out.println("x: "+x);
        System.out.println("y: "+y);

         */
    }
}
