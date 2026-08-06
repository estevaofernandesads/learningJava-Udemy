package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi, raio, area;

        System.out.println("Informe o valor do raio: ");
        raio = sc.nextDouble();
        pi = Math.PI;

        area = pi * Math.pow(raio, 2);
        System.out.printf("A area é %.4f", area);

        sc.close();
    }
}
