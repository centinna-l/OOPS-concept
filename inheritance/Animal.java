package inheritance;

public class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayMessage() {
        System.out.println("Hello this is " + this.name);
    }

    public String toString() {
        return "Name of the Animal is " + this.name + " and age is " + this.age;
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
