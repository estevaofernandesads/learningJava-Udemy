package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Informe os dois valores: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São Multiplos!");
        } else {
            System.out.println("Não São Multiplos");
        }

        sc.close();
    }
}
