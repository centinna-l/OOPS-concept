package inheritance;

public class Animal {
    private String name;
    private int age;

    private boolean vegetarian; // Encapsulation

    private String eats; // Encapsulation

    private int noOfLegs; // Encapsulation

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public Animal(boolean veg, String food, int legs) {
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
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

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
