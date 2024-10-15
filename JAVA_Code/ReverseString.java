package Strings;

public class ReverseString {

    public static void main(String[] args)
    {

        // Approch 1 - Using length() & charAt()
    String str = "Shruti";
    String rstr = "";
        System.out.println("Before reverse: "+str);
   for(int i = str.length()-1;i>=0;i--)
    {
        rstr = rstr + str.charAt(i);
    }
        System.out.println("Reversed Number: " +rstr);






   // Approach 2 -- without using length() & charAt() string methods

        String str1 = "Jain";
        String rstr1 = "";
        System.out.println("Before reverse: "+str1);
        char a[] = str1.toCharArray(); // conversion from string to array
        for (int j = a.length-1; j>=0;j-- )
        {
            rstr1 = rstr1 + a[j];

        }
        System.out.println("After reverse: "+rstr1);

    }

}
