package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO!");
        } else if (num == 0){
            System.out.println("ZERO!");
        }
        else{
            System.out.println("NÃO NEGATIVO!");
        }

        sc.close();
    }
}
