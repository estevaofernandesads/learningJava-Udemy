package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTri, areaCir, areaTrap, areaQua, areaRet;

        System.out.println("Informe os 3 valores: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTri = (A * C)/2;
        areaCir = Math.pow(C,2)*Math.PI;
        areaTrap = ((A + B)/2 )* C;
        areaQua = Math.pow(B,2);
        areaRet = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTri);
        System.out.printf("CIRCULO: %.3f%n", areaCir);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
        System.out.printf("QUADRADO: %.3f%n", areaQua);
        System.out.printf("RETANGULO: %.3f%n", areaRet);

        sc.close();
    }
}
