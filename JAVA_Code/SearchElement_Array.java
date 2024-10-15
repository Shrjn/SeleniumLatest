package Array_codes;

public class SearchElement_Array {
    public static void main(String[] args) {
        int a[] = {100, 200, 300, 400};
        int search_element = 3;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search_element) {
                System.out.println("Element Found");
              break;
            }
        }
        System.out.println("Element Not Found");
    }
}
