package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant, num, in = 0, out = 0;

        System.out.println("Informe a quantidade de números a se informar: ");
        quant = sc.nextInt();

        System.out.println("Informe os valores: ");
        for(int i = 0; i < quant; i++){
            num = sc.nextInt();

            if (num >= 10 && num <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d In%n", in);
        System.out.printf("%d Out%n", out);

        sc.close();
    }
}
