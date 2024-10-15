package A_Selenium;

import java.util.HashMap;

public class rString {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(2,"Jain");
        hashMap.put(2,"Tanu");
        hashMap.put(88,"Jain");

        System.out.println(hashMap);
        /*

        String str = "Tanu";
        String rstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr = rstr + str.charAt(i);
        }
        System.out.println(rstr);

 */
    }
}
