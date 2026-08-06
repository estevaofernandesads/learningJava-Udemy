package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Informe os dois valores: ");
        a = sc.nextInt();
        b = sc.nextInt();

        soma = a + b;

        System.out.printf("%d + %d = %d", a, b, soma);

        sc.close();
    }
}
