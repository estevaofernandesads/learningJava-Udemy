package org.example.Exercises.E031_E040;

import java.util.Scanner;

public class E036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int quantidade = sc.nextInt();
        String[] nome = new String[quantidade];
        int[] idade = new int[quantidade];
        int idadeMaior = 0;
        String maior= "";

        for (int i = 0; i < quantidade; i++) {
            sc.nextLine();
            System.out.printf("Dados da %d pessoa: %n", i+1);
            nome[i] = sc.nextLine();
            idade[i] = sc.nextInt();
            if (idadeMaior < idade[i]){
                idadeMaior = idade[i];
                maior = nome[i];
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", maior);

        sc.close();
    }
}
