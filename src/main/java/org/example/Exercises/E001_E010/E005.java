package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, result;

        System.out.println("Informe os 4 valores inteiros: ");

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        result = (A * B - C *D);

        System.out.printf("A razão da diferença é: %d", result);

        sc.close();
    }
}
