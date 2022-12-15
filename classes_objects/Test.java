package classes_objects;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double farhenite;
        System.out.println("Enter the the temperature in Farhenite");
        farhenite = scanner.nextDouble();
        Temperature temperature = new Temperature(farhenite);
        System.out.println(temperature.getCelcius());
        scanner.close();
    }

}
