package classes_objects;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in farenite");
        double farenite = sc.nextDouble();
        // Declare the object

        Temperature temperature = new Temperature(farenite); // Instance of the class Temperature
        System.out.println(temperature.toString());
        sc.close();
    }
}