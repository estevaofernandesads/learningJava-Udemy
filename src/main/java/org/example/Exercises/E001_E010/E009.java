package org.example.Exercises.E001_E010;

import java.util.Scanner;

public class E009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora = 18;

        if (hora < 12) {         // IF THE CONDITION TRUE, EXECUTE THE COMMAND LINES, IF FALSE, SKIP THE COMMAND LINES
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa Tarde!");
        } else {                // ELSE THE CONDITIONS FALSE EXECUTE THE COMMAND LINE
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
