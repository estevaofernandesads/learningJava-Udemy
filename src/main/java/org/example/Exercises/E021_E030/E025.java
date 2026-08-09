package org.example.Exercises.E021_E030;

import java.util.Scanner;

public class E025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe um valor inteiro: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
