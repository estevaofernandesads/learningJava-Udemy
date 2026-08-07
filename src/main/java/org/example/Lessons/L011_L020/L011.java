package org.example.Lessons.L011_L020;

import java.util.Scanner;

public class L011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double minutos, restante;

        System.out.println("Informe quantos minutos foram utilizados: ");
        minutos = sc.nextDouble();
        restante = 50;

        if (minutos > 100){
            restante += (minutos - 100) * 2;
        }

        System.out.printf("Valor a pagar %.2f", restante);

        sc.close();
    }
}
