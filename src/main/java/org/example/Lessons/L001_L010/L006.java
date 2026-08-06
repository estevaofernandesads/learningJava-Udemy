package org.example.Lessons.L001_L010;

import java.util.zip.ZipEntry;

public class L006 {
    public static void main(String[] args) {

         double x = 3.0;
         double y = 4.0;
         double z = -5.0;
         double A, B, C;

         double delta;

         A = Math.sqrt(x);
         B = Math.sqrt(y);
         C = Math.sqrt(Math.abs(z));
        System.out.printf("Raiz quadradada de %.2f = %.2f%n", x, A);
        System.out.printf("Raiz quadradada de %.2f = %.2f%n", y, B);
        System.out.printf("Raiz quadradada do valor absoluto de %.2f = %.2f%n", z, C);

        A = Math.pow(x, y);
        B = Math.pow(x, z);
        C = Math.pow(z, y);
        System.out.printf("%.2f elevado á %.2f = %.2f%n", x, y, A);
        System.out.printf("%.2f elevado á %.2f = %.2f%n", x, z, B);
        System.out.printf("%.2f elevado á %.2f = %.2f%n", z, y, C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.printf("Valor absoluto de %.2f = %.2f%n", y, A);
        System.out.printf("Valor absoluto de %.2f = %.2f%n", z, B);

        delta = Math.pow(y, 2) - 4*x*z;
        double x1 = (-y + Math.sqrt(delta))/(2 * x);
        double x2 = (-y - Math.sqrt(delta))/(2 * x);

        System.out.println(x1);
        System.out.println(x2);
    }
}
