package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code1, code2, quantidade1, quantidade2;
        double valor1, valor2, quantoPagar;

        System.out.println("Informe o codigo da peça: ");
        code1 = sc.nextInt();
        System.out.println("Informe a quantidade de peças: ");
        quantidade1 = sc.nextInt();
        System.out.println("Informe o valor de cada peça: ");
        valor1 = sc.nextDouble();
        System.out.println("Informe o codigo da peça: ");
        code2 = sc.nextInt();
        System.out.println("Informe a quantidade de peças: ");
        quantidade2 = sc.nextInt();
        System.out.println("Informe o valor de cada peça: ");
        valor2 = sc.nextDouble();

        quantoPagar = quantidade1 * valor1 + quantidade2 * valor2;

        System.out.printf("Valor a pagar: R$ %.2f",quantoPagar);

        sc.close();
    }
}
