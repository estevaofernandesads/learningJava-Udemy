package org.example.Exercises.E031_E040;

import java.util.Scanner;

public class E032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números serão digitados: ");
        int quantidade = sc.nextInt();

        double[] vetor = new double[quantidade];
        double  maior = 0;
        int posicao = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            if (maior < vetor[i]){
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println();
        System.out.printf("Maior valor = %.1f%n", maior);
        System.out.printf("Posição do maior valor = %d%n", posicao);

        sc.close();
    }
}
