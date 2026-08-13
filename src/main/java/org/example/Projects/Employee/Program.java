package org.example.Projects.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Nome: ");
        emp.name = sc.nextLine();
        System.out.println("Salario bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Taxa: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.print(emp);   // PRINT THE OBJECT
        System.out.println();


        System.out.print("Qual a porcentagem para aumentar o salario? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Atualização de dados %s", emp);

        sc.close();
    }
}
