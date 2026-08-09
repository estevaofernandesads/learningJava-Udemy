package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, quad, cub;

        System.out.println("Informe o número desejado: ");
        num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            quad = (int) Math.pow(i, 2);
            cub = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n", i, quad, cub);
        }

        sc.close();
    }
}
