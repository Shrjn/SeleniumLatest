package main.Methods;

public class DifferentMethods {
void m1() // no parameters no return value and if not returninn any value - specify void
{
    System.out.println("Hello");
}
String m2() // no parameters and returns value and so need to give some datatype
    {
    return "Hello"; // or return("Hello");
    }
void m3(String name) // parameters and no return value and so need to give some parameter
    {
    System.out.println("Hello "+name);
    }

String m4(String name) // parameters and no return value and so need to give some parameter
    {
        return ("Hello "+name);
    }
}
