package org.example.Exercises.E031_E040;

import java.util.Scanner;

public class E034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();
        double soma = 0;

        double[] vetor = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / quantidade;

        System.out.println();
        System.out.printf("Media do vetor = %.3f%n", media);
        System.out.println("Elementos abaixa da media: ");

        for (int i = 0; i < quantidade; i++) {
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
