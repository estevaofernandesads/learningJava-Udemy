package org.example.Lessons.L011_L020;

import java.util.Scanner;

public class L019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Informe os três números: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int oMaior = max(a, b,c);

        resultado(oMaior);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int maior;
        if (x > y && x > z){
            maior = x;
        } else if (y > z){
            maior = y;
        } else {
            maior = z;
        }
        return maior;
    }

    public static void resultado (int valor){
        System.out.printf("O maior = %d",valor);
    }
}
