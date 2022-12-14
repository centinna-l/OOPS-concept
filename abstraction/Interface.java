package abstraction;

interface Animale {
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animale {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Cat implements Animale {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: meow");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Interface {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        Cat myCat = new Cat(); // Create a Cat object
        myCat.animalSound();
        myCat.sleep();
    }
}
