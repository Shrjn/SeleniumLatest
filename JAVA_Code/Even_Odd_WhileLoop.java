package LoopingStatements;

public class Even_Odd_WhileLoop {

    public static void main(String[] args)
    {
        int i=1;
        while(i<=10)
        {
            if(i%2==0){
                System.out.println(i +" is a Even number");
            }
            else{
                System.out.println(i +" is a Odd number");
            }
            i++;
        }


    }
}
