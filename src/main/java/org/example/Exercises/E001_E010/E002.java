package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = 6, h = 5, B = 8;

        double area = ((b+B)/2)*h;

        System.out.printf("Valor da area do losango: %.2f", area);

        sc.close();
    }
}
