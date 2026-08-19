package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int num = sc.nextInt();
        int[] numeros = new int[num];
        int cont = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números pares: ");
        for (int i = 0; i < num; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("%d ", numeros[i]);
                cont++;
            }
        }

        System.out.println();
        System.out.printf("Quantidade de pares: %d", cont);

        sc.close();
    }
}
