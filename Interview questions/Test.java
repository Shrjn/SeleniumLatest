package A_Selenium;

public class Test {
        public static void main(String[] args) {
            String input = "4R3J";
            String output = expandString(input);
            System.out.println(output);
        }

        public static String expandString(String input) {
            StringBuilder result = new StringBuilder();
            int i = 0;

            while (i < input.length()) {
                char ch = input.charAt(i);
                if (Character.isDigit(ch)) {
                    int count = Character.getNumericValue(ch);
                    char nextChar = input.charAt(i + 1);
                    for (int j = 0; j < count; j++) {
                        result.append(nextChar);
                    }
                    i++; // Move past the character
                }
                i++;
            }
            return result.toString();
        }
    }
