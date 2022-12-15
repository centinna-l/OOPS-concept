package classes_objects;

import java.text.DecimalFormat;

public class Temperature {
    private double farhenite; // Encapsulation
    private double celcius; // Encapsulation

    Temperature(double farhenite) {
        this.farhenite = farhenite;
        this.celcius = (toCelcius());
    }

    // Celcius
    private double toCelcius() {
        return (double) ((farhenite - 32) * 5) / 9;
    }

    // Getter
    public double getCelcius() {
        return this.celcius;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return "Farhenite " + this.farhenite + " Celcius: " + decimalFormat.format(this.celcius);
    }
}
