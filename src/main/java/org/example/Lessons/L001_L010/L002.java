package org.example.Lessons.L001_L010;

import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Locale; // IMPORT CLASS TO USE IN CODE

public class L002 {
    public static void main(String[] args) {

        int y = 30;
        double z = 10.35784;
        String nome = "Maria";
        double renda = 4000.0;

        System.out.println(y);
        System.out.printf("O valor de y é: %d%n", y);
        System.out.printf("O valor de z com duas casas é: %.2f%n", z);
        System.out.printf("O valor de z com quatro casas é: %.4f%n", z);
        Locale.setDefault(Locale.US); // IDENTIFY REGION
        System.out.printf("O valor de z com quatro casas é: %.4f%n", z); // IMPRESS WITH DOT
        System.out.println("Resultado "+ z); // OTHER FORM TO IMPRESS RESULT
        System.out.printf("%s recebe %.2f por %d dias trabalhados.", nome, renda, y);

        /* %f = FLOAT
        * %d = INTEGER
        * %s = TEXT
        * %n = BREAK ROW
        * */
    }
}
