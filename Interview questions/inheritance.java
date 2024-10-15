package CodesForInterview;

public class inheritance {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
    // Subclass (Child class)
    class Dogg extends inheritance {
        void bark() {
            System.out.println("The dog barks.");
        }
    }
    // Another subclass
    class Catt extends inheritance {
        void meow() {
            System.out.println("The cat meows.");
        }
    }
   //public class Main {
        //public static void main(String[] args) {
            // Creating instances of Dog and Cat
      //  }
  //  }