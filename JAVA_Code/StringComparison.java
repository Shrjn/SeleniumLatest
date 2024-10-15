package Strings;

public class StringComparison {

    public static void main(String[] args)
    {
        // Case1
        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1==s2); // true
        System.out.println(s1.equals(s2)); // true
        // no difference

        //Case2
        System.out.println("Case2--------");
        String s3 = new String("welcome");
        String s4 = new String("welcome");

        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s3==s4); // false -- s3 and s4 are two different objects
        System.out.println(s3.equals(s4)); // true -- here the values of s3 and s4 are same

        // case 3 and case4
    }
}
