
    // Superclass
    class Animal {
        // Method to be overridden
        void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    // Subclass
    class Dog extends Animal {
        // Overriding the method from Animal class
        @Override
        void makeSound() {
            System.out.println("Bark");
        }
    }

    // Another subclass
    class Cat extends Animal {
        // Overriding the method from Animal class
        @Override
        void makeSound() {
            System.out.println("Meow");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Creating objects of the subclasses
            Animal myDog = new Dog();
            Animal myCat = new Cat();

            // Calling the overridden methods
            myDog.makeSound(); // Output: Bark
            myCat.makeSound(); // Output: Meow
        }
    }

