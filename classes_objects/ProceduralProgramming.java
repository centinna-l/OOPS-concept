package classes_objects;

import java.util.Scanner;

public class ProceduralProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double farenite = sc.nextDouble();
        double celcius = (double) ((farenite - 32) * 5) / 9;
        System.out.println(celcius);
        sc.close();
    }
}
