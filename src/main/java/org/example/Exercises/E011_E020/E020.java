package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe um valor de 1 a 1000: ");

        num = sc.nextInt();

        while (num < 1 || num > 1000){
            System.out.println("Número Invalido, tente novamente: ");
            num = sc.nextInt();
        }

        for (int i = 1; i <= num; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
