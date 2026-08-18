package org.example.Lessons.L021_L030;

import java.util.Scanner;

public class L025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de produtos: ");

        int n = sc.nextInt();

        Produtosvect[] vect = new Produtosvect[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.println("Nome do produtos seguido do preço: ");
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Produtosvect(name, price);
        }

        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vect[i].getPrice();
        }

        double media = soma / n;

        System.out.printf("Media: %.2f", media);

        sc.close();
    }

    public static class Produtosvect{
        private String name;
        private double price;

        public Produtosvect(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
