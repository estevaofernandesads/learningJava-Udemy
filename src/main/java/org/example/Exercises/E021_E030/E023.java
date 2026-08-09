package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant, numera, denomi;
        double div;

        System.out.println("Informe a quantidade de divisões: ");
        quant = sc.nextInt();

        System.out.println("Infome quais números serão divididos: ");
        for (int i = 0; i < quant; i++) {
            numera = sc.nextInt();
            denomi = sc.nextInt();
            if (denomi == 0){
                System.out.println("divisão impossível");
            } else {
                div = (double) numera/ denomi;
                System.out.printf("%.1f", div);
            }
        }

        sc.close();
    }
}
