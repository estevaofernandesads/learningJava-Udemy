package org.example.Projects.Calculator_Object;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("Informe o raio: ");
        double raio = sc.nextDouble();
        double cir = cal.circumference(raio);
        double vol = cal.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", cir);
        System.out.printf("Volume: %.2f%n", vol);
        System.out.printf("Valor de PI: %.2f%n", cal.PI);

        sc.close();
    }
}
