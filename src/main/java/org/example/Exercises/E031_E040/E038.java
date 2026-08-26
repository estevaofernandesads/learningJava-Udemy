package org.example.Exercises.E031_E040;

import java.util.Scanner;

public class E038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidade = sc.nextInt();
        char[] sexo = new char[quantidade];
        double[] altura = new double[quantidade];
        double maiorAltura = 0, soma = 0;
        int  numeroHomens = 0;

        for (int i = 0; i < quantidade; i++) {
            sc.nextLine();
            System.out.printf("Altura da %d° pessoa: ", i+1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %d° pessoa: ", i+1);
            sexo[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];

        for (int i = 0; i < quantidade; i++) {
            if (menorAltura > altura[i]) {
                menorAltura = altura[i];
            }
            if (maiorAltura < altura[i]){
                maiorAltura = altura[i];
            }
            if (sexo[i] == 'M' || sexo[i] == 'm'){
                numeroHomens++;
            }

            if (sexo[i] == 'F' || sexo[i] == 'f'){
                soma += altura[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f%n", soma/(quantidade-numeroHomens));
        System.out.printf("Número de homens = %d%n", numeroHomens);

        sc.close();
    }
}
