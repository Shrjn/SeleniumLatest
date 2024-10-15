package LoopingStatements;

public class PrintEvenNumbers {

    public static void main(String[] args) {
            /*
    {
        int i=2;
        while(i<=10)
        {
            System.out.println(i);
           i+=2;
        }
    }
             */
        //Approach 2
        int i = 1;
        while (i <=10) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

