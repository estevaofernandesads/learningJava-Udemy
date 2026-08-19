package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");

        int num = sc.nextInt();
        double[] reais = new double[num];
        double soma = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Digite um número: ");
            reais[i] = sc.nextInt();
            soma+= reais[i];
        }

        System.out.println();

        System.out.print("Valores = ");
        for (int i = 0; i < num; i++) {
            System.out.print(reais[i] + " ");
        }

        System.out.println();

        double media = soma/num;

        System.out.printf("Soma = %.2f%n", soma);
        System.out.printf("Media = %.2f", media);

        sc.close();
    }
}
