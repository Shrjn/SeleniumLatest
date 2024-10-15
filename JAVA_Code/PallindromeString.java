package CodesForInterview;

import Strings.StringClass;

import java.sql.SQLOutput;

public class PallindromeString {

    public static void main(String[] args) {
        String str = "weter";
        String rstr = "";
        String temp = str;

        for (int i = str.length() - 1; i >= 0; i--)
        {
            rstr = rstr+str.charAt(i);
        }
        System.out.println(rstr);
        if(temp.equals(rstr))
        {
            System.out.println("String is Pallindrome");
        }
        else {
            System.out.println("String is not Pallindrome");
        }


    }
}
