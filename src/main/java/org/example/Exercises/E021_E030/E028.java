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
            if(alturas[i] > 16){
                soma++;
            }
        }

        double alturaMedia = soma / num;

        sc.close();
    }
}
