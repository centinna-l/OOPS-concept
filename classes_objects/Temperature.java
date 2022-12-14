package classes_objects;

import java.text.DecimalFormat;

public class Temperature {
    private double farhenite;
    private double celcius;

    Temperature(double farhenite) {
        this.farhenite = farhenite;
        this.celcius = getCelcius();
    }

    // Getter Methods
    public double getFarhenite() {
        return this.farhenite;
    }

    public double getCelcius() {
        return (double) ((farhenite - 32) * 5) / 9;
    }

    // Setter Methods
    public void setFarhenite(double farhenite) {
        this.farhenite = farhenite;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return "Farhenite " + this.farhenite + " Celcius " + decimalFormat.format(this.celcius);
    }

}
