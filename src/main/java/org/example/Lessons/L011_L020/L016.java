package org.example.Lessons.L011_L020;

import java.util.Scanner;

public class L016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos números deseja somar: ");

        int quant = sc.nextInt();
        int num,soma = 0;

        System.out.println("Informe os números que deseja somar: ");
        for (int i = 0;i < quant; i++){  // IF CONDITION TRUE DO THE COMMAND LINE, IF FALSE, SKIP
            num = sc.nextInt();
            soma += num;
        }

        System.out.println(soma);

        sc.close();
    }
}
