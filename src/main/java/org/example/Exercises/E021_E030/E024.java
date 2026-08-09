package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, fat = 1;

        System.out.println("Informe o valor: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}
