package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant;
        double n1, n2, n3, media;

        System.out.println("Informe o número de casos que deseja informar: ");
        quant = sc.nextInt();

        System.out.println("Informe os valores: ");
        for (int i = 0; quant > i; i++){
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            media = ((2 * n1)+(3 * n2) + (5 * n3))/10;
            System.out.printf("%.1f", media);
        }

        sc.close();
    }
}
