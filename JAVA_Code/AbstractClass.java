package Interface_AbstractClass;

abstract class Parent2 {
        public void Hello() {
            System.out.println("Playing cricket");
        }
        abstract public void greet();
    }
    class Child2 extends Parent2 {
        public void Sum() {
            System.out.println("Play Chess");
        }

        @Override
        public void greet() {

            System.out.println("Good morning!!");
        }
        public static void main(String[] args)
        {
            Child2 c = new Child2();
            c.Sum();
            c.greet();
            c.Hello();
          System.out.println();
        }
    }


