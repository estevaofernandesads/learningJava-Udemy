package org.example.Projects.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rc = new Rectangle();

        System.out.println("Informe a largura e altura respectivamente do retangulo: ");
        rc.width = sc.nextDouble();
        rc.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rc.area());
        System.out.printf("PERIMETRO = %.2f%n", rc.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rc.diagonal());

        sc.close();
    }
}
