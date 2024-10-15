package JumpingStatements;

public class ContinueStatements {
    public static void main(String[] args)
    {
        for(int i=0; i<=10;i++)
        {
            if(i==1 || i==3 || i==9)
            {
                continue; // 1 3 and 9 will get skipped and continue will take code back to for loop
            }
            System.out.println(i);
        }
    }
}
