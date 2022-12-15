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

public class Test {
    public static void main(String[] args) {
        Example example = new Example();
        example.animalSound();
        example.message();
    }
}
