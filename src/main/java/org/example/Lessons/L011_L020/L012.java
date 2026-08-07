package org.example.Lessons.L011_L020;

import java.util.EventListener;
import java.util.Scanner;

public class L012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code;
        String dia;

        System.out.println("Informe o codigo do dia: ");
        code = sc.nextInt();

        /*
        if (code == 1){
            dia = "DOMINGO";
        } else if (code == 2) {
            dia = "SEGUNDA-FEIRA";
        } else if (code == 3) {
            dia = "TERÇA-FEIRA";
        } else if (code == 4) {
            dia = "QUARTA-FEIRA";
        } else if (code == 5) {
            dia = "QUINTA-FEIRA";
        } else if (code == 6) {
            dia = "SEXTA-FEIRA";
        } else if (code == 7) {
            dia = "SABADO";
        } else {
            dia = "VALOR INVALIDO!";
        } */

        /*
        switch (code) {
            case 1:
                dia = "DOMINGO";
                break;
            case 2:
                dia = "SEGUNDA-FEIRA";
                break;
            case 3:
                dia = "TERÇA-FEIRA";
                break;
            case 4:
                dia = "QUARTA-FEIRA";
                break;
            case 5:
                dia = "QUINTA-FEIRA";
                break;
            case 6:
                dia = "SEXTA-FEIRA";
                break;
            case 7:
                dia = "SABADO";
                break;
            default:
                dia = "VALOR INVALIDO!";
                break;
        }
         */

        dia = switch (code) {
            case 1 -> "DOMINGO";
            case 2 -> "SEGUNDA-FEIRA";
            case 3 -> "TERÇA-FEIRA";
            case 4 -> "QUARTA-FEIRA";
            case 5 -> "QUINTA-FEIRA";
            case 6 -> "SEXTA-FEIRA";
            case 7 -> "SABADO";
            default -> "VALOR INVALIDO!";
        };

        System.out.printf("Dia da semana: %s", dia);

        sc.close();
    }
}
