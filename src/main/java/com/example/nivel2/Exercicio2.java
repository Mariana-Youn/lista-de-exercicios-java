package com.example.nivel2;

public class Exercicio2 {
    public static void main(String[] args) {

        boolean b1, b2, b3;

        b1 = true;
        b2 = false;
        b3 = true;

        boolean resultado = (b1 && b2) || b3;

        System.out.println("Resultado: " + resultado);
    }
}