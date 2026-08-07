package org.example.Lessons.L011_L020;

import java.util.Scanner;

public class L013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco /*, desconto*/;

        System.out.println("Informe o preço do produto: ");
        preco = sc.nextDouble();

        /*
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        */

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Desconto de: %.2f", (preco - desconto));

        sc.close();
    }
}
