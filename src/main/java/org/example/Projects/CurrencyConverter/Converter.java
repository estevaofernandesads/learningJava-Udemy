package org.example.Projects.CurrencyConverter;

public class Converter {

    public static double price;
    public static double dollars;

    public static double precoDolar;
    public static double quantidadeDolars;
    public static final double TAXA =  0.035 ;


    public static double valorPagar(double precoDolar, double quantidadeDolars){
        return precoDolar * quantidadeDolars * (1 - TAXA);
    }

}