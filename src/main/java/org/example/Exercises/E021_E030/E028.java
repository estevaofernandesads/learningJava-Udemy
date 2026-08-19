package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de pessoas: ");
        int num = sc.nextInt();

        String[] nomes = new String[num];
        int[] idades = new int[num];
        double[] alturas = new double[num];
        double soma = 0;

        for (int i = 0; i < num; i++) {
            System.out.printf("Dados da %d Pessoa: %n", i+1);
            sc.nextLine();
            System.out.print("Name: ");
            nomes[i]= sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        for (int i = 0; i < num; i++) {
            soma+= alturas[i];
        }

        double alturaMedia = soma / num;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", alturaMedia);

        int count = 0;

        for (int i = 0; i < num; i++) {
            if (idades[i]<16){
                count++;
            }
        }

        double percent = (double) count * 100 / num;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i = 0; i < num; i++) {
            if (idades[i]<16){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
