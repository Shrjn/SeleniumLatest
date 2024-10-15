package ConditionalStatements;

public class LargestOf3Num {
    public static void main(String[] args) {
        int a = 1223;
        int b = 456;
        int c = 955;

        if (a > b && a>c)
        {
            System.out.println("A is largest number");
    }
        else if (b > a && b>c) {
            System.out.println("B is largest number");
        }
        else
            System.out.println("C is largest number");
    }
}
