package org.example.Projects.Product_Constructor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductConstruct P = new ProductConstruct();  // CONSTRUCTOR DEFAULT

        System.out.println("Informe os dados do produto: ");
        System.out.println("Informe o nome do produto: ");
        String name = sc.nextLine();
        System.out.println("Informe o preço do produto: ");
        double price = sc.nextDouble();
        System.out.println("Informe a quantidade do produto: ");
        int quantity = sc.nextInt();

        ProductConstruct p1 = new ProductConstruct(name, price, quantity);  // CREATES AN OBJECT WITH PREDEFINED ATTRIBUTES

        sc.nextLine();
        System.out.println("Informe os dados do produto: ");
        System.out.println("Informe o nome do produto: ");
        name = sc.nextLine();
        System.out.println("Informe o preço do produto: ");
        price = sc.nextDouble();

        ProductConstruct p2 = new ProductConstruct(name, price);

        System.out.printf("Dados do produto: %s%n", p1);
        System.out.println();

        System.out.printf("Dados do produto: %s%n", p2);
        System.out.println();

        System.out.println("Produtos adicionados no estoque: ");
        quantity = sc.nextInt();
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