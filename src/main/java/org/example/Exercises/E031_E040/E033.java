package org.example.Exercises.E031_E040;

import java.util.Scanner;

public class E033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int quantidade = sc.nextInt();

        int[] vetorA = new int[quantidade];
        int[] vetorB = new int[quantidade];
        int[] resultante = new int[quantidade];

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i < quantidade; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");

        for (int i = 0; i < quantidade; i++) {
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < quantidade; i++) {
            resultante[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor Resultante: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.println(resultante[i]);
        }

        sc.close();
    }
}
