package org.example.Lessons.L011_L020;

import java.util.Scanner;

public class L017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempC, tempF;
        char  option;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            tempC = sc.nextDouble();
            tempF = ((9*tempC)/5)+32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempF);
            System.out.println("Deseja repetir (s/n)?");
            option = sc.next().charAt(0);
        } while(option != 'n');

        sc.close();
    }
}
