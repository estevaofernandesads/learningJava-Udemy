package org.example.Projects.Bank;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b1;

        System.out.println("Informe o número da conta: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.println("Informe o nome da conta: ");
        String name = sc.nextLine();

        System.out.println("Tem algum deposito inicial?(y/n)");
        char option = sc.next().charAt(0);

        if (option == 'y'){
            System.out.println("Informe o valor inicial: ");
            double inicialDeposit = sc.nextDouble();
            b1 = new Bank(name , number, inicialDeposit);
        } else {
            b1 = new Bank(name, number);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(b1);

        System.out.println("Informe o valor do deposito: ");
        double depositValue = sc.nextDouble();
        b1.deposit(depositValue);
        System.out.println("Valor da conta atualizado: ");
        System.out.println(b1);

        System.out.println("Informe o valor do saque: ");
        double saqueValue = sc.nextDouble();
        b1.withdraw(saqueValue);
        System.out.println("Valor da conta atualizado: ");
        System.out.println(b1);

        sc.close();
    }
}
