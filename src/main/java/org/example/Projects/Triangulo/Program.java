package org.example.Projects.Triangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Informe os lados do triangulo 1: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Informe os lados do triangulo 2: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area1 = x.area();
        double area2 = y.area();

        System.out.printf("A area do Triangulo X: %.4f%n", area1);
        System.out.printf("A area do Triangulo Y: %.4f%n", area2);

        if (area1 > area2){
            System.out.println("A maior area é X");
        } else {
            System.out.println("A maior area é Y");
        }

        sc.close();
    }
}
