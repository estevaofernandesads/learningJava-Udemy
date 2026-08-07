package org.example.Lessons.L011_L020;

import java.util.Scanner;

public class L014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metros, area, preco;

        System.out.println("Informe a largura, comprimento e metros: ");
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        metros = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metros;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
