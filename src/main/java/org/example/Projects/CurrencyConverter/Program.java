package org.example.Projects.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço do dolar: ");
        Converter.precoDolar = sc.nextDouble();
        System.out.println("Informe quantos dolars deseja comprar: ");
        Converter.quantidadeDolars = sc.nextDouble();

        System.out.printf("Você ira pagar: R$%.2f%n", Converter.valorPagar(Converter.precoDolar, Converter.quantidadeDolars));

        sc.close();
    }
}