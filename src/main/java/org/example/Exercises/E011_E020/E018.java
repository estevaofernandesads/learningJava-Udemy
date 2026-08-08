package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Informe os valores de x e y respectivamente: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x!=0 && y!=0){
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            System.out.println("Informe os valores de x e y respectivamente: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
