package pl.anna.grossNetCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        GrossNet grossNet = new GrossNet("58444");

        System.out.println(grossNet.calculateGross());
    }
}
