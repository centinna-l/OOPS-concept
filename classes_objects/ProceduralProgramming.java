package classes_objects;

import java.util.Scanner;

class ProceduralProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double farhenite = scanner.nextDouble();
        double celcius = (double) ((farhenite - 32) * 5) / 9;
        System.out.println(celcius);
        scanner.close();
    }
}