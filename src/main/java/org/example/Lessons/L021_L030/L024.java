package org.example.Lessons.L021_L030;

import javax.xml.transform.Source;
import java.util.Scanner;

public class L024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas vão ser informadas: ");
        int n = sc.nextInt();
        double [] vect = new double[n];
        double soma = 0;

        System.out.println("Informe as notas: ");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            soma+=vect[i];
        }

        double media = soma/n;

        System.out.printf("A media é: %.2f", media);

        sc.close();
    }
}
