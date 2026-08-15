package org.example.Projects.CurrencyConverter;

public class Converter {
<<<<<<< HEAD
    public static double price;
    public static double dollars;

=======
    public static double precoDolar;
    public static double quantidadeDolars;
    public static final double TAXA =  0.035 ;
>>>>>>> dd1a26a02f838e95c7645c962296d3a5ce50e9e2

    public static double valorPagar(double precoDolar, double quantidadeDolars){
        return precoDolar * quantidadeDolars * (1 - TAXA);
    }

}