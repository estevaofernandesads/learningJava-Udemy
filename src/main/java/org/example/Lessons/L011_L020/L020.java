package org.example.Lessons.L011_L020;

import java.util.Scanner;

public class L020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, y1, x3, x2, y2, y3, area, area1, area2;

        System.out.println("Informe os lados do triangulo 1: ");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        System.out.println("Informe os lados do triangulo 2: ");
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        y3 = sc.nextDouble();

        area = (x1 + x2 + x3)/2;
        area1 = Math.sqrt(area * (area - x1) * (area - x2) * (area - x3));
        area = (y1 + y2 + y3)/2;
        area2 = Math.sqrt(area * (area - y1) * (area - y2) * (area - y3));

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
