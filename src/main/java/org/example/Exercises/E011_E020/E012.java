package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaI, horaF, horaJ;

        System.out.println("Informe a hora inicial e final respectivamente: ");
        horaI = sc.nextInt();
        horaF = sc.nextInt();

        horaJ = horaF - horaI;

        if (horaJ > 0){
            System.out.printf("O JOGO DUROU %d HORA(S)", horaJ);
        } else if (horaJ < 0) {
            horaJ = 24 + horaJ;
            System.out.printf("O JOGO DUROU %d HORA(S)", horaJ);
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();
    }
}
