package org.example.Projects.Product_incapsulamento;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductIncapsulamento p = new ProductIncapsulamento();  // CONSTRUCTOR DEFAULT

        System.out.println("Informe os dados do produto: ");
        System.out.println("Informe o nome do produto: ");
        p.setName(sc.nextLine());
        System.out.println("Informe o preço do produto: ");
        p.setPrice(sc.nextDouble());
        System.out.println("Informe a quantidade do produto: ");
        int quantity = sc.nextInt();

        System.out.printf("Dados do produto: %s%n", p);
        System.out.println();

        System.out.println("Produtos adicionados no estoque: ");
        quantity = sc.nextInt();
        p.addProducts(quantity);
        System.out.printf("Dados atualizados: %s%n", p);
        System.out.println();

        System.out.println("Produtos removidos do estoque: ");
        quantity = sc.nextInt();
        p.removeProducts(quantity);
        System.out.printf("Dados atualizados: %s%n", p);

        sc.close();
    }
}
