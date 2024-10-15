package CodesForInterview;

public class ReverseNumber_UsingWhileLoop {
    public static void main(String[] args) {

   int num = 4576;
   int rnum = 0;

   while(num!=0)
   {
       int tnum = num%10;
       rnum = rnum*10+tnum;
       num = num/10;
   }
        System.out.println(rnum);








 /*
        int num = 1221; // 123
        int rnum = 0;
        int ornum = num;
        while (num != 0) {
            int tnum = num % 10; // will give remainder after dividing by 10 // 4/ 3 / 2 / 1
            rnum = rnum * 10 + tnum; // 40+3 = 43  // 430+2 = 4320+1 = 4321
            num = num / 10; // method to divide number with 10. //12 // 1 / 0
        }
      //  System.out.println("reversed number is " + rnum);
        if (ornum == rnum) {
            System.out.println(num + " is Palindrome.");
        }
        else {
            System.out.println(num + " is not Palindrome.");
        }



 */
    }

}
