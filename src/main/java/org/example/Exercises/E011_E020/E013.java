package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code, quant;
        double valor;

        System.out.println("Informe o codigo do item e a quantidade: ");
        code = sc.nextInt();
        quant = sc.nextInt();

        if (code == 1){
            valor = quant * 4.00;
        } else if (code == 2) {
            valor = quant * 4.50;
        } else if (code == 3) {
            valor = quant * 5.00;
        } else if (code == 4) {
            valor = quant * 2.00;
        } else {
            valor = quant * 1.50;
        }

        System.out.printf("Total: R$ %.2f", valor);

        sc.close();
    }
}
