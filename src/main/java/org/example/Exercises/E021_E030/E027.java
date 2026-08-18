package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de valores: ");
        int num = sc.nextInt();

        int [] vet = new int[num];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe um número: ");
            vet [i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");

        for (int i = 0; i < vet.length; i++) {
            if(vet[i] < 0 ){
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
