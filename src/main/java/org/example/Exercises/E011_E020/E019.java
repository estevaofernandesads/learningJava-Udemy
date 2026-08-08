package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipo, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("Informe o item utilizado: ");
        tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo == 1){
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            } else {
                System.out.println("Valor Invalido!");
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);

        sc.close();
    }
}
