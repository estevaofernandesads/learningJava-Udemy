package org.example.Projects.Calculator_Static;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        double raio = sc.nextDouble();

        double cir = Calculator.circumference(raio);
        double vol = Calculator.volume(raio);

        System.out.printf("Circumferencia: %.2f%n", cir);
        System.out.printf("Volume: %.2f%n", vol);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

        sc.close();
    }
}