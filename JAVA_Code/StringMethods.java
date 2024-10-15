package Strings;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args)
    {
        String s = "welcome";
        // charAt() is used to return a character from a string based on index
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(1));

        // contains method

        System.out.println(s.contains("Wel"));
        System.out.println(s.contains("wel"));
        System.out.println(s.contains("mj"));
        System.out.println(s.concat(" to home"));

        // equals() and equalsIgnoreCase()
        String s1 = "Shruti";
        String s2 = "Shruti";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Shruti"));
        System.out.println(s1.equalsIgnoreCase("shruti"));

        // replace method
        String s3 = "WELCOME to OLYMIPIA Society";
        System.out.println(s3.replace('e','x'));
        System.out.println(s3.replaceAll("Welcome","Hello"));

        //substring method - extract substring from main string
        System.out.println(s3.substring(0,3));
        System.out.println(s3.substring(3,7));

        // replace method
        System.out.println(s3.replace("e","x"));

        // toUppercase() and toLowercase()
        System.out.println(s.toUpperCase());
        System.out.println(s3.toLowerCase());

        // SPLIT - splits the string into multiple parts based on delimeter
        String s4 = "abc@gmail.com";
        System.out.println("Before splitting: "+s4);
        String a[] = s4.split("@");
        System.out.println("After splitting:");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(Arrays.toString(a));

        // Replace method
        String amount = "$50,77,56";
        System.out.println(amount.replace("$",""));









    }
}
