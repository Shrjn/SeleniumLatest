package CodesForInterview;

public class SwapStrings_without_third_variable {

    public static void main(String[] args) {

        String a = "Shruti";
        String b = "Jain";
        System.out.println("Before Swapping: "+a);
        System.out.println("Before Swapping: "+b);
        a = a + b;

        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("After Swapping: "+a);
        System.out.println("After Swapping: "+b);
    }
}
