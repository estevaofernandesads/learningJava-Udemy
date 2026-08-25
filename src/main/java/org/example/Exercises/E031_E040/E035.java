package org.example.Exercises.E031_E040;

import java.util.Scanner;

public class E035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();
        int soma = 0, cont = 0;

        int[] valores = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número: ");
            valores[i] = sc.nextInt();
            if (valores[i] % 2 == 0) {
                soma += valores[i];
                cont++;
            }
        }

        double media = (double) soma / cont;

        if (soma != 0){
            System.out.printf("Media dos pares = %.1f", media);
        } else {
            System.out.println("Nenhum número paz.");
        }


        sc.close();
    }
}
