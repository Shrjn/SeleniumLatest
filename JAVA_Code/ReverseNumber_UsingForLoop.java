package CodesForInterview;

public class ReverseNumber_UsingForLoop {
    
    public static void main(String []args) {
        int num = 456789;
        int rnum = 0;
        for (;num != 0;)
        {
            int remainder = num % 10;
            rnum = rnum * 10 + remainder;
            num = num / 10;
        }
        System.out.println("Reversed number is: " + rnum);
    }
}
