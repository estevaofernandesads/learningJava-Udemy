package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, imposto = 0;
        System.out.println("Informe o seu salario: ");
        salario = sc.nextDouble();

        if (salario <= 2000){
            System.out.println("Isento!");
        } else if (salario <= 3000) {
            imposto =(salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + (salario - 2000) * 0.08;
        } else {
            imposto = (salario - 4500) * 0.28 + (salario - 3000) * 0.18 + (salario - 2000) * 0.08;
        }

        System.out.printf("R$ %.2f", imposto);

        sc.close();
    }
}
