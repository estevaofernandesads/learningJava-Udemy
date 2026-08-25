package org.example.Exercises.E031_E040;

import java.util.Scanner;

public class E031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho do hotel: ");
        int tamanho = sc.nextInt();

        Rent[] vect = new Rent[tamanho];

        System.out.println("Quantos quartos estão alugados: ");
        int alugados = sc.nextInt();

        for (int i = 1; i <= alugados; i++) {
            System.out.printf("Alugados #%d:  %n", i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < tamanho; i++) {
            if (vect[i] != null) {
                System.out.printf("%d: %s%n", i, vect[i]);
            }
        }

        sc.close();
    }

    public static class Rent {
        private String name;
        private String email;

        private Rent(){
        }

        public Rent(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("%s, %s", name, email) ;
        }
    }
}
