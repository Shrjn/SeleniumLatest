package Strings;

public class JoinStrings_Concat {

    public static void main(String[] args)
    {
        String a1 = "Shruti";
        String b = "Jain";
        String c = "Capgemini";


        // concatenation of strings
        System.out.println(a1+b);
        // OR
        System.out.println(a1.concat(b));
        // for concatenating 3 strings
        System.out.println(a1.concat(b).concat(c));

        // trim method in strings
        String d = "    Welcome!     ";
        System.out.println("Before trim: "+d.length());
        System.out.println(d.trim());
        System.out.println("After trim: "+d.trim().length());
    }
}
