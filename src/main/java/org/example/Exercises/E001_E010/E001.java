package org.example.Exercises.E001_E010;

import java.util.Locale;
import java.util.Scanner;

public class E001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Produtos: ");
        System.out.printf("%s, com por $%.2f%n", product1, price1);
        System.out.printf("%s, com por $%.2f%n", product2, price2);

        System.out.printf("Recorde: %d anos de idade, codigo %d e genero %s%n", age, code, gender);

        System.out.printf("Valor com oito casas decimais: %.8f%n", measure);
        System.out.printf("Aredondado (Três casas decimais): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US ponto decimal: %.3f", measure);

        sc.close();
    }
}
