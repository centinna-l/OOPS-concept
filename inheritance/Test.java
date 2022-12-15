package inheritance;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("age");
        int age = scanner.nextInt();
        String junk = scanner.nextLine(); // to remove the extra line after int
        System.out.println("Is Vegetarian");
        boolean isVegetarian = Boolean.parseBoolean(scanner.nextLine());
        Cat cat = new Cat(name, age, isVegetarian);
        System.out.println(cat.toString());
        cat.displayMessage();
        scanner.close();
        System.out.println(junk);
    }
}
