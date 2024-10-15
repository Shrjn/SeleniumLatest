package Basics;

import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args)
    {
        System.out.println("Taking input from keyboard");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = sc.nextInt(); // takes input from keyboard
        System.out.println("Enter number2");
        int b = sc.nextInt();
        int Sum = a+b;
        System.out.println("Sum of 2 numbers: "+Sum);
        boolean b1 = sc.hasNextInt(); // validates if input added is int value or not
        System.out.println(b1);
  //      String str = sc.nextLine(); to print the string
        String str = sc.nextLine(); // to print the string even with spaces given in input
        System.out.println(str);
    }
}
