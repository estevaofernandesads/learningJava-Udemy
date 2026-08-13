package org.example.Projects.Studant;

public class Studant {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calNota(){
        return nota1 + nota2 + nota3;
    }

    public double faltando(){
        if (calNota() >= 60.00){
            return  0.0;
        } else {
           return 60 - calNota();
        }
    }

    public String toString(){
        if (faltando() == 0){
            return "Pass";
        } else {
            return String.format("Failed %n Missing %.2f Points", faltando());
        }
    }

}