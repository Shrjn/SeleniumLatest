package CodesForInterview;

public class MethodOverloading {
    int a = 7;
    int b = 9;
    void Sum() {
        System.out.println(a + b);
    }
    void Sum(int x, int y) {
        System.out.println(x + y);
    }
    void Sum(int x, float y) {
        System.out.println(x + y);
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.Sum();
        m.Sum(111, 344);
        m.Sum(5,6.5F);
    }
}
