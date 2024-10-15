package CodesForInterview;

import static com.google.common.math.IntMath.isPrime;

public class PrimeNumber {

    public static void main(String[] args) {
       int num = 220;
       int count = 0;
       for(int i=1;i<=num;i++)
       {
           if(num%i==0)
           {
               count++;
           }
       }
       if(count==2)
       {
           System.out.println(num+" is a prime number");
       }
       else System.out.println(num+" is not a prime number");
    }
}




/*
        if (isPrime(num)) {
            System.out.println(num+ " is a prime number");
        } else {
            System.out.println(num+ " is not a prime number");
        }


 */

/*
        public static void main(String args[]){
            int i,m=0,flag=0;
            int n=29;//it is the number to be checked
            m=n/2;
            if(n==0||n==1){
                System.out.println(n+" is not prime number");
            }else{
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        System.out.println(n+" is not prime number");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)  { System.out.println(n+" is prime number"); }
            }//end of else
        }

 */
