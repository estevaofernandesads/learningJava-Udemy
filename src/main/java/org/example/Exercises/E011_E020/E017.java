package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaValida = 2002, senha = 0;

        while (senha != senhaValida){
            System.out.println("Informe a senha correta: ");
            senha = sc.nextInt();
            System.out.println("Senha Invalida!");
        }

        System.out.println("Acesso Permitido!");

        sc.close();
    }
}
