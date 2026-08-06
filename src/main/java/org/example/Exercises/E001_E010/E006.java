package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        double horas, pgPorHora, salario;

        System.out.println("Informe o número do funcionário: ");
        num = sc.nextInt();
        System.out.println("Informe o número de horas trabalhadas: ");
        horas = sc.nextDouble();
        System.out.println("Informe o valor pago por hora trabalhada: ");
        pgPorHora = sc.nextDouble();

        salario = horas * pgPorHora;

        System.out.printf("Número do funcionario: %d%n", num);
        System.out.printf("Salario: U$ %.2f", salario);


        sc.close();
    }
}
