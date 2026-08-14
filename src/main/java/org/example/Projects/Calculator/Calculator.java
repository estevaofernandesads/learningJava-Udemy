package org.example.Projects.Calculator;

public class Calculator {

    public final double PI = 3.14159;

    public double circumference(double raio){
        return 2 * PI * raio;
    }

    public double volume(double raio){
        return 4 * PI * Math.pow(raio, 3) / 3;
    }
}