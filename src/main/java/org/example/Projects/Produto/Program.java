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

        System.out.println(p1.toString());

        System.out.println("Produtos adicionados no stock: ");
        p1.addProducts(p1.quantity);
        System.out.println(p1.toString());

        System.out.println("Produtos removidos do stock: ");
        p1.removeProducts(p1.quantity);
        System.out.println(p1.toString());

        sc.close();
    }
}
