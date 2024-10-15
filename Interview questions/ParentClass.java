package CodesForInterview;

public class ParentClass {
    void Sound() { System.out.println("Animal sound");
    }
}
class Dog extends ParentClass {
        void Sound() { System.out.println("Bark");
        }
    }
    class Cat extends ParentClass
    {
        void Sound() { System.out.println("Meow");
        }
    }