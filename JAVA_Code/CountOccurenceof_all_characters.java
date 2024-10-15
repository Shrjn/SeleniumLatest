package CodesForInterview;
import java.util.HashMap;

public class CountOccurenceof_all_characters {
    public static void main(String[] args) {
        String str = "level";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        charCount.forEach((character, count) -> System.out.println(character + ": " + count));
    }
}