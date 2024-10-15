package Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        System.out.println("Student marks in percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in subject1");
        float a = sc.nextFloat();
        System.out.println("Enter marks in subject2");
        float b = sc.nextFloat();
        System.out.println("Enter marks in subject3");
        float c = sc.nextFloat();
        System.out.println("Enter marks in subject4");
        float d = sc.nextFloat();
        float total = (a + b + c + d) / 4 % 100;
        System.out.println("Total percentage is "+total);
        boolean b1 = sc.hasNextBoolean(); // to know if input is boolean or not
        System.out.println(b1);
    }
}