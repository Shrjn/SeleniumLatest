package CodesForInterview;

public class CountOccurenceof_only_one_Character {

    public static void main(String[] args)
    {
        String s = "level";
        char c = 'l';
        int count = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)
            {
                count++;
            }
        }
        System.out.println("count="+count);



    }


}
