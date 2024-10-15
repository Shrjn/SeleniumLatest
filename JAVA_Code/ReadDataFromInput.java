package Basics;

import java.util.Scanner;

public class ReadDataFromInput {

    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = s.nextInt();
        System.out.println("Entered number: " +num);

        // taking multiple inputs from keyboard
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter ages to add ");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        int sum = a+b;
        System.out.println("Sum of the ages: " +sum);

        //-------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unknown value");
        Object value = sc.next(); // .next will take any type of input
        System.out.println(value);


    }
}
