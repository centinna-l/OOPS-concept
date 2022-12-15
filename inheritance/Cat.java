package inheritance;

public class Cat extends Animal {
    private boolean isVegetarian;

    Cat(String name, int age, boolean isVegetarian) {
        super(name, age);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Vegetarian? " + this.isVegetarian;
    }

}
