package org.example.Projects.Studant;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studant std = new Studant();

        System.out.println("Informe o nome do estudante: ");
        std.nome = sc.nextLine();
        System.out.println("Informa as 3 notas em sequência: ");
        std.nota1 = sc.nextDouble();
        std.nota2 = sc.nextDouble();
        std.nota3 = sc.nextDouble();

        System.out.println(std);

        sc.close();
    }
}