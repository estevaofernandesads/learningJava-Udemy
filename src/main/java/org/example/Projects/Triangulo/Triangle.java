package org.example.Projects.Triangulo;

public class Triangle {

    public double a;  // ATTRIBUTES
    public double b;
    public double c;

    public double area(){  // METHOD, YOU CAN USE VOID IF THERE IS NO RETURN VALUE
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
