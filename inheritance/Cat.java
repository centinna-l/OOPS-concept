package inheritance;

public class Cat extends Animal {

    private String color;

    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = "White";
    }

    public Cat(boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isVegetarian() {
        // TODO Auto-generated method stub
        System.out.println("Super" + super.isVegetarian());
        return false;
    }

}
