package org.example.Exercises.E031_E040;

import java.awt.geom.QuadCurve2D;
import java.util.Scanner;

public class E037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int quantidade = sc.nextInt();
        String[] nome = new String[quantidade];
        double[] primeiraNota = new double[quantidade];
        double[] segundaNota = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            sc.nextLine();
            System.out.printf("Digite o nome, primeira e segunda nota do %d° aluno: %n", i+1);
            nome[i] = sc.nextLine();
            primeiraNota[i] = sc.nextDouble();
            segundaNota[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < quantidade; i++) {
            double media = (primeiraNota[i] + segundaNota[i]) / 2;
            if (media >= 6){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
