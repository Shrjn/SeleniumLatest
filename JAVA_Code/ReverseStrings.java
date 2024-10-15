package CodesForInterview;
public class ReverseStrings {
    public static void main(String[] args)
    {

        // Approch 1 - Using length() & charAt()
        String str = "Shruti";
        String rstr = "";
        String tempstr = str;
        System.out.println("Before reverse: "+str);
        for(int i = str.length()-1;i>=0;i--)
        {
            rstr = rstr + str.charAt(i); // charAt() - returns char value at specified index // iturhs
        }
        System.out.println("Reversed Number: " +rstr);
        System.out.println("--------------------");
        if(tempstr==rstr)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

        // Approach 2 -- by converting string into array
/*

 /*
        String str1 = "Jain";
        String rstr1 = "";
        System.out.println("Before reverse: "+str1);
        char a[] = str1.toCharArray(); // conversion from string to array
        for (int j = a.length-1; j>=0;j-- )
        {
            rstr1 = rstr1 + a[j];

        }
        System.out.println("After reverse: "+rstr1);

        // Approach3 - Using StringBuffer class
        StringBuffer s = new StringBuffer("SHRUTI JAIN");
        System.out.println("Reversed string is: "+s.reverse());

        // Approach4 - using String builder
        StringBuilder s2 = new StringBuilder("SHRUTI JAIN");
        System.out.println("Reversed string is: "+s2.reverse());

        */
    }


}
