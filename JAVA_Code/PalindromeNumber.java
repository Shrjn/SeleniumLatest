package CodesForInterview;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 1221;
        int rev_num = 0;
        int temp = num;
        while(num!=0)
    {
            int remainder = num % 10;
            rev_num = rev_num * 10 + remainder;
            num = num / 10;
        }
        System.out.println(rev_num);
            if(temp==rev_num)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }
    }

