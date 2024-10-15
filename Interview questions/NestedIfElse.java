package ConditionalStatements;

public class NestedIfElse {
    public static void main(String[] args)
    {
        if(true)
        {
            if(false)
            {
                System.out.println("abc");
            }
            else
                System.out.println("123");
        }
        else
            System.out.println("XYZ");
    }
}
