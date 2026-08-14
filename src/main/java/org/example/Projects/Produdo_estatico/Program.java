package org.example.Projects.Produdo_estatico;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        double raio = sc.nextDouble();

        double cir = Product.circumference(raio);
        double vol = Product.volume(raio);

        System.out.printf("Circumferencia: %.2f%n", cir);
        System.out.printf("Volume: %.2f%n", vol);
        System.out.printf("Valor de PI: %.2f%n", Product.PI);

        sc.close();
    }
}