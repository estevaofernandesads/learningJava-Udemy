package org.example.Projects.Produto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();

        System.out.println("Informe os dados do produto: ");
        System.out.println("Informe o nome do produto: ");
        p1.name = sc.nextLine();
        System.out.println("Informe o preço do produto: ");
        p1.price = sc.nextDouble();
        System.out.println("Informe a quantidade do produto: ");
        p1.quantity = sc.nextInt();

        System.out.printf("Dados do produto: %s%n", p1);
        System.out.println();

        System.out.println("Produtos adicionados no estoque: ");
        int quantity = sc.nextInt();
        p1.addProducts(quantity);
        System.out.printf("Dados atualizados: %s%n", p1);
        System.out.println();

        System.out.println("Produtos removidos do estoque: ");
        quantity = sc.nextInt();
        p1.removeProducts(quantity);
        System.out.printf("Dados atualizados: %s%n", p1);

        sc.close();
    }
}
