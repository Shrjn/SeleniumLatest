package CodesForInterview;

import java.sql.SQLOutput;

public class RevString {

    public static void main(String[] args)
    {
        String str = "level";
        String rstr = "";
String temp = str;
        for(int i=str.length()-1;i>=0;i--)
        {
            rstr = rstr + str.charAt(i);
        }
        System.out.println(rstr);

        if(temp.equals(rstr))
            System.out.println("is a pallindrome");
        else System.out.println("not a pallindrome");
    }



}
