package org.example.Lessons.L001_L010;

import java.util.Scanner;

public class L004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // CAPTURES WHAT IS BEING TYPED

        String x;
        int z;
        double y;
        char w;

        x = sc.next();
        z = sc.nextInt();
        y = sc.nextDouble();
        w = sc.next().charAt(0); // SELECT WHAT IS BEING TYPED BUT ONLY CHARACTER IN THE SLOT

        System.out.println(x);
        System.out.println(z);
        System.out.println(y);
        System.out.println(w);

        sc.close();
    }
}
