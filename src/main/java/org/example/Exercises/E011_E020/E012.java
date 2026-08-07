package org.example.Exercises.E011_E020;

import java.util.Scanner;

public class E012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaI, horaF, horaJ;

        System.out.println("Informe a hora inicial e final respectivamente: ");
        horaI = sc.nextInt();
        horaF = sc.nextInt();

        if (horaF > horaI){
            horaJ = horaF - horaI;
        } else {
            horaJ = 24 + horaF - horaI;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", horaJ);

        sc.close();
    }
}
