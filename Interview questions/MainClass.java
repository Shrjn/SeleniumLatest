package CodesForInterview;

public class MainClass {
    public static void main(String[] args) {
        ParentClass d = new Dog();
        ParentClass c = new Cat();


        d.Sound();
        c.Sound();

        Dogg dog = new Dogg();
        Catt cat = new Catt();

        // Calling methods from the superclass
        dog.eat(); // Inherited method
        dog.bark(); // Dog's own method

        cat.eat(); // Inherited method
        cat.meow(); // Cat's own method
        }
    }

