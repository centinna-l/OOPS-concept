package abstraction;

class Example extends AbsExample {
    @Override
    public void animalSound() {
        // TODO Auto-generated method stub
        System.out.println("Meow");
    }

    @Override
    public void message() {
        // TODO Auto-generated method stub
        super.message();
        System.out.println("Example Class");
    }
}

// Abstract clas
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class Test {
    public static void main(String[] args) {
        Example example = new Example();
        example.animalSound();
        example.message();
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
