package org.example.Lessons.L021_L030;

import java.util.Scanner;

public class L021 {

    public static final double PI = 3.14159;  // FINAL - TO SET THIS VALUE AS CONSTANT

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio: ");
        double raio = sc.nextDouble();

        double cir = circumference(raio);

        double vol = volume(raio);

        System.out.printf("Circunferencia: %.2f%n", cir);
        System.out.printf("Volume: %.2f%n", vol);
        System.out.printf("Valor de PI: %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double raio){
        return 2 * PI * raio;
    }

    public static double volume(double raio){
        return 4 * PI * Math.pow(raio, 3) / 3;
    }
}