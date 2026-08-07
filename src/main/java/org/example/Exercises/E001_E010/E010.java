package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("PAR!");
        } else {
            System.out.println("IMPAR!");
        }

        sc.close();
    }
}
