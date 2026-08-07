package org.example.Lessons.L011_L020;

import java.util.Scanner;

public class L015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum;

        System.out.println("Informe um número: ");
        num = sc.nextInt();
        sum = 0;

        while (num != 0){         // CONDITION TRUE, EXECUTE COMMAND LINE, USUALLY USE THIS WHEN WE DON'T KNOW THE REPETITIONS NUMBER
            sum += num;
            num = sc.nextInt();
        }

        System.out.println(sum);

        sc.close();
    }
}
